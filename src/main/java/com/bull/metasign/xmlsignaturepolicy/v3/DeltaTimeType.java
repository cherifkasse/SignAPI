
package com.bull.metasign.xmlsignaturepolicy.v3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DeltaTimeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DeltaTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeltaSeconds" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DeltaMinutes" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DeltaHours" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DeltaDays" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeltaTimeType", propOrder = {
    "deltaSeconds",
    "deltaMinutes",
    "deltaHours",
    "deltaDays"
})
public class DeltaTimeType {

    @XmlElement(name = "DeltaSeconds", required = true)
    protected BigInteger deltaSeconds;
    @XmlElement(name = "DeltaMinutes", required = true)
    protected BigInteger deltaMinutes;
    @XmlElement(name = "DeltaHours", required = true)
    protected BigInteger deltaHours;
    @XmlElement(name = "DeltaDays", required = true)
    protected BigInteger deltaDays;

    /**
     * Obtient la valeur de la propriété deltaSeconds.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeltaSeconds() {
        return deltaSeconds;
    }

    /**
     * Définit la valeur de la propriété deltaSeconds.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeltaSeconds(BigInteger value) {
        this.deltaSeconds = value;
    }

    /**
     * Obtient la valeur de la propriété deltaMinutes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeltaMinutes() {
        return deltaMinutes;
    }

    /**
     * Définit la valeur de la propriété deltaMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeltaMinutes(BigInteger value) {
        this.deltaMinutes = value;
    }

    /**
     * Obtient la valeur de la propriété deltaHours.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeltaHours() {
        return deltaHours;
    }

    /**
     * Définit la valeur de la propriété deltaHours.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeltaHours(BigInteger value) {
        this.deltaHours = value;
    }

    /**
     * Obtient la valeur de la propriété deltaDays.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeltaDays() {
        return deltaDays;
    }

    /**
     * Définit la valeur de la propriété deltaDays.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeltaDays(BigInteger value) {
        this.deltaDays = value;
    }

}
