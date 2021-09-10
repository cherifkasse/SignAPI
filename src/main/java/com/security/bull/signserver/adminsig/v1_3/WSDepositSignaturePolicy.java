
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bull.metasign.xmlsignaturepolicy.v3.SignaturePolicy;
import com.security.bull.server.coreservices.v1_3.ArtifactInfoFile;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSDepositSignaturePolicy complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSDepositSignaturePolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;sequence>
 *         &lt;element name="policyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="infoFile" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ArtifactInfoFile"/>
 *         &lt;element name="lockPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="signaturePolicy" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SignaturePolicy"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDepositSignaturePolicy", propOrder = {
    "policyName",
    "infoFile",
    "lockPolicy",
    "signaturePolicy"
})
public class WSDepositSignaturePolicy
    extends WSOperation
{

    @XmlElement(required = true)
    protected String policyName;
    @XmlElement(required = true)
    protected ArtifactInfoFile infoFile;
    protected boolean lockPolicy;
    @XmlElement(required = true)
    protected SignaturePolicy signaturePolicy;

    /**
     * Obtient la valeur de la propriété policyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Définit la valeur de la propriété policyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * Obtient la valeur de la propriété infoFile.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactInfoFile }
     *     
     */
    public ArtifactInfoFile getInfoFile() {
        return infoFile;
    }

    /**
     * Définit la valeur de la propriété infoFile.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactInfoFile }
     *     
     */
    public void setInfoFile(ArtifactInfoFile value) {
        this.infoFile = value;
    }

    /**
     * Obtient la valeur de la propriété lockPolicy.
     * 
     */
    public boolean isLockPolicy() {
        return lockPolicy;
    }

    /**
     * Définit la valeur de la propriété lockPolicy.
     * 
     */
    public void setLockPolicy(boolean value) {
        this.lockPolicy = value;
    }

    /**
     * Obtient la valeur de la propriété signaturePolicy.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicy }
     *     
     */
    public SignaturePolicy getSignaturePolicy() {
        return signaturePolicy;
    }

    /**
     * Définit la valeur de la propriété signaturePolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicy }
     *     
     */
    public void setSignaturePolicy(SignaturePolicy value) {
        this.signaturePolicy = value;
    }

}
