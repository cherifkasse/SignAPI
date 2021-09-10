
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSUpdateSkgProfile complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSUpdateSkgProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;sequence>
 *         &lt;element name="newProfileContent" type="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}SkGenerationProfileSpecification"/>
 *       &lt;/sequence>
 *       &lt;attribute name="profileId" use="required" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSUpdateSkgProfile", propOrder = {
    "newProfileContent"
})
public class WSUpdateSkgProfile
    extends WSOperation
{

    @XmlElement(required = true)
    protected SkGenerationProfileSpecification newProfileContent;
    @XmlAttribute(name = "profileId", required = true)
    protected String profileId;

    /**
     * Obtient la valeur de la propriété newProfileContent.
     * 
     * @return
     *     possible object is
     *     {@link SkGenerationProfileSpecification }
     *     
     */
    public SkGenerationProfileSpecification getNewProfileContent() {
        return newProfileContent;
    }

    /**
     * Définit la valeur de la propriété newProfileContent.
     * 
     * @param value
     *     allowed object is
     *     {@link SkGenerationProfileSpecification }
     *     
     */
    public void setNewProfileContent(SkGenerationProfileSpecification value) {
        this.newProfileContent = value;
    }

    /**
     * Obtient la valeur de la propriété profileId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Définit la valeur de la propriété profileId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

}
