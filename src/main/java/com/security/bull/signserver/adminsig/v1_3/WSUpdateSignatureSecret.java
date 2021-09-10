
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.ActivationSecret;
import com.security.bull.signserver.sigservices.v1_3.WSSignatureOperation;


/**
 * <p>Classe Java pour WSUpdateSignatureSecret complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSUpdateSignatureSecret">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}WSSignatureOperation">
 *       &lt;sequence>
 *         &lt;element name="newSignatureSecret" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ActivationSecret"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSUpdateSignatureSecret", propOrder = {
    "newSignatureSecret"
})
public class WSUpdateSignatureSecret
    extends WSSignatureOperation
{

    @XmlElement(required = true)
    protected ActivationSecret newSignatureSecret;

    /**
     * Obtient la valeur de la propriété newSignatureSecret.
     * 
     * @return
     *     possible object is
     *     {@link ActivationSecret }
     *     
     */
    public ActivationSecret getNewSignatureSecret() {
        return newSignatureSecret;
    }

    /**
     * Définit la valeur de la propriété newSignatureSecret.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationSecret }
     *     
     */
    public void setNewSignatureSecret(ActivationSecret value) {
        this.newSignatureSecret = value;
    }

}
