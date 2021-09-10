
package com.security.bull.signserver.sigservices.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.ActivationSecret;
import com.security.bull.server.coreservices.v1_3.WSOperation;
import com.security.bull.signserver.adminsig.v1_3.WSCreateSignatureKeyCertFromKeyPair;
import com.security.bull.signserver.adminsig.v1_3.WSCreateSignatureKeyCertFromPkcs12;
import com.security.bull.signserver.adminsig.v1_3.WSCreateSignatureKeyCertFromProfile;
import com.security.bull.signserver.adminsig.v1_3.WSDeleteSignatureKey;
import com.security.bull.signserver.adminsig.v1_3.WSDepositCertificateForSignatureKey;
import com.security.bull.signserver.adminsig.v1_3.WSGenerateCsrForSignatureKey;
import com.security.bull.signserver.adminsig.v1_3.WSRequestCertificateForSignatureKey;
import com.security.bull.signserver.adminsig.v1_3.WSUpdateSignatureSecret;


/**
 * A generic signature operation. It must provide a signature activation secret.
 * 
 * <p>Classe Java pour WSSignatureOperation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSSignatureOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;sequence>
 *         &lt;element name="signatureSecret" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ActivationSecret"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSignatureOperation", propOrder = {
    "signatureSecret"
})
@XmlSeeAlso({
    WSDeleteSignatureKey.class,
    WSUpdateSignatureSecret.class,
    WSCreateSignatureKeyCertFromKeyPair.class,
    WSGenerateCsrForSignatureKey.class,
    WSCreateSignatureKeyCertFromPkcs12 .class,
    WSRequestCertificateForSignatureKey.class,
    WSCreateSignatureKeyCertFromProfile.class,
    WSDepositCertificateForSignatureKey.class
})
public abstract class WSSignatureOperation
    extends WSOperation
{

    @XmlElement(required = true)
    protected ActivationSecret signatureSecret;

    /**
     * Obtient la valeur de la propriété signatureSecret.
     * 
     * @return
     *     possible object is
     *     {@link ActivationSecret }
     *     
     */
    public ActivationSecret getSignatureSecret() {
        return signatureSecret;
    }

    /**
     * Définit la valeur de la propriété signatureSecret.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationSecret }
     *     
     */
    public void setSignatureSecret(ActivationSecret value) {
        this.signatureSecret = value;
    }

}
