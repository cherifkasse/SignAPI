
package com.bull.metasign.xmlsignaturepolicy.v3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlgAndLengthType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlgAndLengthType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlgId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="MinKeyLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgAndLengthType", propOrder = {
    "algId",
    "minKeyLength"
})
public class AlgAndLengthType {

    @XmlElement(name = "AlgId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String algId;
    @XmlElement(name = "MinKeyLength")
    protected BigInteger minKeyLength;

    /**
     * Obtient la valeur de la propriété algId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgId() {
        return algId;
    }

    /**
     * Définit la valeur de la propriété algId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgId(String value) {
        this.algId = value;
    }

    /**
     * Obtient la valeur de la propriété minKeyLength.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinKeyLength() {
        return minKeyLength;
    }

    /**
     * Définit la valeur de la propriété minKeyLength.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinKeyLength(BigInteger value) {
        this.minKeyLength = value;
    }

}
