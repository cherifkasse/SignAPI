
package com.security.bull.server.coreservices.v1_3;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * The DAS Activation secret, it combines a password activation password with a dynamic (OTP like) part and 2 authentication methods.
 *     		
 * 
 * <p>Classe Java pour DASActivationSecret complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DASActivationSecret">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}PassphraseActivationSecret">
 *       &lt;sequence>
 *         &lt;element name="dynamicSecret" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DASActivationSecret", propOrder = {
    "dynamicSecret"
})
public class DASActivationSecret
    extends PassphraseActivationSecret
{

    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler dynamicSecret;

    /**
     * Obtient la valeur de la propriété dynamicSecret.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getDynamicSecret() {
        return dynamicSecret;
    }

    /**
     * Définit la valeur de la propriété dynamicSecret.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setDynamicSecret(DataHandler value) {
        this.dynamicSecret = value;
    }

}
