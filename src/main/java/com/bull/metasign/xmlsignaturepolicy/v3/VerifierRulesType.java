
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VerifierRulesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VerifierRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MandatedQUnsignedProperties" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}QPropertiesListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifierRulesType", propOrder = {
    "mandatedQUnsignedProperties"
})
public class VerifierRulesType {

    @XmlElement(name = "MandatedQUnsignedProperties", required = true)
    protected QPropertiesListType mandatedQUnsignedProperties;

    /**
     * Obtient la valeur de la propriété mandatedQUnsignedProperties.
     * 
     * @return
     *     possible object is
     *     {@link QPropertiesListType }
     *     
     */
    public QPropertiesListType getMandatedQUnsignedProperties() {
        return mandatedQUnsignedProperties;
    }

    /**
     * Définit la valeur de la propriété mandatedQUnsignedProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link QPropertiesListType }
     *     
     */
    public void setMandatedQUnsignedProperties(QPropertiesListType value) {
        this.mandatedQUnsignedProperties = value;
    }

}
