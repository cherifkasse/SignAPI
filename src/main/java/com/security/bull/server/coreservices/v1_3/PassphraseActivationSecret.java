
package com.security.bull.server.coreservices.v1_3;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A passphrase type activation secret.
 * 
 * <p>Classe Java pour PassphraseActivationSecret complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PassphraseActivationSecret">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ActivationSecret">
 *       &lt;sequence>
 *         &lt;element name="bytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassphraseActivationSecret", propOrder = {
    "bytes"
})
@XmlSeeAlso({
    DASActivationSecret.class
})
public class PassphraseActivationSecret
    extends ActivationSecret
{

    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler bytes;

    /**
     * Obtient la valeur de la propriété bytes.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getBytes() {
        return bytes;
    }

    /**
     * Définit la valeur de la propriété bytes.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setBytes(DataHandler value) {
        this.bytes = value;
    }

}
