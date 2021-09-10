
package com.security.bull.server.coreadmin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Reference to an existing Application.
 * 			
 * 
 * <p>Classe Java pour ApplicationReference complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ApplicationReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}Application">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}ApplicationSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="applicationId" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationReference", propOrder = {
    "value"
})
public class ApplicationReference
    extends Application
{

    protected ApplicationSpecification value;
    @XmlAttribute(name = "applicationId")
    protected String applicationId;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSpecification }
     *     
     */
    public ApplicationSpecification getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSpecification }
     *     
     */
    public void setValue(ApplicationSpecification value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété applicationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Définit la valeur de la propriété applicationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

}
