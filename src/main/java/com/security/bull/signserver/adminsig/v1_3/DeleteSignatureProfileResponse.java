
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * <p>Classe Java pour DeleteSignatureProfileResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DeleteSignatureProfileResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;sequence>
 *         &lt;element name="signatureProfileId" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSignatureProfileResponse", propOrder = {
    "signatureProfileId"
})
public class DeleteSignatureProfileResponse
    extends WSResponse
{

    protected String signatureProfileId;

    /**
     * Obtient la valeur de la propriété signatureProfileId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureProfileId() {
        return signatureProfileId;
    }

    /**
     * Définit la valeur de la propriété signatureProfileId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureProfileId(String value) {
        this.signatureProfileId = value;
    }

}
