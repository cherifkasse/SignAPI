
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SelectedCommitmentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SelectedCommitmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Empty" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="RecognizedCommitmentType" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}CommitmentType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedCommitmentType", propOrder = {
    "empty",
    "recognizedCommitmentType"
})
public class SelectedCommitmentType {

    @XmlElement(name = "Empty")
    protected Object empty;
    @XmlElement(name = "RecognizedCommitmentType")
    protected CommitmentType recognizedCommitmentType;

    /**
     * Obtient la valeur de la propriété empty.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmpty() {
        return empty;
    }

    /**
     * Définit la valeur de la propriété empty.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmpty(Object value) {
        this.empty = value;
    }

    /**
     * Obtient la valeur de la propriété recognizedCommitmentType.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentType }
     *     
     */
    public CommitmentType getRecognizedCommitmentType() {
        return recognizedCommitmentType;
    }

    /**
     * Définit la valeur de la propriété recognizedCommitmentType.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentType }
     *     
     */
    public void setRecognizedCommitmentType(CommitmentType value) {
        this.recognizedCommitmentType = value;
    }

}
