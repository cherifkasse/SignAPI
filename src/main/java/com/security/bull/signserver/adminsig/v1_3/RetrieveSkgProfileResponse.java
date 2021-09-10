
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * <p>Classe Java pour RetrieveSkgProfileResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveSkgProfileResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;sequence>
 *         &lt;element name="signatureKeyGenerationProfile" type="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}SkGenerationProfileSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveSkgProfileResponse", propOrder = {
    "signatureKeyGenerationProfile"
})
public class RetrieveSkgProfileResponse
    extends WSResponse
{

    protected SkGenerationProfileSpecification signatureKeyGenerationProfile;

    /**
     * Obtient la valeur de la propriété signatureKeyGenerationProfile.
     * 
     * @return
     *     possible object is
     *     {@link SkGenerationProfileSpecification }
     *     
     */
    public SkGenerationProfileSpecification getSignatureKeyGenerationProfile() {
        return signatureKeyGenerationProfile;
    }

    /**
     * Définit la valeur de la propriété signatureKeyGenerationProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link SkGenerationProfileSpecification }
     *     
     */
    public void setSignatureKeyGenerationProfile(SkGenerationProfileSpecification value) {
        this.signatureKeyGenerationProfile = value;
    }

}
