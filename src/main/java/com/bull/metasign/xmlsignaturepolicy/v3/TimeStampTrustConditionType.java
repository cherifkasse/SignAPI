
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TimeStampTrustConditionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimeStampTrustConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TtsCertificateTrustTrees" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}CertificateTrustTreesType"/>
 *         &lt;element name="TtsRevReq" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}CertificateRevReqType" minOccurs="0"/>
 *         &lt;element name="CautionPeriod" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}DeltaTimeType" minOccurs="0"/>
 *         &lt;element name="SignatureTimeStampDelay" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}DeltaTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeStampTrustConditionType", propOrder = {
    "ttsCertificateTrustTrees",
    "ttsRevReq",
    "cautionPeriod",
    "signatureTimeStampDelay"
})
public class TimeStampTrustConditionType {

    @XmlElement(name = "TtsCertificateTrustTrees", required = true)
    protected CertificateTrustTreesType ttsCertificateTrustTrees;
    @XmlElement(name = "TtsRevReq")
    protected CertificateRevReqType ttsRevReq;
    @XmlElement(name = "CautionPeriod")
    protected DeltaTimeType cautionPeriod;
    @XmlElement(name = "SignatureTimeStampDelay")
    protected DeltaTimeType signatureTimeStampDelay;

    /**
     * Obtient la valeur de la propriété ttsCertificateTrustTrees.
     * 
     * @return
     *     possible object is
     *     {@link CertificateTrustTreesType }
     *     
     */
    public CertificateTrustTreesType getTtsCertificateTrustTrees() {
        return ttsCertificateTrustTrees;
    }

    /**
     * Définit la valeur de la propriété ttsCertificateTrustTrees.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateTrustTreesType }
     *     
     */
    public void setTtsCertificateTrustTrees(CertificateTrustTreesType value) {
        this.ttsCertificateTrustTrees = value;
    }

    /**
     * Obtient la valeur de la propriété ttsRevReq.
     * 
     * @return
     *     possible object is
     *     {@link CertificateRevReqType }
     *     
     */
    public CertificateRevReqType getTtsRevReq() {
        return ttsRevReq;
    }

    /**
     * Définit la valeur de la propriété ttsRevReq.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateRevReqType }
     *     
     */
    public void setTtsRevReq(CertificateRevReqType value) {
        this.ttsRevReq = value;
    }

    /**
     * Obtient la valeur de la propriété cautionPeriod.
     * 
     * @return
     *     possible object is
     *     {@link DeltaTimeType }
     *     
     */
    public DeltaTimeType getCautionPeriod() {
        return cautionPeriod;
    }

    /**
     * Définit la valeur de la propriété cautionPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link DeltaTimeType }
     *     
     */
    public void setCautionPeriod(DeltaTimeType value) {
        this.cautionPeriod = value;
    }

    /**
     * Obtient la valeur de la propriété signatureTimeStampDelay.
     * 
     * @return
     *     possible object is
     *     {@link DeltaTimeType }
     *     
     */
    public DeltaTimeType getSignatureTimeStampDelay() {
        return signatureTimeStampDelay;
    }

    /**
     * Définit la valeur de la propriété signatureTimeStampDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link DeltaTimeType }
     *     
     */
    public void setSignatureTimeStampDelay(DeltaTimeType value) {
        this.signatureTimeStampDelay = value;
    }

}
