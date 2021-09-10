
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * <p>Classe Java pour CsrForSignatureKeyResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CsrForSignatureKeyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;attribute name="signatureKeyId" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}SignatureKeyId" />
 *       &lt;attribute name="publicKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *       &lt;attribute name="csr" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CsrForSignatureKeyResponse")
public class CsrForSignatureKeyResponse
    extends WSResponse
{

    @XmlAttribute(name = "signatureKeyId")
    protected String signatureKeyId;
    @XmlAttribute(name = "publicKey")
    protected byte[] publicKey;
    @XmlAttribute(name = "csr")
    protected byte[] csr;

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

    /**
     * Obtient la valeur de la propriété publicKey.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPublicKey() {
        return publicKey;
    }

    /**
     * Définit la valeur de la propriété publicKey.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPublicKey(byte[] value) {
        this.publicKey = value;
    }

    /**
     * Obtient la valeur de la propriété csr.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCsr() {
        return csr;
    }

    /**
     * Définit la valeur de la propriété csr.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCsr(byte[] value) {
        this.csr = value;
    }

}
