
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RevocationReqType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RevocationReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnuRevReq" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}EnuRevReqType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevocationReqType", propOrder = {
    "enuRevReq"
})
public class RevocationReqType {

    @XmlElement(name = "EnuRevReq", required = true)
    @XmlSchemaType(name = "string")
    protected EnuRevReqType enuRevReq;

    /**
     * Obtient la valeur de la propriété enuRevReq.
     * 
     * @return
     *     possible object is
     *     {@link EnuRevReqType }
     *     
     */
    public EnuRevReqType getEnuRevReq() {
        return enuRevReq;
    }

    /**
     * Définit la valeur de la propriété enuRevReq.
     * 
     * @param value
     *     allowed object is
     *     {@link EnuRevReqType }
     *     
     */
    public void setEnuRevReq(EnuRevReqType value) {
        this.enuRevReq = value;
    }

}
