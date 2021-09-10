
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NameConstraintsType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NameConstraintsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PermittedSubtrees" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}GeneralSubTreesListType" minOccurs="0"/>
 *         &lt;element name="ExcludedSubtrees" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}GeneralSubTreesListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameConstraintsType", propOrder = {
    "permittedSubtrees",
    "excludedSubtrees"
})
public class NameConstraintsType {

    @XmlElement(name = "PermittedSubtrees")
    protected GeneralSubTreesListType permittedSubtrees;
    @XmlElement(name = "ExcludedSubtrees")
    protected GeneralSubTreesListType excludedSubtrees;

    /**
     * Obtient la valeur de la propriété permittedSubtrees.
     * 
     * @return
     *     possible object is
     *     {@link GeneralSubTreesListType }
     *     
     */
    public GeneralSubTreesListType getPermittedSubtrees() {
        return permittedSubtrees;
    }

    /**
     * Définit la valeur de la propriété permittedSubtrees.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralSubTreesListType }
     *     
     */
    public void setPermittedSubtrees(GeneralSubTreesListType value) {
        this.permittedSubtrees = value;
    }

    /**
     * Obtient la valeur de la propriété excludedSubtrees.
     * 
     * @return
     *     possible object is
     *     {@link GeneralSubTreesListType }
     *     
     */
    public GeneralSubTreesListType getExcludedSubtrees() {
        return excludedSubtrees;
    }

    /**
     * Définit la valeur de la propriété excludedSubtrees.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralSubTreesListType }
     *     
     */
    public void setExcludedSubtrees(GeneralSubTreesListType value) {
        this.excludedSubtrees = value;
    }

}
