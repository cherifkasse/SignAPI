
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SignatureValidationPolicyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignatureValidationPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SigningPeriod" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}TimePeriodType"/>
 *         &lt;element name="CommonRules" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}CommonRulesType"/>
 *         &lt;element name="CommitmentRules" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}CommitmentRulesListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureValidationPolicyType", propOrder = {
    "signingPeriod",
    "commonRules",
    "commitmentRules"
})
public class SignatureValidationPolicyType {

    @XmlElement(name = "SigningPeriod", required = true)
    protected TimePeriodType signingPeriod;
    @XmlElement(name = "CommonRules", required = true)
    protected CommonRulesType commonRules;
    @XmlElement(name = "CommitmentRules", required = true)
    protected CommitmentRulesListType commitmentRules;

    /**
     * Obtient la valeur de la propriété signingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getSigningPeriod() {
        return signingPeriod;
    }

    /**
     * Définit la valeur de la propriété signingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setSigningPeriod(TimePeriodType value) {
        this.signingPeriod = value;
    }

    /**
     * Obtient la valeur de la propriété commonRules.
     * 
     * @return
     *     possible object is
     *     {@link CommonRulesType }
     *     
     */
    public CommonRulesType getCommonRules() {
        return commonRules;
    }

    /**
     * Définit la valeur de la propriété commonRules.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonRulesType }
     *     
     */
    public void setCommonRules(CommonRulesType value) {
        this.commonRules = value;
    }

    /**
     * Obtient la valeur de la propriété commitmentRules.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentRulesListType }
     *     
     */
    public CommitmentRulesListType getCommitmentRules() {
        return commitmentRules;
    }

    /**
     * Définit la valeur de la propriété commitmentRules.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentRulesListType }
     *     
     */
    public void setCommitmentRules(CommitmentRulesListType value) {
        this.commitmentRules = value;
    }

}
