
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSRetrieveSkgProfile complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSRetrieveSkgProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;attribute name="signKeyGenProfileId" use="required" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRetrieveSkgProfile")
public class WSRetrieveSkgProfile
    extends WSOperation
{

    @XmlAttribute(name = "signKeyGenProfileId", required = true)
    protected String signKeyGenProfileId;

    /**
     * Obtient la valeur de la propriété signKeyGenProfileId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignKeyGenProfileId() {
        return signKeyGenProfileId;
    }

    /**
     * Définit la valeur de la propriété signKeyGenProfileId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignKeyGenProfileId(String value) {
        this.signKeyGenProfileId = value;
    }

}
