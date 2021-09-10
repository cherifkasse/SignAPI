
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SigningCertTrustConditionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SigningCertTrustConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignerTrustTrees" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}CertificateTrustTreesType"/>
 *         &lt;element name="SignerRevReq" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}CertificateRevReqType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SigningCertTrustConditionType", propOrder = {
    "signerTrustTrees",
    "signerRevReq"
})
public class SigningCertTrustConditionType {

    @XmlElement(name = "SignerTrustTrees", required = true)
    protected CertificateTrustTreesType signerTrustTrees;
    @XmlElement(name = "SignerRevReq")
    protected CertificateRevReqType signerRevReq;

    /**
     * Obtient la valeur de la propriété signerTrustTrees.
     * 
     * @return
     *     possible object is
     *     {@link CertificateTrustTreesType }
     *     
     */
    public CertificateTrustTreesType getSignerTrustTrees() {
        return signerTrustTrees;
    }

    /**
     * Définit la valeur de la propriété signerTrustTrees.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateTrustTreesType }
     *     
     */
    public void setSignerTrustTrees(CertificateTrustTreesType value) {
        this.signerTrustTrees = value;
    }

    /**
     * Obtient la valeur de la propriété signerRevReq.
     * 
     * @return
     *     possible object is
     *     {@link CertificateRevReqType }
     *     
     */
    public CertificateRevReqType getSignerRevReq() {
        return signerRevReq;
    }

    /**
     * Définit la valeur de la propriété signerRevReq.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateRevReqType }
     *     
     */
    public void setSignerRevReq(CertificateRevReqType value) {
        this.signerRevReq = value;
    }

}
