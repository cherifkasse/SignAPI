
package com.security.bull.server.coreadmin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     			An already existing Group (stored by the server).
 *     		
 * 
 * <p>Classe Java pour GroupReference complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GroupReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}Group">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}GroupSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="groupId" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupReference", propOrder = {
    "value"
})
public class GroupReference
    extends Group
{

    protected GroupSpecification value;
    @XmlAttribute(name = "groupId")
    protected String groupId;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link GroupSpecification }
     *     
     */
    public GroupSpecification getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupSpecification }
     *     
     */
    public void setValue(GroupSpecification value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété groupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Définit la valeur de la propriété groupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

}
