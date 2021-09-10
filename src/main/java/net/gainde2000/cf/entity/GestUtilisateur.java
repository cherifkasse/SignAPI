package net.gainde2000.cf.entity;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bull.security.coreserver.admin.CreateUserResponse;
import com.bull.security.coreserver.admin.DeleteResponse;
import com.bull.security.server.coreservices.ReturnStatusEnum;
import com.bull.security.signserver.adminsig.CreateSignatureKeyCertResponse;
import com.bull.security.signserver.sigops.SignDocResponse;
import com.security.bull.signserver.adminsig.v1_3.CertificateForSignatureKeyResponse;
import com.security.bull.signserver.adminsig.v1_3.RequestCertificateResult;


public class GestUtilisateur {
	Logger log;
	int compteur1=0;

	public GestUtilisateur() {
		System.setProperty("log4j.configurationFile", "log4j2.config");
		log = LogManager.getLogger(GestUtilisateur.class);
	}

	public String Enregistrer_Enroler(Utilisateur user) throws FileNotFoundException {
		String succes_resp = "";
		log.debug("Fonction Enregistrer_Enroler");

		log.debug("V�rification du User");
		long user_delegationid = this.RechercherUser_avec_CNI(user.getNumeroCNID(), user.getPrenom_Nom());
		//System.out.println(user_delegationid);
		if (user_delegationid > 0) {
			//succes_resp = "This user already exist in the database - " + user_delegationid;
			succes_resp = ""+user_delegationid;
		} else {
			//Rechercher_Signataire(user);
			succes_resp= Registrering_The_User(user);

			System.out.println("succes_resp: "+succes_resp);
			if(succes_resp.contains("MSIGN_SRV_STATUS_REJECTED_REQUEST : Could not create specified User")) {
				System.out.println("Rechercher_Signataire(user)");
				//Rechercher_Signataire(user);
				//Supprimer_UnUtilisateur(user);
				//succes_resp= Registrering_The_User(user);
			}
		}

		return succes_resp;
	}

	public SignDocResponse SignatureHASH_PDF(Utilisateur user, byte[] contenuASigner) {
		SignatureServeur ss = new SignatureServeur();
		try {
			SignDocResponse sdr = ss.Signer(user, contenuASigner);
			if (sdr.getReturnStatus().equals(ReturnStatusEnum. MSIGN_SRV_STATUS_SUCCESS)) {
				try {
					GestBD gd = new GestBD();
					gd.OpenConnection();
					gd.Insert_Operation(user);
					gd.CloseConnection();
				} catch (Exception e) {
					log.error(e.getMessage());
					StringWriter sw = new StringWriter();
					e.printStackTrace(new PrintWriter(sw));
					String exceptionAsString = sw.toString();
					log.error(exceptionAsString);
				}
			}
			return sdr;
		} catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | IOException e) {
			String leMessage=e.getMessage();
			log.error(leMessage);
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
		}

