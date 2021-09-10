
package com.security.bull.server.admin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreadmin.v1_3.User;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSUpdateUser complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSUpdateUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;sequence>
 *         &lt;element name="newUser" type="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}User"/>
 *       &lt;/sequence>
 *       &lt;attribute name="userId" use="required" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSUpdateUser", propOrder = {
    "newUser"
})
public class WSUpdateUser
    extends WSOperation
{

    @XmlElement(required = true)
    protected User newUser;
    @XmlAttribute(name = "userId", required = true)
    protected String userId;

    /**
     * Obtient la valeur de la propriété newUser.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getNewUser() {
        return newUser;
    }

    /**
     * Définit la valeur de la propriété newUser.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setNewUser(User value) {
        this.newUser = value;
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

}
