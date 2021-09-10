
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.signserver.sigservices.v1_3.WSSignatureOperation;


/**
 * 
 *     			Request the creation of a signature key pair (and
 *     			associated certificate) for the specified signer from a
 *     			previously in HSM generated Key Pair. The generated key pair
 *     			must be constituted of two token objects having the specified ckaid
 *     			(one public key and the associated private key).
 *     			Upon successful completion, the signature key
 *     			will be protected by the signature secret.
 *     		
 * 
 * <p>Classe Java pour WSCreateSignatureKeyCertFromKeyPair complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSCreateSignatureKeyCertFromKeyPair">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}WSSignatureOperation">
 *       &lt;attribute name="keyPairCkaId" use="required" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *       &lt;attribute name="signatureKeyId" use="required" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}SignatureKeyId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCreateSignatureKeyCertFromKeyPair")
public class WSCreateSignatureKeyCertFromKeyPair
    extends WSSignatureOperation
{

    @XmlAttribute(name = "keyPairCkaId", required = true)
    protected byte[] keyPairCkaId;
    @XmlAttribute(name = "signatureKeyId", required = true)
    protected String signatureKeyId;

    /**
     * Obtient la valeur de la propriété keyPairCkaId.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyPairCkaId() {
        return keyPairCkaId;
    }

    /**
     * Définit la valeur de la propriété keyPairCkaId.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setKeyPairCkaId(byte[] value) {
        this.keyPairCkaId = value;
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
