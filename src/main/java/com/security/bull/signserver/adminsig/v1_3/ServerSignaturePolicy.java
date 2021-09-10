
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bull.metasign.xmlsignaturepolicy.v3.SignaturePolicy;


/**
 * Our Signserver definition of a Signature Policy associates to a MetaSIGN-API SignaturePolicy a name and lock state.
 * 
 * <p>Classe Java pour ServerSignaturePolicy complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ServerSignaturePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="policy" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SignaturePolicy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerSignaturePolicy", propOrder = {
    "name",
    "locked",
    "policy"
})
public class ServerSignaturePolicy {

    @XmlElement(required = true)
    protected String name;
    protected boolean locked;
    @XmlElement(required = true)
    protected SignaturePolicy policy;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété locked.
     * 
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Définit la valeur de la propriété locked.
     * 
     */
    public void setLocked(boolean value) {
        this.locked = value;
    }

    /**
     * Obtient la valeur de la propriété policy.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicy }
     *     
     */
    public SignaturePolicy getPolicy() {
        return policy;
    }

    /**
     * Définit la valeur de la propriété policy.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicy }
     *     
     */
    public void setPolicy(SignaturePolicy value) {
        this.policy = value;
    }

}
