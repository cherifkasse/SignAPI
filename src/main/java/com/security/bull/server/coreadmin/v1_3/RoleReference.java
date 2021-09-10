
package com.security.bull.server.coreadmin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Reference to an existing Role.
 * 			
 * 
 * <p>Classe Java pour RoleReference complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoleReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}Role">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}RoleSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="userId" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *       &lt;attribute name="roleNS" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleReference", propOrder = {
    "value"
})
public class RoleReference
    extends Role
{

    protected RoleSpecification value;
    @XmlAttribute(name = "userId")
    protected String userId;
    @XmlAttribute(name = "roleNS", required = true)
    protected String roleNS;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link RoleSpecification }
     *     
     */
    public RoleSpecification getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleSpecification }
     *     
     */
    public void setValue(RoleSpecification value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété userId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Définit la valeur de la propriété userId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Obtient la valeur de la propriété roleNS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleNS() {
        return roleNS;
    }

    /**
     * Définit la valeur de la propriété roleNS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleNS(String value) {
        this.roleNS = value;
    }

}
