package net.gainde2000.cf.entity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bull.security.coreserver.admin.CreateUserResponse;
import com.bull.security.coreserver.admin.DeleteResponse;
import com.bull.security.coreserver.admin.WSConsultUser;
import com.bull.security.coreserver.admin.WSCreateUser;
import com.bull.security.coreserver.admin.WSDeleteUser;
import com.bull.security.coreserver.admin.service.Admin;
import com.bull.security.server.coreadmin.ApplicationReference;
import com.bull.security.server.coreadmin.PasswordWrapper;
import com.bull.security.server.coreadmin.UserSpecification;
import com.bull.security.server.coreservices.ActivationSecret;
import com.bull.security.server.coreservices.PassphraseActivationSecret;
import com.bull.security.server.signserver.core.admin.ext.Signer;
import com.bull.security.signserver.adminsig.CreateSignatureKeyCertResponse;
import com.bull.security.signserver.adminsig.SkGenerationProfileReference;
import com.bull.security.signserver.adminsig.WSCreateSignatureKeyCertFromProfile;
import com.bull.security.signserver.adminsig.service.AdminSig;
import com.bull.security.signserver.client.api.MainService;
import com.bull.security.signserver.client.api.WSConnection;
import com.security.bull.server.admin.v1_3.WSListUsers;
import com.security.bull.server.coreservices.v1_3.Chain;
import com.security.bull.server.coreservices.v1_3.Constraint;
import com.security.bull.server.coreservices.v1_3.ReturnStatusEnum;
import com.security.bull.server.coreservices.v1_3.StringConstraint;
import com.security.bull.signserver.adminsig.v1_3.CertificateForSignatureKeyResponse;
import com.security.bull.signserver.adminsig.v1_3.WSRequestCertificateForSignatureKey;

import net.gainde2000.cf.Main2Service;



public class Registration {
	Properties prop=null;
	Properties propIdentification=null;
	Logger log=null;
	
	public Registration() {
		log = LogManager.getLogger(Registration.class);
		log.debug("Registration class constructor");
        try (InputStream input = Registration.class.getClassLoader().getResourceAsStream("config.properties")) {

            prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            //load a properties file from class path, inside static method
            prop.load(input);
            log.debug("Registration class constructor: prop.loaded");
            Identifier_lApplication(); //
            log.debug("Registration class constructor: Identifier_lApplication()");
            
        } catch (IOException ex) {
            ex.printStackTrace();
            log.error(ex);
        }
	}
	
