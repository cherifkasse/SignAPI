
package com.security.bull.server.coreadmin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The Credentail identifier. The means used by the server to uniquely identify a given Credential once stored.
 * Credentials are uniquely identified by The User they belong to and some user-unique key.
 *     		
 * 
 * <p>Classe Java pour CredentialId complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CredentialId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="credential" type="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}CredentialSpecification"/>
 *         &lt;element name="credentialKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *       &lt;attribute name="userId" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialId", propOrder = {
    "credential",
    "credentialKey"
})
public class CredentialId {

    protected CredentialSpecification credential;
    protected String credentialKey;
    @XmlAttribute(name = "userId")
    protected String userId;

    /**
     * Obtient la valeur de la propriété credential.
     * 
     * @return
     *     possible object is
     *     {@link CredentialSpecification }
     *     
     */
    public CredentialSpecification getCredential() {
        return credential;
    }

    /**
     * Définit la valeur de la propriété credential.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialSpecification }
     *     
     */
    public void setCredential(CredentialSpecification value) {
        this.credential = value;
    }

    /**
     * Obtient la valeur de la propriété credentialKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialKey() {
        return credentialKey;
    }

    /**
     * Définit la valeur de la propriété credentialKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialKey(String value) {
        this.credentialKey = value;
    }

    /**
     * Obtient la valeur de la propriété userId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Définit la valeur de la propriété userId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
