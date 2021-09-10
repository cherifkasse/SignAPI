
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * The activaton result.
 * 
 * <p>Classe Java pour ActivateSignatureKeyResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ActivateSignatureKeyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;sequence>
 *         &lt;element name="activationResult" type="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}ActivationResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivateSignatureKeyResponse", propOrder = {
    "activationResult"
})
public class ActivateSignatureKeyResponse
    extends WSResponse
{

    protected ActivationResult activationResult;

    /**
     * Obtient la valeur de la propriété activationResult.
     * 
     * @return
     *     possible object is
     *     {@link ActivationResult }
     *     
     */
    public ActivationResult getActivationResult() {
        return activationResult;
    }

    /**
     * Définit la valeur de la propriété activationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationResult }
     *     
     */
    public void setActivationResult(ActivationResult value) {
        this.activationResult = value;
    }

}
