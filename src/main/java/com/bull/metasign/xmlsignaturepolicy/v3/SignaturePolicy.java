
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SignaturePolicy complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignaturePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignPolicyDigestAlg" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}DigestMethodType"/>
 *         &lt;element ref="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}Transforms" minOccurs="0"/>
 *         &lt;element ref="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SignPolicyInfo"/>
 *         &lt;element name="SignPolicyDigest" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}DigestValueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePolicy", propOrder = {
    "signPolicyDigestAlg",
    "transforms",
    "signPolicyInfo",
    "signPolicyDigest"
})
public class SignaturePolicy {

    @XmlElement(name = "SignPolicyDigestAlg", required = true)
    protected DigestMethodType signPolicyDigestAlg;
    @XmlElement(name = "Transforms")
    protected TransformsType transforms;
    @XmlElement(name = "SignPolicyInfo", required = true)
    protected SignPolicyInfo signPolicyInfo;
    @XmlElement(name = "SignPolicyDigest", required = true)
    protected byte[] signPolicyDigest;

    /**
     * Obtient la valeur de la propriété signPolicyDigestAlg.
     * 
     * @return
     *     possible object is
     *     {@link DigestMethodType }
     *     
     */
    public DigestMethodType getSignPolicyDigestAlg() {
        return signPolicyDigestAlg;
    }

    /**
     * Définit la valeur de la propriété signPolicyDigestAlg.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestMethodType }
     *     
     */
    public void setSignPolicyDigestAlg(DigestMethodType value) {
        this.signPolicyDigestAlg = value;
    }

    /**
     * Obtient la valeur de la propriété transforms.
     * 
     * @return
     *     possible object is
     *     {@link TransformsType }
     *     
     */
    public TransformsType getTransforms() {
        return transforms;
    }

    /**
     * Définit la valeur de la propriété transforms.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformsType }
     *     
     */
    public void setTransforms(TransformsType value) {
        this.transforms = value;
    }

    /**
     * Obtient la valeur de la propriété signPolicyInfo.
     * 
     * @return
     *     possible object is
     *     {@link SignPolicyInfo }
     *     
     */
    public SignPolicyInfo getSignPolicyInfo() {
        return signPolicyInfo;
    }

    /**
     * Définit la valeur de la propriété signPolicyInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SignPolicyInfo }
     *     
     */
    public void setSignPolicyInfo(SignPolicyInfo value) {
        this.signPolicyInfo = value;
    }

    /**
     * Obtient la valeur de la propriété signPolicyDigest.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignPolicyDigest() {
        return signPolicyDigest;
    }

    /**
     * Définit la valeur de la propriété signPolicyDigest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignPolicyDigest(byte[] value) {
        this.signPolicyDigest = value;
    }

}
