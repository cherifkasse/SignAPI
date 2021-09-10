
package com.security.bull.server.coreservices.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Constraint complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Constraint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="constrainedElement" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isNegated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Constraint")
@XmlSeeAlso({
    StringConstraint.class,
    BooleanConstraint.class,
    ServerIdConstraint.class
})
public abstract class Constraint {

    @XmlAttribute(name = "constrainedElement", required = true)
    protected String constrainedElement;
    @XmlAttribute(name = "isNegated")
    protected Boolean isNegated;

    /**
     * Obtient la valeur de la propriété constrainedElement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstrainedElement() {
        return constrainedElement;
    }

    /**
     * Définit la valeur de la propriété constrainedElement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstrainedElement(String value) {
        this.constrainedElement = value;
    }

    /**
     * Obtient la valeur de la propriété isNegated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNegated() {
        return isNegated;
    }

    /**
     * Définit la valeur de la propriété isNegated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNegated(Boolean value) {
        this.isNegated = value;
    }

}
