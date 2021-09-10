
package com.security.bull.server.admin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreadmin.v1_3.GroupSpecification;
import com.security.bull.server.coreservices.v1_3.Chain;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSListGroups complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSListGroups">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;choice>
 *         &lt;element name="templateGroup" type="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}GroupSpecification" minOccurs="0"/>
 *         &lt;element name="constraintChain" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}Chain" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSListGroups", propOrder = {
    "templateGroup",
    "constraintChain"
})
public class WSListGroups
    extends WSOperation
{

    protected GroupSpecification templateGroup;
    protected Chain constraintChain;

    /**
     * Obtient la valeur de la propriété templateGroup.
     * 
     * @return
     *     possible object is
     *     {@link GroupSpecification }
     *     
     */
    public GroupSpecification getTemplateGroup() {
        return templateGroup;
    }

    /**
     * Définit la valeur de la propriété templateGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupSpecification }
     *     
     */
    public void setTemplateGroup(GroupSpecification value) {
        this.templateGroup = value;
    }

    /**
     * Obtient la valeur de la propriété constraintChain.
     * 
     * @return
     *     possible object is
     *     {@link Chain }
     *     
     */
    public Chain getConstraintChain() {
        return constraintChain;
    }

    /**
     * Définit la valeur de la propriété constraintChain.
     * 
     * @param value
     *     allowed object is
     *     {@link Chain }
     *     
     */
    public void setConstraintChain(Chain value) {
        this.constraintChain = value;
    }

}
