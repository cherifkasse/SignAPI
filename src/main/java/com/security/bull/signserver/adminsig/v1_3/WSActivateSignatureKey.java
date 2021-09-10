
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * Attempts activation of the specified signatureKey (from its identifier) using specified dynamic activation secret.
 * 
 * <p>Classe Java pour WSActivateSignatureKey complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSActivateSignatureKey">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;sequence>
 *         &lt;element name="activationData" type="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}ActivationData"/>
 *       &lt;/sequence>
 *       &lt;attribute name="signatureKeyId" use="required" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}SignatureKeyId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSActivateSignatureKey", propOrder = {
    "activationData"
})
public class WSActivateSignatureKey
    extends WSOperation
{

    @XmlElement(required = true)
    protected ActivationData activationData;
    @XmlAttribute(name = "signatureKeyId", required = true)
    protected String signatureKeyId;

    /**
     * Obtient la valeur de la propriété activationData.
     * 
     * @return
     *     possible object is
     *     {@link ActivationData }
     *     
     */
    public ActivationData getActivationData() {
        return activationData;
    }

    /**
     * Définit la valeur de la propriété activationData.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationData }
     *     
     */
    public void setActivationData(ActivationData value) {
        this.activationData = value;
    }

    /**
     * Obtient la valeur de la propriété signatureKeyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureKeyId() {
        return signatureKeyId;
    }

    /**
     * Définit la valeur de la propriété signatureKeyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureKeyId(String value) {
        this.signatureKeyId = value;
    }

}
