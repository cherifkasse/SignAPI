
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.ArtifactInfoFile;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSDepSigKeyGenProfile complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSDepSigKeyGenProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;sequence>
 *         &lt;element name="infoFile" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ArtifactInfoFile"/>
 *         &lt;element name="profileContent" type="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}SkGenerationProfileSpecification"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDepSigKeyGenProfile", propOrder = {
    "infoFile",
    "profileContent"
})
public class WSDepSigKeyGenProfile
    extends WSOperation
{

    @XmlElement(required = true)
    protected ArtifactInfoFile infoFile;
    @XmlElement(required = true)
    protected SkGenerationProfileSpecification profileContent;

    /**
     * Obtient la valeur de la propriété infoFile.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactInfoFile }
     *     
     */
    public ArtifactInfoFile getInfoFile() {
        return infoFile;
    }

    /**
     * Définit la valeur de la propriété infoFile.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactInfoFile }
     *     
     */
    public void setInfoFile(ArtifactInfoFile value) {
        this.infoFile = value;
    }

    /**
     * Obtient la valeur de la propriété profileContent.
     * 
     * @return
     *     possible object is
     *     {@link SkGenerationProfileSpecification }
     *     
     */
    public SkGenerationProfileSpecification getProfileContent() {
        return profileContent;
    }

    /**
     * Définit la valeur de la propriété profileContent.
     * 
     * @param value
     *     allowed object is
     *     {@link SkGenerationProfileSpecification }
     *     
     */
    public void setProfileContent(SkGenerationProfileSpecification value) {
        this.profileContent = value;
    }

}