		return null;
	}

	public SignDocResponse Signature_PDF_ModeArchive(Utilisateur user, byte[] contenuASigner) {
		//SignatureServeur ss = new SignatureServeur();
		SignDocResponse sdr=null;
		try {
			sdr = this.SignatureLTV(user,contenuASigner);

		} catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | IOException e) {
			String leMessage=e.getMessage();
			log.error(e.getMessage());
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
			while (compteur1<2 && leMessage.contains("Le chemin de certification de la TSU est invalide")) {
				compteur1 +=1;
				sdr=null;
				try {
					sdr = this.SignatureLTV(user,contenuASigner);

				} catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | IOException e2) {
					log.error(e2.getMessage());
					StringWriter sw2 = new StringWriter();
					e.printStackTrace(new PrintWriter(sw2));
					String exceptionAsString2 = sw2.toString();
					log.error(exceptionAsString2);
				}
			}
			compteur1=0;
		}

		return sdr;
	}

	public int Sauvegarde_File(String leNom, byte[] scanCNI) {
		SignatureServeur ss = new SignatureServeur();

		try {
			return ss.Save_File(leNom, scanCNI);
		} catch (IOException e) {
			log.error(e.getMessage());
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
		}

		return 1;
	}

	public String RechercherCLE(long delegationid) {
		GestBD gd = new GestBD();
		gd.OpenConnection();
		String cle = gd.Recherche_Un_Utilisateur(delegationid);
		gd.CloseConnection();
		return cle;
	}

	public String RechercherCLE_et_Pwd(long delegationid) {
		GestBD gd = new GestBD();
		gd.OpenConnection();
		String cle = gd.Rechercher__Un_Utilisateur(delegationid);
		gd.CloseConnection();
		return cle;
	}

	public long RechercherUser_avec_CNI(String leCNI, String nomPrenom) {
		GestBD gd = new GestBD();
		gd.OpenConnection();
		long idUser = gd.Rechercher_Un_Utilisateur_avec_CNI(leCNI, nomPrenom);
		gd.CloseConnection();
		return idUser;
	}

	private SignDocResponse SignatureLTV(Utilisateur user_,byte[] contenu_ASigner) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
		SignatureServeur ss = new SignatureServeur();
		SignDocResponse sdr = ss.Signer_ArchiveMODE(user_, contenu_ASigner);
		if (sdr.getReturnStatus().equals(ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS)) {
			try {
				GestBD gd = new GestBD();
				gd.OpenConnection();
				gd.Insert_Operation(user_);
				gd.CloseConnection();
			} catch (Exception e) {
				log.error(e.getMessage());
				StringWriter sw = new StringWriter();
				e.printStackTrace(new PrintWriter(sw));
				String exceptionAsString = sw.toString();
				log.error(exceptionAsString);
			}
		} else {
			log.debug(sdr.getErrorInfo());
		}
		return sdr;
	}

	private String Supprimer_UnUtilisateur(Utilisateur user) throws FileNotFoundException {
		Registration reg = new Registration();
		System.out.println("Pr�paration � la suppression");
		DeleteResponse delresp = reg.DeletingUser(user);
		if (delresp.getReturnStatus().equals(ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS)) {
			log.debug(user.getPrenom_Nom() + " Delegation Id:" + delresp.getDeletedId() + " supprim� avec succes");
			System.out.println(
					user.getPrenom_Nom() + " Delegation Id:" + delresp.getDeletedId() + " supprim� avec succes");
		} else {
			System.out.println(delresp.getErrorInfo());
			log.error(delresp.getErrorInfo());
		}

		return delresp.getDeletedId();
	}

	private String Registrering_The_User(Utilisateur user) throws FileNotFoundException {
		Registration reg = new Registration();
		String succes_resp="";

		CreateUserResponse cret = reg.Registering(user);
		if (cret.getReturnStatus().equals(ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS)) {
			user.setDelegationId(Long.parseLong(cret.getUserId()));

			log.debug("Utilisateur Cr�e" + user.getPrenom_Nom());
			log.debug(user.getPrenom_Nom() + " Delegation Id:" + user.getDelegationId());
			System.out.println(
					"Utilisateur Cr�e" + user.getPrenom_Nom() + " Delegation Id:" + user.getDelegationId());
			System.out.println(
					"CodePin" + user.getActivation_Code() + " Cle de signature:" + user.getSignature_Key());
			System.out.println("----------------Cr�ation de la cl� de signature--------------------");
			CreateSignatureKeyCertResponse respSig = reg.SignatureKey_Creation(user);
			if (respSig.getReturnStatus().equals(ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS)) {
				log.debug("la cl� " + respSig.getSignatureKeyID() + " cr�e avec succes");
				System.out.println("la cl� " + respSig.getSignatureKeyID() + " cr�e avec succes");


				//CertificateForSignatureKeyResponse certResp = reg.RequestCertificate_for_SignatureKey(user);
				CertificateForSignatureKeyResponse certResp=null;
				int P=1;

				do {
					 certResp = reg.RequestCertificate_for_SignatureKey(user);

					 if((certResp != null) &&(!certResp.getReturnStatus().equals(com.security.bull.server.coreservices.v1_3.ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS))) {
							try {
								P=P+1;
								Thread.sleep(9000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					 }

				  } while ((certResp != null) &&(!certResp.getReturnStatus().equals(com.security.bull.server.coreservices.v1_3.ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS)) && P<4);

				if (certResp.getReturnStatus().equals(
						com.security.bull.server.coreservices.v1_3.ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS)) {

					RequestCertificateResult regcert = certResp.getCertResult();
					log.debug("status de la production du certificat " + regcert.getStatus());

					System.out.println("status de la production du certificat " + regcert.getStatus());

					if (regcert.getStatus().equals("SUCCESS")) {
						succes_resp = cret.getUserId();
						/*****************************************************
						 * Cette partie est conserv�e en commentaire pour permettre d'avoir la date
						 * d'expiration du certificat au besoin.
						 * ************************************************ byte[]
						 * cert=regcert.getX509Certificate(); CertificateFactory
						 * certificateFactory=null; try { certificateFactory =
						 * CertificateFactory.getInstance("X.509"); } catch (CertificateException e) {
						 * // TODO Auto-generated catch block e.printStackTrace(); } X509Certificate
						 * certificate=null; try { certificate =
						 * (X509Certificate)(certificateFactory.generateCertificate( new
						 * ByteArrayInputStream(cert) )); } catch (CertificateException e) { // TODO
						 * Auto-generated catch block e.printStackTrace(); }
						 * user.setDateExpiration_certificate(certificate.getNotAfter());
						 ****************************************************/
						try {
							GestBD gd = new GestBD();
							gd.OpenConnection();
							gd.Insert_Utilisateur(user);
							gd.CloseConnection();
						} catch (Exception e) {
							log.error(e.getMessage());
							StringWriter sw = new StringWriter();
							e.printStackTrace(new PrintWriter(sw));
							String exceptionAsString = sw.toString();
							log.error(exceptionAsString);
						}
					} else {
						log.error("ERROR: MSIGN_SRV_STATUS_REJECTED_REQUEST: Error while creating the Certificate. Try again" +certResp.getErrorInfo());
						succes_resp = "ERROR: MSIGN_SRV_STATUS_REJECTED_REQUEST: Error while creating the Certificate. Try again" + (certResp.getErrorInfo()+"").substring(0, 150);
						Supprimer_UnUtilisateur(user);
					}

				} else {
					System.out.println((certResp.getErrorInfo()+"").substring(0, 150));
					log.error(certResp.getErrorInfo());
					succes_resp = "ERROR: " + (certResp.getErrorInfo()+"").substring(0, 150);
					Supprimer_UnUtilisateur(user);
				}
			} else {
				log.error(respSig.getErrorInfo());
				succes_resp = "ERROR: " + (respSig.getErrorInfo()+"").substring(0, 150);
				Supprimer_UnUtilisateur(user);
			}

		} else {
			succes_resp = "ERROR: " + (cret.getErrorInfo()+"").substring(0, 150);
			log.error(cret.getErrorInfo());
		}

		return succes_resp;
	}


	private Utilisateur Rechercher_Signataire(Utilisateur usr) {
		Utilisateur current=new Utilisateur();
		Registration reg = new Registration();

		//reg.RechercherUser(usr);

		return current;
	}

	/***********************************
	 *
	 * private String Enregsiter_Supprimer(Utilisateur user) { //for tests propose
	 * Registration reg=new Registration();
	 *
	 *
	 * CreateUserResponse cret=reg.Registering(user);
	 * if(cret.getReturnStatus().equals(ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS))
	 * { user.setDelegationId(Long.parseLong(cret.getUserId()));
	 * log.debug("Utilisateur Cr�e"+ user.getPrenom_Nom());
	 * log.debug(user.getPrenom_Nom()+" Delegation Id:"+user.getDelegationId());
	 * System.out.println("Utilisateur Cr�e"+ user.getPrenom_Nom()+" Delegation
	 * Id:"+user.getDelegationId()); System.out.println("Pr�paration � la
	 * suppression"); DeleteResponse delresp=reg.DeletingUser(user);
	 * if(delresp.getReturnStatus().equals(ReturnStatusEnum.MSIGN_SRV_STATUS_SUCCESS))
	 * { log.debug(user.getPrenom_Nom()+" Delegation Id:"+delresp.getDeletedId()+"
	 * supprim� avec succes"); System.out.println(user.getPrenom_Nom()+" Delegation
	 * Id:"+delresp.getDeletedId()+" supprim� avec succes"); }else {
	 * System.out.println(delresp.getErrorInfo());
	 * log.error(delresp.getErrorInfo()); }
	 *
	 * }else { System.out.println(cret.getErrorInfo());
	 * log.error(cret.getErrorInfo()); }
	 *
	 * return "OK"; }
	 *
	 * private String Create_Common(Utilisateur utilisisateur, String attrib) {
	 * Requester req01=new Requester(); String
	 * xmlResp=req01.CreateUser(utilisisateur); log.debug(xmlResp);
	 *
	 * DocumentBuilderFactory documentBuildFactory =
	 * DocumentBuilderFactory.newInstance(); DocumentBuilder doccumentBuilder=null;
	 * Document document=null; String userID ="";
	 *
	 * try { doccumentBuilder = documentBuildFactory.newDocumentBuilder(); } catch
	 * (ParserConfigurationException e1) { // TODO Auto-generated catch block
	 * e1.printStackTrace(); } try { document = doccumentBuilder.parse(new
	 * ByteArrayInputStream(xmlResp.getBytes())); } catch (SAXException |
	 * IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 *
	 * String status =
	 * document.getDocumentElement().getAttribute("returnStatus").toString(); if
	 * (status.equals("MSIGN_SRV_STATUS_SUCCESS")) { userID =
	 * document.getDocumentElement().getAttribute(attrib).toString();; }else {
	 * userID = document.getDocumentElement().getAttribute("errorInfo").toString();;
	 * }
	 *
	 * return userID;
	 *
	 * //String nodeText = document.getChildNodes().item(0).getTextContent() ;
	 * //System.out.println(nodeText);
	 *
	 * }
	 *
	 * private String Enrol(Utilisateur utilisat) { Requester req01=new Requester();
	 * String xmlResp=req01.CreateUser(utilisat);
	 *
	 * DocumentBuilderFactory documentBuildFactory =
	 * DocumentBuilderFactory.newInstance(); DocumentBuilder doccumentBuilder=null;
	 * Document document=null; String autoEnrollOK ="";
	 *
	 * try { doccumentBuilder = documentBuildFactory.newDocumentBuilder(); } catch
	 * (ParserConfigurationException e1) { // TODO Auto-generated catch block
	 * e1.printStackTrace(); } try { document = doccumentBuilder.parse(new
	 * ByteArrayInputStream(xmlResp.getBytes())); } catch (SAXException |
	 * IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 *
	 * String status =
	 * document.getDocumentElement().getAttribute("returnStatus").toString(); if
	 * (status.equals("MSIGN_SRV_STATUS_SUCCESS")) { autoEnrollOK =
	 * document.getDocumentElement().getAttribute("status").toString(); if
	 * (autoEnrollOK.trim().equals("SUCCESS")) { String xCert =
	 * document.getDocumentElement().getAttribute("x509Certificate").toString();
	 * String cert = "-----BEGIN CERTIFICATE-----\n"+xCert+"\n-----END
	 * CERTIFICATE-----"; X509Certificate myCert=null; try { myCert =
	 * (X509Certificate)CertificateFactory .getInstance("X509")
	 * .generateCertificate( // string encoded with default charset new
	 * ByteArrayInputStream(cert.getBytes()) ); } catch (CertificateException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); }
	 * utilisat.setDateExpiration_certificate(myCert.getNotAfter());
	 * System.out.println(myCert.getNotAfter()); } }else { autoEnrollOK =
	 * document.getDocumentElement().getAttribute("errorInfo").toString();; }
	 *
	 * return autoEnrollOK; }
	 *
	 * String s;
	 **************************/

}
