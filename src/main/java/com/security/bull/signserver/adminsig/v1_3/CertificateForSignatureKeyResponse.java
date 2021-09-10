
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * <p>Classe Java pour CertificateForSignatureKeyResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CertificateForSignatureKeyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;sequence>
 *         &lt;element name="certResult" type="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}RequestCertificateResult" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="signatureKeyId" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}SignatureKeyId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateForSignatureKeyResponse", propOrder = {
    "certResult"
})
public class CertificateForSignatureKeyResponse
    extends WSResponse
{

    protected RequestCertificateResult certResult;
    @XmlAttribute(name = "signatureKeyId")
    protected String signatureKeyId;

    /**
     * Obtient la valeur de la propriété certResult.
     * 
     * @return
     *     possible object is
     *     {@link RequestCertificateResult }
     *     
     */
    public RequestCertificateResult getCertResult() {
        return certResult;
    }

    /**
     * Définit la valeur de la propriété certResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestCertificateResult }
     *     
     */
    public void setCertResult(RequestCertificateResult value) {
        this.certResult = value;
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
