
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * By specifying the requirements on the signer and
 * 				verifier, the responsabilities of the two parties can be clearly
 * 				defined to establish all the necessary information.<br/>
 * 				These
 * 				verification data rules should include :<br/>
 * 				- requirements on
 * 				the signer to provide given signed qualifying
 * 				properties (Mandatory
 * 				signed properties);<br/>
 * 				- requirements on the verifier to
 * 				check additional certificates,
 * 				CRLs, results of online certificate
 * 				status checks and timestamps.
 * 				(Mandatory unsigned
 * 				properties)<br/>
 * 
 * <p>Classe Java pour SignerAndVerifierRulesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignerAndVerifierRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignerRules" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SignerRulesType" minOccurs="0"/>
 *         &lt;element name="VerifierRules" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}VerifierRulesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerAndVerifierRulesType", propOrder = {
    "signerRules",
    "verifierRules"
})
public class SignerAndVerifierRulesType {

    @XmlElement(name = "SignerRules")
    protected SignerRulesType signerRules;
    @XmlElement(name = "VerifierRules")
    protected VerifierRulesType verifierRules;

    /**
     * Obtient la valeur de la propriété signerRules.
     * 
     * @return
     *     possible object is
     *     {@link SignerRulesType }
     *     
     */
    public SignerRulesType getSignerRules() {
        return signerRules;
    }

    /**
     * Définit la valeur de la propriété signerRules.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerRulesType }
     *     
     */
    public void setSignerRules(SignerRulesType value) {
        this.signerRules = value;
    }

    /**
     * Obtient la valeur de la propriété verifierRules.
     * 
     * @return
     *     possible object is
     *     {@link VerifierRulesType }
     *     
     */
    public VerifierRulesType getVerifierRules() {
        return verifierRules;
    }

    /**
     * Définit la valeur de la propriété verifierRules.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifierRulesType }
     *     
     */
    public void setVerifierRules(VerifierRulesType value) {
        this.verifierRules = value;
    }

}
