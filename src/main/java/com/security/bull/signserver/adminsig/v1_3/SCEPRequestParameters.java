
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * SCEP specific parameters.
 * 
 * <p>Classe Java pour SCEPRequestParameters complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SCEPRequestParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}CertificateRequestParameters">
 *       &lt;attribute name="challengePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCEPRequestParameters")
public class SCEPRequestParameters
    extends CertificateRequestParameters
{

    @XmlAttribute(name = "challengePassword")
    protected String challengePassword;
    @XmlAttribute(name = "transactionID")
    protected String transactionID;

    /**
     * Obtient la valeur de la propriété challengePassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengePassword() {
        return challengePassword;
    }

    /**
     * Définit la valeur de la propriété challengePassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengePassword(String value) {
        this.challengePassword = value;
    }

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

}
