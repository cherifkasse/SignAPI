
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignPolicyIdentifier" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}ObjectIdentifierType"/>
 *         &lt;element name="FieldOfApplication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PolicyIssuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignatureValidationPolicy" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SignatureValidationPolicyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signPolicyIdentifier",
    "fieldOfApplication",
    "dateOfIssue",
    "policyIssuerName",
    "signatureValidationPolicy"
})
@XmlRootElement(name = "SignPolicyInfo")
public class SignPolicyInfo {

    @XmlElement(name = "SignPolicyIdentifier", required = true)
    protected ObjectIdentifierType signPolicyIdentifier;
    @XmlElement(name = "FieldOfApplication", required = true)
    protected String fieldOfApplication;
    @XmlElement(name = "DateOfIssue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfIssue;
    @XmlElement(name = "PolicyIssuerName")
    protected String policyIssuerName;
    @XmlElement(name = "SignatureValidationPolicy", required = true)
    protected SignatureValidationPolicyType signatureValidationPolicy;

    /**
     * Obtient la valeur de la propriété signPolicyIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getSignPolicyIdentifier() {
        return signPolicyIdentifier;
    }

    /**
     * Définit la valeur de la propriété signPolicyIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setSignPolicyIdentifier(ObjectIdentifierType value) {
        this.signPolicyIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété fieldOfApplication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldOfApplication() {
        return fieldOfApplication;
    }

    /**
     * Définit la valeur de la propriété fieldOfApplication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldOfApplication(String value) {
        this.fieldOfApplication = value;
    }

    /**
     * Obtient la valeur de la propriété dateOfIssue.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Définit la valeur de la propriété dateOfIssue.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfIssue(XMLGregorianCalendar value) {
        this.dateOfIssue = value;
    }

    /**
     * Obtient la valeur de la propriété policyIssuerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyIssuerName() {
        return policyIssuerName;
    }

    /**
     * Définit la valeur de la propriété policyIssuerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyIssuerName(String value) {
        this.policyIssuerName = value;
    }

    /**
     * Obtient la valeur de la propriété signatureValidationPolicy.
     * 
     * @return
     *     possible object is
     *     {@link SignatureValidationPolicyType }
     *     
     */
    public SignatureValidationPolicyType getSignatureValidationPolicy() {
        return signatureValidationPolicy;
    }

    /**
     * Définit la valeur de la propriété signatureValidationPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureValidationPolicyType }
     *     
     */
    public void setSignatureValidationPolicy(SignatureValidationPolicyType value) {
        this.signatureValidationPolicy = value;
    }

}
