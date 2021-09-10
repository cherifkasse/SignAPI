
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommitmentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommitmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommitmentIdentifier" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}ObjectIdentifierType"/>
 *         &lt;element name="Semantics" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentType", propOrder = {
    "commitmentIdentifier",
    "semantics"
})
public class CommitmentType {

    @XmlElement(name = "CommitmentIdentifier", required = true)
    protected ObjectIdentifierType commitmentIdentifier;
    @XmlElement(name = "Semantics")
    protected String semantics;

    /**
     * Obtient la valeur de la propriété commitmentIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getCommitmentIdentifier() {
        return commitmentIdentifier;
    }

    /**
     * Définit la valeur de la propriété commitmentIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setCommitmentIdentifier(ObjectIdentifierType value) {
        this.commitmentIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété semantics.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemantics() {
        return semantics;
    }

    /**
     * Définit la valeur de la propriété semantics.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemantics(String value) {
        this.semantics = value;
    }

}
