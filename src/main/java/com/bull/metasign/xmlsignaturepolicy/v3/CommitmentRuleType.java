
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommitmentRuleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommitmentRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelCommitmentTypes" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SelectedCommitmentTypeList"/>
 *         &lt;element name="SignerAndVerifierRules" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SignerAndVerifierRulesType" minOccurs="0"/>
 *         &lt;element name="SigningCertTrustCondition" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SigningCertTrustConditionType" minOccurs="0"/>
 *         &lt;element name="TimeStampTrustCondition" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}TimeStampTrustConditionType" minOccurs="0"/>
 *         &lt;element name="AlgorithmConstraintSet" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}AlgorithmConstraintSetType" minOccurs="0"/>
 *         &lt;element name="SignPolExtensions" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SignPolExtensionsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentRuleType", propOrder = {
    "selCommitmentTypes",
    "signerAndVerifierRules",
    "signingCertTrustCondition",
    "timeStampTrustCondition",
    "algorithmConstraintSet",
    "signPolExtensions"
})
public class CommitmentRuleType {

    @XmlElement(name = "SelCommitmentTypes", required = true)
    protected SelectedCommitmentTypeList selCommitmentTypes;
    @XmlElement(name = "SignerAndVerifierRules")
    protected SignerAndVerifierRulesType signerAndVerifierRules;
    @XmlElement(name = "SigningCertTrustCondition")
    protected SigningCertTrustConditionType signingCertTrustCondition;
    @XmlElement(name = "TimeStampTrustCondition")
    protected TimeStampTrustConditionType timeStampTrustCondition;
    @XmlElement(name = "AlgorithmConstraintSet")
    protected AlgorithmConstraintSetType algorithmConstraintSet;
    @XmlElement(name = "SignPolExtensions")
    protected SignPolExtensionsListType signPolExtensions;

    /**
     * Obtient la valeur de la propriété selCommitmentTypes.
     * 
     * @return
     *     possible object is
     *     {@link SelectedCommitmentTypeList }
     *     
     */
    public SelectedCommitmentTypeList getSelCommitmentTypes() {
        return selCommitmentTypes;
    }

    /**
     * Définit la valeur de la propriété selCommitmentTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedCommitmentTypeList }
     *     
     */
    public void setSelCommitmentTypes(SelectedCommitmentTypeList value) {
        this.selCommitmentTypes = value;
    }

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

    /**
     * Obtient la valeur de la propriété signPolExtensions.
     * 
     * @return
     *     possible object is
     *     {@link SignPolExtensionsListType }
     *     
     */
    public SignPolExtensionsListType getSignPolExtensions() {
        return signPolExtensions;
    }

    /**
     * Définit la valeur de la propriété signPolExtensions.
     * 
     * @param value
     *     allowed object is
     *     {@link SignPolExtensionsListType }
     *     
     */
    public void setSignPolExtensions(SignPolExtensionsListType value) {
        this.signPolExtensions = value;
    }

}
