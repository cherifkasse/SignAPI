
package com.bull.metasign.xmlsignaturepolicy.v3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CertificateTrustPointType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CertificateTrustPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrustPoint" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="PathLenConstraint" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AcceptablePolicySet" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}AcceptablePoliciesListType" minOccurs="0"/>
 *         &lt;element name="NameConstraints" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}NameConstraintsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateTrustPointType", propOrder = {
    "trustPoint",
    "pathLenConstraint",
    "acceptablePolicySet",
    "nameConstraints"
})
public class CertificateTrustPointType {

    @XmlElement(name = "TrustPoint", required = true)
    protected byte[] trustPoint;
    @XmlElement(name = "PathLenConstraint")
    protected BigInteger pathLenConstraint;
    @XmlElement(name = "AcceptablePolicySet")
    protected AcceptablePoliciesListType acceptablePolicySet;
    @XmlElement(name = "NameConstraints")
    protected NameConstraintsType nameConstraints;

    /**
     * Obtient la valeur de la propriété trustPoint.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTrustPoint() {
        return trustPoint;
    }

    /**
     * Définit la valeur de la propriété trustPoint.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTrustPoint(byte[] value) {
        this.trustPoint = value;
    }

    /**
     * Obtient la valeur de la propriété pathLenConstraint.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPathLenConstraint() {
        return pathLenConstraint;
    }

    /**
     * Définit la valeur de la propriété pathLenConstraint.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPathLenConstraint(BigInteger value) {
        this.pathLenConstraint = value;
    }

    /**
     * Obtient la valeur de la propriété acceptablePolicySet.
     * 
     * @return
     *     possible object is
     *     {@link AcceptablePoliciesListType }
     *     
     */
    public AcceptablePoliciesListType getAcceptablePolicySet() {
        return acceptablePolicySet;
    }

    /**
     * Définit la valeur de la propriété acceptablePolicySet.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptablePoliciesListType }
     *     
     */
    public void setAcceptablePolicySet(AcceptablePoliciesListType value) {
        this.acceptablePolicySet = value;
    }

    /**
     * Obtient la valeur de la propriété nameConstraints.
     * 
     * @return
     *     possible object is
     *     {@link NameConstraintsType }
     *     
     */
    public NameConstraintsType getNameConstraints() {
        return nameConstraints;
    }

    /**
     * Définit la valeur de la propriété nameConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link NameConstraintsType }
     *     
     */
    public void setNameConstraints(NameConstraintsType value) {
        this.nameConstraints = value;
    }

}
