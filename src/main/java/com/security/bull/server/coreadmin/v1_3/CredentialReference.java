
package com.security.bull.server.coreadmin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The reference to an existing Credential (already stored on the server).
 * 
 * <p>Classe Java pour CredentialReference complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CredentialReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}Credential">
 *       &lt;sequence>
 *         &lt;element name="credentialId" type="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}CredentialId"/>
 *         &lt;element name="value" type="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}CredentialSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialReference", propOrder = {
    "credentialId",
    "value"
})
public class CredentialReference
    extends Credential
{

    @XmlElement(required = true)
    protected CredentialId credentialId;
    protected CredentialSpecification value;

    /**
     * Obtient la valeur de la propriété credentialId.
     * 
     * @return
     *     possible object is
     *     {@link CredentialId }
     *     
     */
    public CredentialId getCredentialId() {
        return credentialId;
    }

    /**
     * Définit la valeur de la propriété credentialId.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialId }
     *     
     */
    public void setCredentialId(CredentialId value) {
        this.credentialId = value;
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link CredentialSpecification }
     *     
     */
    public CredentialSpecification getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialSpecification }
     *     
     */
    public void setValue(CredentialSpecification value) {
        this.value = value;
    }

}
