package net.gainde2000.cf;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

import net.gainde2000.cf.entity.SignatureServeur;


public class Utilities {
	static Properties prop;
	
	public Utilities() {
        try (InputStream input = SignatureServeur.class.getClassLoader().getResourceAsStream("config.properties")) {

            prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            //load a properties file from class path, inside static method
            prop.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	
	public static String Envoi_SoapRequest(String httpRequestURL, String requestXmlParam) throws IOException {

		//local variables
		URL url = null;
		HttpsURLConnection httpURLConnection = null;
		OutputStreamWriter outputStreamWriter = null;
		String responseMessageFromServer = null;
		String responseXML = null; 

		//Load your keystore file
		String filename =prop.getProperty("clientjks");
		FileInputStream is = null;
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
		String password =prop.getProperty("clientjks.password");

		try {
			myKeyStore.load(is, password.toCharArray());
		} catch (CertificateException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String filenameTrust =prop.getProperty("clienttrustore");
		FileInputStream myKeys = null;
		try {
			myKeys = new FileInputStream(filenameTrust);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Load your TrustedStore
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
			//TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CertificateException e1) {
			//TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		
		try {   
			
			// set basic request parameters
			url = new URL(httpRequestURL);
			httpURLConnection = (HttpsURLConnection) url.openConnection();   
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setRequestMethod("POST");
		    //httpURLConnection.setRequestProperty("SOAPAction", "");
			httpURLConnection.setRequestProperty("Content-Type", "text/xml;charset=\"utf-8\"");
			httpURLConnection.setRequestProperty("Accept", "text/xml");
			
			KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
			kmf.init(myKeyStore, password.toCharArray());
			
			TrustManagerFactory tmf = TrustManagerFactory.getInstance("X509");
			tmf.init(myTrustedStore);
			
			SSLContext context = SSLContext.getInstance("TLS");
			context.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
			SSLSocketFactory sslSocketFactory = context.getSocketFactory();
			
			httpURLConnection.setSSLSocketFactory(sslSocketFactory);
			
			// write request XML to the HTTP request
			outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
			outputStreamWriter.write(requestXmlParam);
			outputStreamWriter.flush();

			System.out.println("Response code: " + httpURLConnection.getResponseCode());
			if (httpURLConnection.getResponseCode() == 200) {

				responseMessageFromServer = httpURLConnection.getResponseMessage();
				System.out.println("ResponseMessageFromServer: " + responseMessageFromServer);
				responseXML = getResponseXML(httpURLConnection);
			} 
		}
		catch (IOException ioex) {
			ioex.printStackTrace();
			throw ioex;
		} catch (UnrecoverableKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			// finally close all operations
			outputStreamWriter.close();
			httpURLConnection.disconnect();
		}
		return responseXML; 
	}
	
	/**
	 * This method is used to get response XML from the HTTP POST request
	 * 
	 * @param httpURLConnection
	 * @return stringBuffer.toString()
	 * @throws IOException
	 */
	private static String getResponseXML(HttpURLConnection httpURLConnection) throws IOException {

		// local variables
		StringBuffer stringBuffer = new StringBuffer();
		BufferedReader bufferedReader = null;
		InputStreamReader inputStreamReader = null;
		String readSingleLine = null;

		try{
			// read the response stream AND buffer the result into a StringBuffer
			inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
			bufferedReader = new BufferedReader(inputStreamReader);

			// reading the XML response content line BY line 
			while ((readSingleLine = bufferedReader.readLine()) != null) {
				stringBuffer.append(readSingleLine);
			}
		}
		catch (IOException ioex) {
			ioex.printStackTrace();
			throw ioex;
		}
		finally{
			// finally close all operations
			bufferedReader.close();
			httpURLConnection.disconnect();
		}
		return stringBuffer.toString();
	}
	
	
}
