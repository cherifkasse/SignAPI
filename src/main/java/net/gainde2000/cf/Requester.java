package net.gainde2000.cf;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.gainde2000.cf.entity.Utilisateur;

public class Requester {
	Logger logger;
	
	public Requester() {
		//System.setProperty("log4j.configurationFile","D:\\workspace\\Lib_RASign\\resources\\log4j2.config");
		logger = LogManager.getRootLogger();
		logger.trace("Configuration File Defined To Be :: "+System.getProperty("log4j.configurationFile"));
		
	}
	
	public String CreateUser(Utilisateur user_current) {
		String resp="";
		Utilities usi=new Utilities();
		// Encode data on your side using BASE64
		byte[] bytesEncoded = Base64.encodeBase64(user_current.getActivation_Code().getBytes());
		String encodValue= new String(bytesEncoded);
		/*********
		// Decode data on other side, by processing encoded data
		byte[] valueDecoded = Base64.decodeBase64(bytesEncoded);
		System.out.println("Decoded value is " + new String(valueDecoded));
		******/
        StringBuilder reqQ1 = new StringBuilder();
        reqQ1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"")        
        .append("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema-instance\"")
        .append("xmlns:signserverext=\"http://www.bull.security.com/SignServer/extensions/v1.3.0/\"")
        .append("xmlns:coreadmin=\"http://www.bull.security.com/Server/coreAdmin/v1.3.0/\"")
        .append("xmlns:coreservices=\"http://www.bull.security.com/Server/coreServices/v1.3.0/\"")
        .append("xmlns:admin=\"http://www.bull.security.com/Server/admin/v1.3.0/\">")
        .append("<soapenv:Header/>")
        .append("<soapenv:Body>")
        .append("<admin:createUser>")
        .append("<admin:parameter xsd:type=\"coreadmin:UserSpecification\" name=\""+user_current.getPrenom_Nom()+"\">")
        .append("<roles xsd:type=\"signserverext:Signer\">")
        .append("<signserverext:activationSecret xsd:type=\"coreservices:PassphraseActivationSecret\">")
        .append("<coreservices:bytes>"+encodValue+"</coreservices:bytes>")
        .append("</signserverext:activationSecret>")
        .append("</roles>")
        .append("<credentials xsd:type=\"coreadmin:PasswordWrapper\" passwordHash=\"XohImNooBHFR0OVvjcYpJ3NgPQ1qq73WKhHvch0VQtg=\" hashAlgo=\"SHA-256\"/>")     
        .append("<trustedApplications xsd:type=\"coreadmin:ApplicationReference\" applicationId=\"13\"/>")
        .append("<trustedApplications xsd:type=\"coreadmin:ApplicationReference\" applicationId=\""+user_current.getTrustedApplication()+"\"/>")
        .append("</admin:parameter>")
        .append("</admin:createUser>")
        .append("</soapenv:Body>")
        .append("</soapenv:Envelope>");
		
