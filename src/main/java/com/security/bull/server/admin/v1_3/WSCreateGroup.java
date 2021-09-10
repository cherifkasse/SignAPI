
package com.security.bull.server.admin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreadmin.v1_3.GroupSpecification;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSCreateGroup complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSCreateGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;sequence>
 *         &lt;element name="parameter" type="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}GroupSpecification"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCreateGroup", propOrder = {
    "parameter"
})
public class WSCreateGroup
    extends WSOperation
{

    @XmlElement(required = true)
    protected GroupSpecification parameter;

    /**
     * Obtient la valeur de la propriété parameter.
     * 
     * @return
     *     possible object is
     *     {@link GroupSpecification }
     *     
     */
    public GroupSpecification getParameter() {
        return parameter;
    }

    /**
     * Définit la valeur de la propriété parameter.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupSpecification }
     *     
     */
    public void setParameter(GroupSpecification value) {
        this.parameter = value;
    }

}
