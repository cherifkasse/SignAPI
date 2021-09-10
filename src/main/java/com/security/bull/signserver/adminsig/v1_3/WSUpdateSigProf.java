
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.ArtifactInfoFile;
import com.security.bull.server.coreservices.v1_3.WSOperation;
import com.security.bull.signserver.sigservices.v1_3.SignatureProfileSpecification;


/**
 * <p>Classe Java pour WSUpdateSigProf complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSUpdateSigProf">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;sequence>
 *         &lt;element name="signatureProfile" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}SignatureProfileSpecification"/>
 *         &lt;element name="infoFile" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ArtifactInfoFile" minOccurs="0"/>
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
@XmlType(name = "WSUpdateSigProf", propOrder = {
    "signatureProfile",
    "infoFile"
})
public class WSUpdateSigProf
    extends WSOperation
{

    @XmlElement(required = true)
    protected SignatureProfileSpecification signatureProfile;
    protected ArtifactInfoFile infoFile;
    @XmlAttribute(name = "profileId", required = true)
    protected String profileId;

    /**
     * Obtient la valeur de la propriété signatureProfile.
     * 
     * @return
     *     possible object is
     *     {@link SignatureProfileSpecification }
     *     
     */
    public SignatureProfileSpecification getSignatureProfile() {
        return signatureProfile;
    }

    /**
     * Définit la valeur de la propriété signatureProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureProfileSpecification }
     *     
     */
    public void setSignatureProfile(SignatureProfileSpecification value) {
        this.signatureProfile = value;
    }

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
