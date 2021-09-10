
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CertificateRevReqType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CertificateRevReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndRevReq" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}RevocationReqType"/>
 *         &lt;element name="CACerts" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}RevocationReqType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateRevReqType", propOrder = {
    "endRevReq",
    "caCerts"
})
public class CertificateRevReqType {

    @XmlElement(name = "EndRevReq", required = true)
    protected RevocationReqType endRevReq;
    @XmlElement(name = "CACerts", required = true)
    protected RevocationReqType caCerts;

    /**
     * Obtient la valeur de la propriété endRevReq.
     * 
     * @return
     *     possible object is
     *     {@link RevocationReqType }
     *     
     */
    public RevocationReqType getEndRevReq() {
        return endRevReq;
    }

    /**
     * Définit la valeur de la propriété endRevReq.
     * 
     * @param value
     *     allowed object is
     *     {@link RevocationReqType }
     *     
     */
    public void setEndRevReq(RevocationReqType value) {
        this.endRevReq = value;
    }

    /**
     * Obtient la valeur de la propriété caCerts.
     * 
     * @return
     *     possible object is
     *     {@link RevocationReqType }
     *     
     */
    public RevocationReqType getCACerts() {
        return caCerts;
    }

    /**
     * Définit la valeur de la propriété caCerts.
     * 
     * @param value
     *     allowed object is
     *     {@link RevocationReqType }
     *     
     */
    public void setCACerts(RevocationReqType value) {
        this.caCerts = value;
    }

}
