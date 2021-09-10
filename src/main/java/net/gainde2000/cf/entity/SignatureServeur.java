package net.gainde2000.cf.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.util.ByteArrayDataSource;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bull.security.server.coreservices.ActivationSecret;
import com.bull.security.server.coreservices.PassphraseActivationSecret;
import com.bull.security.signserver.client.api.MainService;
import com.bull.security.signserver.client.api.WSConnection;
import com.bull.security.signserver.sigops.Document;
import com.bull.security.signserver.sigops.SignDocResponse;
import com.bull.security.signserver.sigops.SignatureProfile;
import com.bull.security.signserver.sigops.WSSignDocument;
import com.bull.security.signserver.sigops.service.SigOps;
import com.bull.security.signserver.sigservices.AttachmentType;
import com.bull.security.signserver.sigservices.AugmentationType;
import com.bull.security.signserver.sigservices.SignatureFormat;
import com.bull.security.signserver.sigservices.SignatureProfileSpecification;
import com.bull.security.utils.net.MimeType;

public class SignatureServeur {
	Properties prop;
	Properties propIdentification=null;
	Logger log=null;
	
	public SignatureServeur() {
        try (InputStream input = SignatureServeur.class.getClassLoader().getResourceAsStream("config.properties")) {
        	log = LogManager.getLogger(Registration.class);
    		log.debug("SignatureServeur class constructor");
    		
            prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            //load a properties file from class path, inside static method
            prop.load(input);
            Identifier_lApplication();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	public SignDocResponse Signer(Utilisateur signataire, byte[] toSign_Content) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
		MainService<SigOps> serviceFactory=new MainService<SigOps>(prop.getProperty("server.url"), SigOps.class);

		SigOps serviceSign=serviceFactory.getService();

		// Load your keystore file
				String filename =propIdentification.getProperty(Long.toString(signataire.trustedApplication));
				FileInputStream is = null;
				try {
					is = new FileInputStream(filename);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				KeyStore myKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
				String password =propIdentification.getProperty(Long.toString(signataire.trustedApplication)+".password");

				myKeyStore.load(is, password.toCharArray());

				String filenameTrust =prop.getProperty("clienttrustore");
				FileInputStream myKeys = null;
				try {
					myKeys = new FileInputStream(filenameTrust);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Load your TrustedStore
				KeyStore myTrustedStore = KeyStore.getInstance(KeyStore.getDefaultType());
				try {
					myTrustedStore.load(myKeys, prop.getProperty("clienttrustore.password").toCharArray());
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CertificateException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					WSConnection.setupTLS(serviceSign, myKeyStore, password, myTrustedStore);
				} catch (GeneralSecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				System.out.println("WSSignDocument begining");
		        WSSignDocument aSignDoc=new WSSignDocument();
				Document doc=new Document();
				doc.setMimeType(MimeType.APPLICATION_PDF);
				//DataHandler dhContenu = new DataHandler(new javax.activation.FileDataSource("D:/ProJs/SigningServer/LS33600.pdf")); 
				//doc.setDocContent(dhContenu);
				byte[] bytesEncoded = Base64.encodeBase64(toSign_Content);
				String encodValue= new String(bytesEncoded);
				//doc.setDocHash("vei6jAgnJsRHKwyUOkeLY7tWnIMZrJIzMA2f9Bqb2EM=");
				doc.setDocHash(encodValue);
				aSignDoc.setDocument(doc);
				
				PassphraseActivationSecret codeSecret=new PassphraseActivationSecret();
				DataHandler dh=new DataHandler(signataire.getActivation_Code(), "text/plain; charset=UTF-8");

				codeSecret.setBytes(dh);
				ActivationSecret codeSecretActivationUSER=codeSecret;
				aSignDoc.setSignatureSecret(codeSecretActivationUSER); //code d'activation de l'utilisateur: code pin
				aSignDoc.setInDelegationOf(""+signataire.getDelegationId()+""); //Identification de l'utilisateur qui va effectuer la signature
				aSignDoc.setSignatureKeyId(signataire.getSignature_Key());  //Profil de cl� de l'utilisateur qui va effectuer la signature
				
				SignatureProfileSpecification sprofil=new SignatureProfileSpecification();
				sprofil.setSignaturePolicyOid("1.0.26.6.2016.1");
				sprofil.setAttachment(AttachmentType.DETACHED);
				sprofil.setFormat(SignatureFormat.PADES_EPES);
				sprofil.setAugmentation(AugmentationType.T);
				sprofil.setSignatureAlgoId("1.2.840.113549.1.1.11");
				
				SignatureProfile sP=new SignatureProfile();
				sP.setProfile(sprofil);
				
				aSignDoc.setSignatureProfile(sP);
				

				System.out.println("signDocument call");
		        SignDocResponse res=serviceSign.signDocument(aSignDoc);
		        return res;
		        				

	}
	
	public SignDocResponse Signer_ArchiveMODE(Utilisateur signataire, byte[] toSign_Content) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
		
		MainService<SigOps> serviceFactory=new MainService<SigOps>(prop.getProperty("server.url"), SigOps.class);

		SigOps serviceSign=serviceFactory.getService();

		// Load your keystore file
				String filename =propIdentification.getProperty(Long.toString(signataire.trustedApplication));
				FileInputStream is = null;
				try {
					is = new FileInputStream(filename);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				KeyStore myKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
				String password =propIdentification.getProperty(Long.toString(signataire.trustedApplication)+".password");

				myKeyStore.load(is, password.toCharArray());

				String filenameTrust =prop.getProperty("clienttrustore");
				FileInputStream myKeys = null;
				try {
					myKeys = new FileInputStream(filenameTrust);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Load your TrustedStore
				KeyStore myTrustedStore = KeyStore.getInstance(KeyStore.getDefaultType());
				try {
					myTrustedStore.load(myKeys, prop.getProperty("clienttrustore.password").toCharArray());
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CertificateException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					WSConnection.setupTLS(serviceSign, myKeyStore, password, myTrustedStore);
				} catch (GeneralSecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				System.out.println("WSSignDocument begining");
		        WSSignDocument aSignDoc=new WSSignDocument();
				Document doc=new Document();
				doc.setMimeType(MimeType.APPLICATION_PDF);
				//DataHandler dhContenu = new DataHandler(new javax.activation.FileDataSource("D:/ProJs/SigningServer/LS33600.pdf")); 
				//doc.setDocContent(dhContenu);

				DataSource dataSource = new ByteArrayDataSource(toSign_Content, "application/pdf");
				DataHandler dataHandler = new DataHandler(dataSource);
				doc.setDocContent(dataHandler);
				aSignDoc.setDocument(doc);
				
				PassphraseActivationSecret codeSecret=new PassphraseActivationSecret();
				DataHandler dh=new DataHandler(signataire.getActivation_Code(), "text/plain; charset=UTF-8");

				codeSecret.setBytes(dh);
				ActivationSecret codeSecretActivationUSER=codeSecret;
				aSignDoc.setSignatureSecret(codeSecretActivationUSER); //code d'activation de l'utilisateur: code pin
				aSignDoc.setInDelegationOf(""+signataire.getDelegationId()+""); //Identification de l'utilisateur qui va effectuer la signature
				aSignDoc.setSignatureKeyId(signataire.getSignature_Key());  //Profil de cl� de l'utilisateur qui va effectuer la signature
				
				SignatureProfileSpecification sprofil=new SignatureProfileSpecification();
				sprofil.setSignaturePolicyOid("1.0.26.6.2016.1");
				sprofil.setAttachment(AttachmentType.ENVELOPED);
				sprofil.setFormat(SignatureFormat.PADES_EPES);
				sprofil.setAugmentation(AugmentationType.LTV);
				sprofil.setSignatureAlgoId("1.2.840.113549.1.1.11");
				
				SignatureProfile sP=new SignatureProfile();
				sP.setProfile(sprofil);
				
				aSignDoc.setSignatureProfile(sP);
				

				System.out.println("signDocument call");
		        SignDocResponse res=serviceSign.signDocument(aSignDoc);
		        
		        return res;	
		        
		        /*********
		        if(res.getReturnStatus().equals(ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS)) {
		        	DocContent docSigne=res.getSignatureContent();
		        	javax.activation.DataHandler FichierSigne=docSigne.getBytes();
		        	final InputStream in = FichierSigne.getInputStream();
		        	retVal=org.apache.commons.io.IOUtils.toByteArray(in);
		        }
		         *********/
			

	}
	
			public int Save_File(String nom_Fichier, byte[] toSaveFile) throws IOException {
				String s1= prop.getProperty("lien.sauvegarde");
				FileUtils.writeByteArrayToFile(new File(s1+nom_Fichier), toSaveFile);

				return 0;
			}
	
			private void Identifier_lApplication() {
		        try (InputStream input = new FileInputStream(prop.getProperty("identification.application"))) {

		            propIdentification = new Properties();

		            //load a properties file from class path, inside static method
		            propIdentification.load(input);

		        } catch (IOException ex) {
		            ex.printStackTrace();
		            log.error(ex);
		        }
			}
			
}
