
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SigPolInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SigPolInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="policyOid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="policyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isLocked" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SigPolInfo")
public class SigPolInfo {

    @XmlAttribute(name = "policyOid", required = true)
    protected String policyOid;
    @XmlAttribute(name = "policyName")
    protected String policyName;
    @XmlAttribute(name = "isLocked", required = true)
    protected boolean isLocked;

    /**
     * Obtient la valeur de la propriété policyOid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyOid() {
        return policyOid;
    }

    /**
     * Définit la valeur de la propriété policyOid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyOid(String value) {
        this.policyOid = value;
    }

    /**
     * Obtient la valeur de la propriété policyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Définit la valeur de la propriété policyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * Obtient la valeur de la propriété isLocked.
     * 
     */
    public boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Définit la valeur de la propriété isLocked.
     * 
     */
    public void setIsLocked(boolean value) {
        this.isLocked = value;
    }

}
