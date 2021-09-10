
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.DASAuthMethodEnum;


/**
 * <p>Classe Java pour DASActivationData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DASActivationData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}ActivationData">
 *       &lt;attribute name="userActivationSecret" use="required" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *       &lt;attribute name="authenticationMethod" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}DASAuthMethodEnum" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DASActivationData")
public class DASActivationData
    extends ActivationData
{

    @XmlAttribute(name = "userActivationSecret", required = true)
    protected byte[] userActivationSecret;
    @XmlAttribute(name = "authenticationMethod")
    protected DASAuthMethodEnum authenticationMethod;

    /**
     * Obtient la valeur de la propriété userActivationSecret.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getUserActivationSecret() {
        return userActivationSecret;
    }

    /**
     * Définit la valeur de la propriété userActivationSecret.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setUserActivationSecret(byte[] value) {
        this.userActivationSecret = value;
    }

    /**
     * Obtient la valeur de la propriété authenticationMethod.
     * 
     * @return
     *     possible object is
     *     {@link DASAuthMethodEnum }
     *     
     */
    public DASAuthMethodEnum getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Définit la valeur de la propriété authenticationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link DASAuthMethodEnum }
     *     
     */
    public void setAuthenticationMethod(DASAuthMethodEnum value) {
        this.authenticationMethod = value;
    }

}
