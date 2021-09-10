
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommitmentRulesListType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommitmentRulesListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommitmentRule" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}CommitmentRuleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentRulesListType", propOrder = {
    "commitmentRule"
})
public class CommitmentRulesListType {

    @XmlElement(name = "CommitmentRule", required = true)
    protected CommitmentRuleType commitmentRule;

    /**
     * Obtient la valeur de la propriété commitmentRule.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentRuleType }
     *     
     */
    public CommitmentRuleType getCommitmentRule() {
        return commitmentRule;
    }

    /**
     * Définit la valeur de la propriété commitmentRule.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentRuleType }
     *     
     */
    public void setCommitmentRule(CommitmentRuleType value) {
        this.commitmentRule = value;
    }

}
