
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.signserver.sigservices.v1_3.WSSignatureOperation;


/**
 * Certificate generation request to a PKI.
 * 
 * <p>Classe Java pour WSRequestCertificateForSignatureKey complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSRequestCertificateForSignatureKey">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}WSSignatureOperation">
 *       &lt;sequence>
 *         &lt;element name="certRequestParameters" type="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}CertificateRequestParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="signatureKeyId" use="required" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}SignatureKeyId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRequestCertificateForSignatureKey", propOrder = {
    "certRequestParameters"
})
public class WSRequestCertificateForSignatureKey
    extends WSSignatureOperation
{

    protected CertificateRequestParameters certRequestParameters;
    @XmlAttribute(name = "signatureKeyId", required = true)
    protected String signatureKeyId;

    /**
     * Obtient la valeur de la propriété certRequestParameters.
     * 
     * @return
     *     possible object is
     *     {@link CertificateRequestParameters }
     *     
     */
    public CertificateRequestParameters getCertRequestParameters() {
        return certRequestParameters;
    }

    /**
     * Définit la valeur de la propriété certRequestParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateRequestParameters }
     *     
     */
    public void setCertRequestParameters(CertificateRequestParameters value) {
        this.certRequestParameters = value;
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
