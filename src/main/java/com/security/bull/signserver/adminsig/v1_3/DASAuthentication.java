
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The DAS enforced authentication method definition.
 * 
 * <p>Classe Java pour DASAuthentication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DASAuthentication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}EnforcedAuthenticationMethod">
 *       &lt;sequence>
 *         &lt;element name="counterMax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="authDataLength" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="authTryMax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="activationPeriod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="blockingPeriod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="1440"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DASAuthentication", propOrder = {
    "counterMax",
    "authDataLength",
    "authTryMax",
    "activationPeriod",
    "blockingPeriod"
})
public class DASAuthentication
    extends EnforcedAuthenticationMethod
{

    protected Integer counterMax;
    protected Integer authDataLength;
    protected Integer authTryMax;
    protected Integer activationPeriod;
    protected Integer blockingPeriod;

    /**
     * Obtient la valeur de la propriété counterMax.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCounterMax() {
        return counterMax;
    }

    /**
     * Définit la valeur de la propriété counterMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCounterMax(Integer value) {
        this.counterMax = value;
    }

    /**
     * Obtient la valeur de la propriété authDataLength.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthDataLength() {
        return authDataLength;
    }

    /**
     * Définit la valeur de la propriété authDataLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthDataLength(Integer value) {
        this.authDataLength = value;
    }

    /**
     * Obtient la valeur de la propriété authTryMax.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthTryMax() {
        return authTryMax;
    }

    /**
     * Définit la valeur de la propriété authTryMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthTryMax(Integer value) {
        this.authTryMax = value;
    }

    /**
     * Obtient la valeur de la propriété activationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivationPeriod() {
        return activationPeriod;
    }

    /**
     * Définit la valeur de la propriété activationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivationPeriod(Integer value) {
        this.activationPeriod = value;
    }

    /**
     * Obtient la valeur de la propriété blockingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlockingPeriod() {
        return blockingPeriod;
    }

    /**
     * Définit la valeur de la propriété blockingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlockingPeriod(Integer value) {
        this.blockingPeriod = value;
    }

}
