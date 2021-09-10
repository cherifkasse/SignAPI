package net.gainde2000.cf;

import java.lang.reflect.Proxy;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;

public class UtilConnection {
	  public static final void setupTLS(Object service, KeyStore keyStore, String keyPass, KeyStore trustedStore)
			    throws GeneralSecurityException
			  {
			    if (keyStore == null) {
			      throw new IllegalArgumentException("The key store cannot be null.");
			    }
			    if ((keyPass == null) || (keyPass.isEmpty())) {
			      throw new IllegalArgumentException("The key store's password cannot be null or empty.");
			    }
			    if (trustedStore == null) {
			      throw new IllegalArgumentException("The trusted store cannot be null.");
			    }
			    KeyManager[] myKeyManagers = getKeyManagers(keyStore, keyPass);
			    TrustManager[] myTrustStoreKeyManagers = getTrustManagers(trustedStore);
			    
			    setupTLS(service, myKeyManagers, myTrustStoreKeyManagers);
			  }
			  
			  public static final void setupTLS(Object service, KeyManager[] p_keyManager, TrustManager[] p_trustedManager)
			  {
			    if (service == null) {
			      throw new IllegalArgumentException("The service object cannot be null.");
			    }
			    if (p_keyManager == null) {
			      throw new IllegalArgumentException("The key store cannot be null.");
			    }
			    if (p_trustedManager == null) {
			      throw new IllegalArgumentException("The trusted store cannot be null.");
			    }
			    if (!Proxy.class.isAssignableFrom(service.getClass())) {
			      throw new IllegalArgumentException("The given service object is not a proxy instance.");
			    }
			    HTTPConduit httpConduit = (HTTPConduit)ClientProxy.getClient(service).getConduit();
			    
			    TLSClientParameters tlsCP = new TLSClientParameters();
			    tlsCP.setKeyManagers(p_keyManager);
			    tlsCP.setTrustManagers(p_trustedManager);
			    
			    httpConduit.setTlsClientParameters(tlsCP);
			  }
			  
			  private static TrustManager[] getTrustManagers(KeyStore trustStore)
			    throws GeneralSecurityException
			  {
			    String alg = KeyManagerFactory.getDefaultAlgorithm();
			    TrustManagerFactory fac = TrustManagerFactory.getInstance(alg);
			    fac.init(trustStore);
			    return fac.getTrustManagers();
			  }
			  
			  private static KeyManager[] getKeyManagers(KeyStore keyStore, String keyPassword)
			    throws GeneralSecurityException
			  {
			    String alg = KeyManagerFactory.getDefaultAlgorithm();
			    char[] keyPass = keyPassword != null ? keyPassword.toCharArray() : null;
			    KeyManagerFactory fac = KeyManagerFactory.getInstance(alg);
			    fac.init(keyStore, keyPass);
			    return fac.getKeyManagers();
			  }
}
