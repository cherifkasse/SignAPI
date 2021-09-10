
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SkGenerationProfileReference complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SkGenerationProfileReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}SkGenerationProfile">
 *       &lt;attribute name="skgProfileId" use="required" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkGenerationProfileReference")
public class SkGenerationProfileReference
    extends SkGenerationProfile
{

    @XmlAttribute(name = "skgProfileId", required = true)
    protected String skgProfileId;

    /**
     * Obtient la valeur de la propriété skgProfileId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkgProfileId() {
        return skgProfileId;
    }

    /**
     * Définit la valeur de la propriété skgProfileId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkgProfileId(String value) {
        this.skgProfileId = value;
    }

}
