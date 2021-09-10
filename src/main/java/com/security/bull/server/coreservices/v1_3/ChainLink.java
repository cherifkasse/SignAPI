
package com.security.bull.server.coreservices.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The association of a Constraint operator and a constraint.
 * 
 * <p>Classe Java pour ChainLink complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ChainLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="booleanOperator" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}BooleanOperator"/>
 *         &lt;element name="constraint" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}Constraint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChainLink", propOrder = {
    "booleanOperator",
    "constraint"
})
public class ChainLink {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BooleanOperator booleanOperator;
    @XmlElement(required = true)
    protected Constraint constraint;

    /**
     * Obtient la valeur de la propriété booleanOperator.
     * 
     * @return
     *     possible object is
     *     {@link BooleanOperator }
     *     
     */
    public BooleanOperator getBooleanOperator() {
        return booleanOperator;
    }

    /**
     * Définit la valeur de la propriété booleanOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanOperator }
     *     
     */
    public void setBooleanOperator(BooleanOperator value) {
        this.booleanOperator = value;
    }

    /**
     * Obtient la valeur de la propriété constraint.
     * 
     * @return
     *     possible object is
     *     {@link Constraint }
     *     
     */
    public Constraint getConstraint() {
        return constraint;
    }

    /**
     * Définit la valeur de la propriété constraint.
     * 
     * @param value
     *     allowed object is
     *     {@link Constraint }
     *     
     */
    public void setConstraint(Constraint value) {
        this.constraint = value;
    }

}
