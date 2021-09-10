
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.signserver.sigservices.v1_3.WSSignatureOperation;


/**
 * <p>Classe Java pour WSDepositCertificateForSignatureKey complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSDepositCertificateForSignatureKey">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}WSSignatureOperation">
 *       &lt;attribute name="signatureKeyId" use="required" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}SignatureKeyId" />
 *       &lt;attribute name="x509Certificate" use="required" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDepositCertificateForSignatureKey")
public class WSDepositCertificateForSignatureKey
    extends WSSignatureOperation
{

    @XmlAttribute(name = "signatureKeyId", required = true)
    protected String signatureKeyId;
    @XmlAttribute(name = "x509Certificate", required = true)
    protected byte[] x509Certificate;

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
     * Obtient la valeur de la propriété x509Certificate.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getX509Certificate() {
        return x509Certificate;
    }

    /**
     * Définit la valeur de la propriété x509Certificate.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setX509Certificate(byte[] value) {
        this.x509Certificate = value;
    }

}
