
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommonRulesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommonRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignerAndVerifierRules" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SignerAndVerifierRulesType" minOccurs="0"/>
 *         &lt;element name="SigningCertTrustCondition" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SigningCertTrustConditionType" minOccurs="0"/>
 *         &lt;element name="TimeStampTrustCondition" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}TimeStampTrustConditionType" minOccurs="0"/>
 *         &lt;element name="AlgorithmConstraintSet" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}AlgorithmConstraintSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonRulesType", propOrder = {
    "signerAndVerifierRules",
    "signingCertTrustCondition",
    "timeStampTrustCondition",
    "algorithmConstraintSet"
})
public class CommonRulesType {

    @XmlElement(name = "SignerAndVerifierRules")
    protected SignerAndVerifierRulesType signerAndVerifierRules;
    @XmlElement(name = "SigningCertTrustCondition")
    protected SigningCertTrustConditionType signingCertTrustCondition;
    @XmlElement(name = "TimeStampTrustCondition")
    protected TimeStampTrustConditionType timeStampTrustCondition;
    @XmlElement(name = "AlgorithmConstraintSet")
    protected AlgorithmConstraintSetType algorithmConstraintSet;

    /**
     * Obtient la valeur de la propriété signerAndVerifierRules.
     * 
     * @return
     *     possible object is
     *     {@link SignerAndVerifierRulesType }
     *     
     */
    public SignerAndVerifierRulesType getSignerAndVerifierRules() {
        return signerAndVerifierRules;
    }

    /**
     * Définit la valeur de la propriété signerAndVerifierRules.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerAndVerifierRulesType }
     *     
     */
    public void setSignerAndVerifierRules(SignerAndVerifierRulesType value) {
        this.signerAndVerifierRules = value;
    }

    /**
     * Obtient la valeur de la propriété signingCertTrustCondition.
     * 
     * @return
     *     possible object is
     *     {@link SigningCertTrustConditionType }
     *     
     */
    public SigningCertTrustConditionType getSigningCertTrustCondition() {
        return signingCertTrustCondition;
    }

    /**
     * Définit la valeur de la propriété signingCertTrustCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link SigningCertTrustConditionType }
     *     
     */
    public void setSigningCertTrustCondition(SigningCertTrustConditionType value) {
        this.signingCertTrustCondition = value;
    }

    /**
     * Obtient la valeur de la propriété timeStampTrustCondition.
     * 
     * @return
     *     possible object is
     *     {@link TimeStampTrustConditionType }
     *     
     */
    public TimeStampTrustConditionType getTimeStampTrustCondition() {
        return timeStampTrustCondition;
    }

    /**
     * Définit la valeur de la propriété timeStampTrustCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeStampTrustConditionType }
     *     
     */
    public void setTimeStampTrustCondition(TimeStampTrustConditionType value) {
        this.timeStampTrustCondition = value;
    }

    /**
     * Obtient la valeur de la propriété algorithmConstraintSet.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmConstraintSetType }
     *     
     */
    public AlgorithmConstraintSetType getAlgorithmConstraintSet() {
        return algorithmConstraintSet;
    }

    /**
     * Définit la valeur de la propriété algorithmConstraintSet.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmConstraintSetType }
     *     
     */
    public void setAlgorithmConstraintSet(AlgorithmConstraintSetType value) {
        this.algorithmConstraintSet = value;
    }

}