        try {
			resp=Utilities.Envoi_SoapRequest("https://signserver.btrust360.com:50000/servlets/signserver/com.bull.security.coreserver.ws.admin/services/AdminSOAP?wsdl", reqQ1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
		return resp;
	}
	
	public String Generate_SignatureKey(Utilisateur user_current) {
		String resp="";
		// Encode data on your side using BASE64
		byte[] bytesEncoded = Base64.encodeBase64(user_current.getActivation_Code().getBytes());
		String encodValue= new String(bytesEncoded);

        StringBuilder reqQ1 = new StringBuilder();
        reqQ1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"");
        reqQ1.append("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema-instance\"");
        reqQ1.append("xmlns:coreServices=\"http://www.bull.security.com/Server/coreServices/v1.3.0/\"");
        reqQ1.append("xmlns:adminSig=\"http://www.bull.security.com/SignServer/adminSig/v1.3.0/\"") ;
        reqQ1.append("xmlns:sigServices=\"http://www.bull.security.com/SignServer/sigServices/v1.3.0/\">");
        reqQ1.append("<soapenv:Header/>");
        reqQ1.append("<soapenv:Body>");
        reqQ1.append("<adminSig:createSkcFProfile signatureKeyId=\""+user_current.getSignature_Key()+"\" inDelegationOf=\""+user_current.getDelegationId()+"\">");
        reqQ1.append("<sigServices:signatureSecret xsd:type=\"coreServices:PassphraseActivationSecret\">");
        reqQ1.append("<coreServices:bytes>"+encodValue+"</coreServices:bytes>");
        reqQ1.append("</sigServices:signatureSecret>");
        reqQ1.append("<adminSig:signatureKeyGenerationProfile xsd:type=\"adminSig:SkGenerationProfileReference\" skgProfileId=\"27358\"/>");
        reqQ1.append("</adminSig:createSkcFProfile>");
        reqQ1.append("</soapenv:Body>");
        reqQ1.append("</soapenv:Envelope>");
          		
        try {
			resp=Utilities.Envoi_SoapRequest("https://signserver.btrust360.com:50000/servlets/signserver/com.bull.security.signserver.ws.adminsig/services/adminSigSOAP?wsdl", reqQ1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
		return resp;
	}
	
	public String Create_AssociatedCertificate(Utilisateur user_current) {
		String resp="";
		// Encode data on your side using BASE64
		byte[] bytesEncoded = Base64.encodeBase64(user_current.getActivation_Code().getBytes());
		String encodValue= new String(bytesEncoded);

        StringBuilder reqQ1 = new StringBuilder();
        reqQ1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"")
              .append("xmlns:v1=\"http://www.bull.security.com/SignServer/adminSig/v1.3.0/\"")
              .append("xmlns:ns2=\"http://www.bull.security.com/SignServer/sigServices/v1.3.0/\"")
              .append("xmlns:ns3=\"http://www.bull.security.com/Server/coreServices/v1.3.0/\">")
              .append("<soapenv:Header/>")
              .append("<soapenv:Body>")
              .append("<v1:requestCertForSkc signatureKeyId=\""+user_current.getSignature_Key()+"\" inDelegationOf=\""+user_current.getDelegationId()+"\">")
              .append("<ns2:signatureSecret xsi:type=\"ns3:PassphraseActivationSecret\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">")
              .append("<ns3:bytes>"+encodValue+"</ns3:bytes>")
              .append("</ns2:signatureSecret>")
              .append("<v1:certRequestParameters xsi:type=\"v1:SCEPRequestParameters\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"/>")
              .append("</v1:requestCertForSkc>")
              .append("</soapenv:Body>")
              .append("</soapenv:Envelope>");
          		
        try {
			resp=Utilities.Envoi_SoapRequest("https://signserver.btrust360.com:50000/servlets/signserver/com.bull.security.signserver.ws.adminsig/services/adminSigSOAP?wsdl", reqQ1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
		return resp;
	}
	  
	public String DeleteUser(Utilisateur user_current) {
		String resp="";
		
        StringBuilder reqQ1 = new StringBuilder();
        reqQ1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v1=\"http://www.bull.security.com/Server/admin/v1.3.0/\">")
        .append("<soapenv:Header/>")
        .append("<soapenv:Body>")
        .append("<v1:deleteUser userId=\""+user_current.getDelegationId()+"\"/>")
        .append("</soapenv:Body>")
        .append("</soapenv:Envelope>");
          		
        try {
			resp=Utilities.Envoi_SoapRequest("https://signserver.btrust360.com:50000/servlets/signserver/com.bull.security.coreserver.ws.admin/services/AdminSOAP?wsdl", reqQ1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
		return resp;
	}
	
	public String Signature_DetacheePDF(Utilisateur user_current,String hashBase64String)
	{		
		String resp="";
		// Encode data on your side using BASE64
		byte[] bytesEncoded = Base64.encodeBase64(user_current.getActivation_Code().getBytes());
		String encodValue= new String(bytesEncoded);
		
        StringBuilder reqQ1 = new StringBuilder();
        reqQ1.append("<soapenv:Envelope \r\n")
        		.append("xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"\r\n")
        		.append("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n" )
        		.append("xmlns:coreServices=\"http://www.bull.security.com/Server/coreServices/v1.3.0/\"\r\n") 
        		.append("xmlns:sigOps=\"http://www.bull.security.com/SignServer/sigOps/v1.3.0/\" \r\n") 
        		.append("xmlns:sigServices=\"http://www.bull.security.com/SignServer/sigServices/v1.3.0/\">\r\n") 
        		.append("   <soapenv:Header/>\r\n") 
        		.append("   <soapenv:Body>\r\n") 
        		.append("      <sigOps:sigDoc inDelegationOf=\""+user_current.getDelegationId()+"\" includeVerificationReport=\"false\">\r\n") 
        		.append("         <sigServices:signatureSecret xsd:type=\"coreServices:PassphraseActivationSecret\">\r\n") 
        		.append("            <coreServices:bytes>"+encodValue+"</coreServices:bytes>\r\n") 
        		.append("         </sigServices:signatureSecret>\r\n")
        		.append("         <sigOps:signatureKeyId>"+user_current.getSignature_Key()+"</sigOps:signatureKeyId>\r\n") 
        		.append("         <sigOps:signatureProfile>\r\n") 
        		.append("            <sigOps:profile>\r\n")
        		.append("            	<sigServices:signaturePolicyOid>1.0.26.6.2016.4</sigServices:signaturePolicyOid>\r\n" ) 
        		.append("               <sigServices:attachment>DETACHED</sigServices:attachment>\r\n")
        		.append("               <sigServices:format>PADES_EPES</sigServices:format>\r\n" ) 
        		.append("               <sigServices:augmentation>T</sigServices:augmentation>\r\n")
        		.append("               <sigServices:signatureAlgoId>1.2.840.113549.1.1.11</sigServices:signatureAlgoId>\r\n")
        		.append("            </sigOps:profile>\r\n") 
        		.append("         </sigOps:signatureProfile>\r\n" ) 
        		.append("         <sigOps:document>\r\n")
        		.append("            <sigOps:docHash>"+hashBase64String+"</sigOps:docHash>\r\n") 
        		.append("         </sigOps:document>\r\n") 
        		.append("      </sigOps:sigDoc>\r\n") 
        		.append("   </soapenv:Body>\r\n") 
        		.append("</soapenv:Envelope>");
          		
        try {
			resp=Utilities.Envoi_SoapRequest("https://signserver.btrust360.com:8443/servlets/signserver/com.bull.security.signserver.ws.sigops/services/sigOpsSOAP?wsdl", reqQ1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
		return resp;
	}
}
