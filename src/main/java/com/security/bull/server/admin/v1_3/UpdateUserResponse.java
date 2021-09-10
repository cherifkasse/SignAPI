
package com.security.bull.server.admin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * <p>Classe Java pour UpdateUserResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateUserResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;attribute name="updatedId" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateUserResponse")
public class UpdateUserResponse
    extends WSResponse
{

    @XmlAttribute(name = "updatedId")
    protected String updatedId;

    /**
     * Obtient la valeur de la propriété updatedId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedId() {
        return updatedId;
    }

    /**
     * Définit la valeur de la propriété updatedId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedId(String value) {
        this.updatedId = value;
    }

}
