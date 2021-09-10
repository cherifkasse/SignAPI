
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SCEPRequestResult complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SCEPRequestResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}RequestCertificateResult">
 *       &lt;attribute name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="failInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCEPRequestResult")
public class SCEPRequestResult
    extends RequestCertificateResult
{

    @XmlAttribute(name = "transactionID")
    protected String transactionID;
    @XmlAttribute(name = "failInfo")
    protected String failInfo;

    /**
     * Obtient la valeur de la propriété transactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Définit la valeur de la propriété transactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Obtient la valeur de la propriété failInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailInfo() {
        return failInfo;
    }

    /**
     * Définit la valeur de la propriété failInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailInfo(String value) {
        this.failInfo = value;
    }

}