	public CreateUserResponse Registering(Utilisateur nouveauUser)  {
		log.debug("Fonction Registering");
		
		
		
		MainService<Admin> serviceFactory=new MainService<Admin>(prop.getProperty("admin.url"), Admin.class);
		
		Admin serviceAdm=serviceFactory.getService();
		Initiat_Service(serviceAdm,nouveauUser); //Admin serviceAdm=serviceFactory.getService();Initialize connection
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress(prop.getProperty("admin.url"));
		factory.setServiceClass(Admin.class);
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		
				WSCreateUser cUser=new WSCreateUser();
				UserSpecification userSpec=new UserSpecification();
				userSpec.setName(nouveauUser.getPrenom_Nom());
				Signer r1=new Signer();
				//r1.setRoleNS("http://www.bull.security.com/SignServer/extensions/v1.1.0/#Signer");	
				PassphraseActivationSecret codeSecret=new PassphraseActivationSecret();
				javax.activation.DataHandler dh=new javax.activation.DataHandler(nouveauUser.getActivation_Code(), "text/plain; charset=UTF-8");
				codeSecret.setBytes(dh);
				ActivationSecret codeSecretActivationUSER=codeSecret;
				r1.setActivationSecret(codeSecretActivationUSER);
				userSpec.getRoles().add(r1);
				PasswordWrapper cred=new PasswordWrapper();
				
				
				//String passwordHASH="XohImNooBHFR0OVvjcYpJ3NgPQ1qq73WKhHvch0VQtg=";
				//byte[] valueDecoded = Base64.decodeBase64(passwordHASH.getBytes());
				
				//String passwordHASH="jZae727K08KaOmKSgOaGzww/XVqGr/PKEgIMkjrcbJI="; //123456
				MessageDigest md=null;
				try {
					md = MessageDigest.getInstance("SHA-256");
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				byte[]hashInBytes = md.digest(nouveauUser.getActivation_Code().getBytes(StandardCharsets.UTF_8));
				byte[] valueDecoded = Base64.decodeBase64(hashInBytes);
				
				//cred.setPasswordHash(nouveauUser.getActivation_Code().getBytes(StandardCharsets.UTF_8));
				cred.setPasswordHash(valueDecoded);
				cred.setHashAlgo("SHA-256");

				userSpec.getCredentials().add(cred);
				ApplicationReference appref=new ApplicationReference();
				
				if(nouveauUser.getTrustedApplication()==2384759) {
					nouveauUser.setTrustedApplication(71);
				}else if(nouveauUser.getTrustedApplication()==7985900) {
					nouveauUser.setTrustedApplication(77);
				}
				//appref.setApplicationId("13");
				//userSpec.getTrustedApplications().add(appref);
				//appref=new ApplicationReference();
				appref.setApplicationId(Long.toString(nouveauUser.getTrustedApplication()));
				userSpec.getTrustedApplications().add(appref);
				
				//cUser.setInDelegationOf("13");
				cUser.setParameter(userSpec);
				CreateUserResponse creatuResp=serviceAdm.createUser(cUser);
				//System.out.println(creatuResp.getReturnStatus());
				return creatuResp;				
	}
	
	public DeleteResponse DeletingUser(Utilisateur current_user) throws FileNotFoundException {
		MainService<Admin> serviceFactory=new MainService<Admin>(prop.getProperty("admin.url"), Admin.class);		
		
		Admin serviceAdm=serviceFactory.getService();
		Initiat_Service(serviceAdm,current_user);
		
		WSDeleteUser wsdel=new WSDeleteUser();
		//wsdel.setInDelegationOf(Long.toString(current_user.getDelegationId()));
		wsdel.setUserId(Long.toString(current_user.getDelegationId()));
		DeleteResponse delresp=serviceAdm.deleteUser(wsdel);
		return delresp;
	}
	
	/******************************************************
	public List<com.security.bull.server.coreadmin.v1_3.User> RechercherUser(Utilisateur current_user) {
		List<com.security.bull.server.coreadmin.v1_3.User> lusr=null;
		MainService<com.security.bull.server.admin.service.v1_3_0.Admin> serviceFactory=new MainService<com.security.bull.server.admin.service.v1_3_0.Admin>(prop.getProperty("admin.url"), com.security.bull.server.admin.service.v1_3_0.Admin.class);		
		
		com.security.bull.server.admin.service.v1_3_0.Admin serviceAdm=serviceFactory.getService();
		Initiat_Service(serviceAdm,current_user);
		
		WSListUsers wslist=new WSListUsers();
		Chain ch=new Chain();
		
		StringConstraint cont=new StringConstraint();
		StringConstraint cont2=new StringConstraint();
						
		cont.setValue(current_user.getPrenom_Nom());
		cont.setType(com.security.bull.server.coreservices.v1_3.StringConstraintOperator.CONTAINS);
		cont.setConstrainedElement("UserSpecification.name");
		cont2.setValue(current_user.getPrenom_Nom().toUpperCase());
		cont2.setType(com.security.bull.server.coreservices.v1_3.StringConstraintOperator.CONTAINS);
		cont2.setConstrainedElement("UserSpecification.name");

		com.security.bull.server.coreservices.v1_3.IdRange ContrId=new com.security.bull.server.coreservices.v1_3.IdRange();
		//ContrId
		
		com.security.bull.server.coreservices.v1_3.ChainLink chl=new com.security.bull.server.coreservices.v1_3.ChainLink();		
		
		chl.setBooleanOperator(com.security.bull.server.coreservices.v1_3.BooleanOperator.OR);
		
		chl.setConstraint(cont2);		
		ch.setConstraint(cont);
		
		ch.getLinks().add(chl);
		wslist.setConstraintChain(ch);
		//com.bull.security.coreserver.admin.service.Admin adm2;
		//com.security.bull.server.admin.service.v1_3_0.Admin adm3=(com.security.bull.server.admin.service.v1_3_0.Admin) serviceFactory.getService();
		//adm3.listUsers(wslist);
		
		com.security.bull.server.admin.v1_3.ListUsersResponse listresp=serviceAdm.listUsers(wslist);
		
		if(listresp.getReturnStatus().compareTo(ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS)==0) {
			lusr=listresp.getUsers();
			com.security.bull.server.coreadmin.v1_3.UserSpecification usr=new com.security.bull.server.coreadmin.v1_3.UserSpecification();
			for (com.security.bull.server.coreadmin.v1_3.User userS : lusr) {
				usr=(com.security.bull.server.coreadmin.v1_3.UserSpecification) userS;
				
				//log.debug("usr.getName():"+usr.getName());
				//log.debug("usr.getTrustedApplications().toArray().toString():"+usr.getTrustedApplications().toArray().toString());
				//log.debug("usr.getName():"+usr.getName());
				
				System.out.println("usr.getName():"+usr.getName());
				System.out.println("usr.getTrustedApplications().toArray().toString():"+usr.getTrustedApplications().toArray().toString());
				System.out.println("usr.getName():"+usr.getName());
				
			}
		}
		
		return lusr;
	}
	
	*******************************************/
	
	
	public CreateSignatureKeyCertResponse SignatureKey_Creation(Utilisateur current_user) throws FileNotFoundException {
		MainService<AdminSig> serviceFactory=new MainService<AdminSig>(prop.getProperty("adminsig.url"), AdminSig.class);
		
		Identifier_lApplication(); //
		
		AdminSig servAdmSig=serviceFactory.getService();
		Initiat_Service(servAdmSig,current_user);
		
		WSCreateSignatureKeyCertFromProfile sigkey=new WSCreateSignatureKeyCertFromProfile();
		sigkey.setSignatureKeyId(current_user.getSignature_Key());
		sigkey.setInDelegationOf(Long.toString(current_user.getDelegationId()));
		
		PassphraseActivationSecret codeSecret=new PassphraseActivationSecret();
		javax.activation.DataHandler dh=new javax.activation.DataHandler(current_user.getActivation_Code(), "text/plain; charset=UTF-8");
		codeSecret.setBytes(dh);
		ActivationSecret codeSecretActivationUSER=codeSecret;
		
		sigkey.setSignatureSecret(codeSecretActivationUSER);
		SkGenerationProfileReference sk= new SkGenerationProfileReference();
		sk.setSkgProfileId(prop.getProperty("SkgProfileId"));
		sigkey.setSignatureKeyGenerationProfile(sk);
		
		CreateSignatureKeyCertResponse sigkeyresp=servAdmSig.createSignatureKeyFromProfile(sigkey);
		return sigkeyresp;
		
	}
	
	public CertificateForSignatureKeyResponse RequestCertificate_for_SignatureKey(Utilisateur current_user) throws FileNotFoundException {
		Main2Service<com.security.bull.signserver.adminsig.service.v1_3_0.AdminSig> serviceFactory=new Main2Service<com.security.bull.signserver.adminsig.service.v1_3_0.AdminSig>(prop.getProperty("adminsig.url"), com.security.bull.signserver.adminsig.service.v1_3_0.AdminSig.class);
		
		com.security.bull.signserver.adminsig.service.v1_3_0.AdminSig servAdmSig=serviceFactory.getService();

		Initiat_Service(servAdmSig,current_user);
		
		WSRequestCertificateForSignatureKey rCert4Skc=new WSRequestCertificateForSignatureKey();
		rCert4Skc.setSignatureKeyId(current_user.getSignature_Key());
		rCert4Skc.setInDelegationOf(Long.toString(current_user.getDelegationId()));
		
		com.security.bull.server.coreservices.v1_3.PassphraseActivationSecret codeSecret=new com.security.bull.server.coreservices.v1_3.PassphraseActivationSecret();
		javax.activation.DataHandler dh=new javax.activation.DataHandler(current_user.getActivation_Code(), "text/plain; charset=UTF-8");
		codeSecret.setBytes(dh);
		com.security.bull.server.coreservices.v1_3.ActivationSecret codeSecretActivationUSER=codeSecret;

		rCert4Skc.setSignatureSecret(codeSecretActivationUSER);
		com.security.bull.signserver.adminsig.v1_3.SCEPRequestParameters value=new com.security.bull.signserver.adminsig.v1_3.SCEPRequestParameters();
		rCert4Skc.setCertRequestParameters(value);
		
		CertificateForSignatureKeyResponse sigkeyresp=servAdmSig.requestCertificateForSignatureKey(rCert4Skc);
		return sigkeyresp;
		
	} 
	
	private void Initiat_Service(Object serviceAdm,Utilisateur user_en_cours)  {
	
		// Load your keystore file
		log.debug("user_en_cours.trustedApplication:"+user_en_cours.trustedApplication);
				String filename =propIdentification.getProperty(Long.toString(user_en_cours.trustedApplication));
				log.debug("filename:"+filename);
				//System.out.println("my file "+filename);
				FileInputStream is=null;
				try {
					is = new FileInputStream(filename);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				KeyStore myKeyStore=null;
				try {
					myKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
				} catch (KeyStoreException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				String password =propIdentification.getProperty(Long.toString(user_en_cours.trustedApplication)+".password");

				try {
					myKeyStore.load(is, password.toCharArray());
				} catch (NoSuchAlgorithmException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (CertificateException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				String filenameTrust =prop.getProperty("clienttrustore");
				FileInputStream myKeys = null;
				try {
					myKeys = new FileInputStream(filenameTrust);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Load your TrustedStore
				KeyStore myTrustedStore=null;
				try {
					myTrustedStore = KeyStore.getInstance(KeyStore.getDefaultType());
				} catch (KeyStoreException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					myTrustedStore.load(myKeys, prop.getProperty("clienttrustore.password").toCharArray());
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CertificateException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					WSConnection.setupTLS(serviceAdm, myKeyStore, password, myTrustedStore);
				} catch (GeneralSecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	private void Identifier_lApplication() {
		log.debug("prop.getProperty(\"identification.application\"):"+prop.getProperty("identification.application"));
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
