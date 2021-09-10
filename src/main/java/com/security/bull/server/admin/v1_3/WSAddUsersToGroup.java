
package com.security.bull.server.admin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreadmin.v1_3.UsersToGroupAssociation;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * 
 *     			Adds the specified users to the specified group.
 *     		
 * 
 * <p>Classe Java pour WSAddUsersToGroup complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSAddUsersToGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;sequence>
 *         &lt;element name="parameter" type="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}UsersToGroupAssociation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSAddUsersToGroup", propOrder = {
    "parameter"
})
public class WSAddUsersToGroup
    extends WSOperation
{

    @XmlElement(required = true)
    protected UsersToGroupAssociation parameter;

    /**
     * Obtient la valeur de la propriété parameter.
     * 
     * @return
     *     possible object is
     *     {@link UsersToGroupAssociation }
     *     
     */
    public UsersToGroupAssociation getParameter() {
        return parameter;
    }

    /**
     * Définit la valeur de la propriété parameter.
     * 
     * @param value
     *     allowed object is
     *     {@link UsersToGroupAssociation }
     *     
     */
    public void setParameter(UsersToGroupAssociation value) {
        this.parameter = value;
    }

}
