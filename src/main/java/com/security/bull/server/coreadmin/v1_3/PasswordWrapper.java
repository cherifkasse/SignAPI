
package com.security.bull.server.coreadmin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A password credential (only password hash will be used).
 * 
 * <p>Classe Java pour PasswordWrapper complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PasswordWrapper">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}CredentialSpecification">
 *       &lt;attribute name="passwordHash" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *       &lt;attribute name="hashAlgo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasswordWrapper")
public class PasswordWrapper
    extends CredentialSpecification
{

    @XmlAttribute(name = "passwordHash")
    protected byte[] passwordHash;
    @XmlAttribute(name = "hashAlgo")
    protected String hashAlgo;

    /**
     * Obtient la valeur de la propriété passwordHash.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPasswordHash() {
        return passwordHash;
    }

    /**
     * Définit la valeur de la propriété passwordHash.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPasswordHash(byte[] value) {
        this.passwordHash = value;
    }

    /**
     * Obtient la valeur de la propriété hashAlgo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashAlgo() {
        return hashAlgo;
    }

    /**
     * Définit la valeur de la propriété hashAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashAlgo(String value) {
        this.hashAlgo = value;
    }

}
