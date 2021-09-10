
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.PassphraseActivationSecret;
import com.security.bull.signserver.sigservices.v1_3.WSSignatureOperation;


/**
 * 
 *     			Request the creation of a signature key pair (and
 *     			associated certificate) for the specified signer from a
 *     			previously deposited Key-Certificate association
 *     			(PKCS#12). Upon successful completion, the signature key
 *     			will be protected by the signature secret.
 *     		
 * 
 * <p>Classe Java pour WSCreateSignatureKeyCertFromPkcs12 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSCreateSignatureKeyCertFromPkcs12">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}WSSignatureOperation">
 *       &lt;sequence>
 *         &lt;element name="p12TransportPassword" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}PassphraseActivationSecret"/>
 *       &lt;/sequence>
 *       &lt;attribute name="p12Id" use="required" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *       &lt;attribute name="signatureKeyId" use="required" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}SignatureKeyId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCreateSignatureKeyCertFromPkcs12", propOrder = {
    "p12TransportPassword"
})
public class WSCreateSignatureKeyCertFromPkcs12
    extends WSSignatureOperation
{

    @XmlElement(required = true)
    protected PassphraseActivationSecret p12TransportPassword;
    @XmlAttribute(name = "p12Id", required = true)
    protected String p12Id;
    @XmlAttribute(name = "signatureKeyId", required = true)
    protected String signatureKeyId;

    /**
     * Obtient la valeur de la propriété p12TransportPassword.
     * 
     * @return
     *     possible object is
     *     {@link PassphraseActivationSecret }
     *     
     */
    public PassphraseActivationSecret getP12TransportPassword() {
        return p12TransportPassword;
    }

    /**
     * Définit la valeur de la propriété p12TransportPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link PassphraseActivationSecret }
     *     
     */
    public void setP12TransportPassword(PassphraseActivationSecret value) {
        this.p12TransportPassword = value;
    }

    /**
     * Obtient la valeur de la propriété p12Id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP12Id() {
        return p12Id;
    }

    /**
     * Définit la valeur de la propriété p12Id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP12Id(String value) {
        this.p12Id = value;
    }

    /**
     * Obtient la valeur de la propriété signatureKeyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureKeyId() {
        return signatureKeyId;
    }

    /**
     * Définit la valeur de la propriété signatureKeyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureKeyId(String value) {
        this.signatureKeyId = value;
    }

}
