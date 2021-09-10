
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlgorithmConstraintSetType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlgorithmConstraintSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignerAlgConstraints" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}AlgConstraintsListType" minOccurs="0"/>
 *         &lt;element name="EeCertAlgConstraints" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}AlgConstraintsListType" minOccurs="0"/>
 *         &lt;element name="CACertAlgConstraints" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}AlgConstraintsListType" minOccurs="0"/>
 *         &lt;element name="TSACertAlgConstraints" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}AlgConstraintsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmConstraintSetType", propOrder = {
    "signerAlgConstraints",
    "eeCertAlgConstraints",
    "caCertAlgConstraints",
    "tsaCertAlgConstraints"
})
public class AlgorithmConstraintSetType {

    @XmlElement(name = "SignerAlgConstraints")
    protected AlgConstraintsListType signerAlgConstraints;
    @XmlElement(name = "EeCertAlgConstraints")
    protected AlgConstraintsListType eeCertAlgConstraints;
    @XmlElement(name = "CACertAlgConstraints")
    protected AlgConstraintsListType caCertAlgConstraints;
    @XmlElement(name = "TSACertAlgConstraints")
    protected AlgConstraintsListType tsaCertAlgConstraints;

    /**
     * Obtient la valeur de la propriété signerAlgConstraints.
     * 
     * @return
     *     possible object is
     *     {@link AlgConstraintsListType }
     *     
     */
    public AlgConstraintsListType getSignerAlgConstraints() {
        return signerAlgConstraints;
    }

    /**
     * Définit la valeur de la propriété signerAlgConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgConstraintsListType }
     *     
     */
    public void setSignerAlgConstraints(AlgConstraintsListType value) {
        this.signerAlgConstraints = value;
    }

    /**
     * Obtient la valeur de la propriété eeCertAlgConstraints.
     * 
     * @return
     *     possible object is
     *     {@link AlgConstraintsListType }
     *     
     */
    public AlgConstraintsListType getEeCertAlgConstraints() {
        return eeCertAlgConstraints;
    }

    /**
     * Définit la valeur de la propriété eeCertAlgConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgConstraintsListType }
     *     
     */
    public void setEeCertAlgConstraints(AlgConstraintsListType value) {
        this.eeCertAlgConstraints = value;
    }

    /**
     * Obtient la valeur de la propriété caCertAlgConstraints.
     * 
     * @return
     *     possible object is
     *     {@link AlgConstraintsListType }
     *     
     */
    public AlgConstraintsListType getCACertAlgConstraints() {
        return caCertAlgConstraints;
    }

    /**
     * Définit la valeur de la propriété caCertAlgConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgConstraintsListType }
     *     
     */
    public void setCACertAlgConstraints(AlgConstraintsListType value) {
        this.caCertAlgConstraints = value;
    }

    /**
     * Obtient la valeur de la propriété tsaCertAlgConstraints.
     * 
     * @return
     *     possible object is
     *     {@link AlgConstraintsListType }
     *     
     */
    public AlgConstraintsListType getTSACertAlgConstraints() {
        return tsaCertAlgConstraints;
    }

    /**
     * Définit la valeur de la propriété tsaCertAlgConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgConstraintsListType }
     *     
     */
    public void setTSACertAlgConstraints(AlgConstraintsListType value) {
        this.tsaCertAlgConstraints = value;
    }

}
