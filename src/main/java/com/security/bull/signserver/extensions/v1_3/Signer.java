
package com.security.bull.signserver.extensions.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreadmin.v1_3.RoleSpecification;
import com.security.bull.server.coreservices.v1_3.ActivationSecret;


/**
 * <p>Classe Java pour Signer complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Signer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}RoleSpecification">
 *       &lt;sequence>
 *         &lt;element name="activationSecret" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ActivationSecret"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signer", propOrder = {
    "activationSecret"
})
public class Signer
    extends RoleSpecification
{

    @XmlElement(required = true)
    protected ActivationSecret activationSecret;

    /**
     * Obtient la valeur de la propriété activationSecret.
     * 
     * @return
     *     possible object is
     *     {@link ActivationSecret }
     *     
     */
    public ActivationSecret getActivationSecret() {
        return activationSecret;
    }

    /**
     * Définit la valeur de la propriété activationSecret.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationSecret }
     *     
     */
    public void setActivationSecret(ActivationSecret value) {
        this.activationSecret = value;
    }

}
