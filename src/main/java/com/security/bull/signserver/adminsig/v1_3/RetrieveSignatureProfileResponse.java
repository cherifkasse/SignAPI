
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSResponse;
import com.security.bull.signserver.sigservices.v1_3.SignatureProfileSpecification;


/**
 * <p>Classe Java pour RetrieveSignatureProfileResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveSignatureProfileResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;sequence>
 *         &lt;element name="signatureProfile" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}SignatureProfileSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveSignatureProfileResponse", propOrder = {
    "signatureProfile"
})
public class RetrieveSignatureProfileResponse
    extends WSResponse
{

    protected SignatureProfileSpecification signatureProfile;

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

}
