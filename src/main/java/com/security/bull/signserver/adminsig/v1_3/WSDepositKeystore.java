
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.Keystore;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSDepositKeystore complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSDepositKeystore">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;sequence>
 *         &lt;element name="keystore" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}Keystore"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDepositKeystore", propOrder = {
    "keystore"
})
public class WSDepositKeystore
    extends WSOperation
{

    @XmlElement(required = true)
    protected Keystore keystore;

    /**
     * Obtient la valeur de la propriété keystore.
     * 
     * @return
     *     possible object is
     *     {@link Keystore }
     *     
     */
    public Keystore getKeystore() {
        return keystore;
    }

    /**
     * Définit la valeur de la propriété keystore.
     * 
     * @param value
     *     allowed object is
     *     {@link Keystore }
     *     
     */
    public void setKeystore(Keystore value) {
        this.keystore = value;
    }

}
