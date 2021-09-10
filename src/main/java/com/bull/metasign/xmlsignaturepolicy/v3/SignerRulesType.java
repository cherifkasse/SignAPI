
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SignerRulesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignerRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MandatedSignedQProperties" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}QPropertiesListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerRulesType", propOrder = {
    "mandatedSignedQProperties"
})
public class SignerRulesType {

    @XmlElement(name = "MandatedSignedQProperties", required = true)
    protected QPropertiesListType mandatedSignedQProperties;

    /**
     * Obtient la valeur de la propriété mandatedSignedQProperties.
     * 
     * @return
     *     possible object is
     *     {@link QPropertiesListType }
     *     
     */
    public QPropertiesListType getMandatedSignedQProperties() {
        return mandatedSignedQProperties;
    }

    /**
     * Définit la valeur de la propriété mandatedSignedQProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link QPropertiesListType }
     *     
     */
    public void setMandatedSignedQProperties(QPropertiesListType value) {
        this.mandatedSignedQProperties = value;
    }

}
