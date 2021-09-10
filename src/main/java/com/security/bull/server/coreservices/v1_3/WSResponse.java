
package com.security.bull.server.coreservices.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.signserver.adminsig.v1_3.ActivateSignatureKeyResponse;
import com.security.bull.signserver.adminsig.v1_3.CertificateForSignatureKeyResponse;
import com.security.bull.signserver.adminsig.v1_3.CreateSignatureKeyCertResponse;
import com.security.bull.signserver.adminsig.v1_3.CsrForSignatureKeyResponse;
import com.security.bull.signserver.adminsig.v1_3.DeleteSigKeyGenProfileResponse;
import com.security.bull.signserver.adminsig.v1_3.DeleteSignatureKeyResponse;
import com.security.bull.signserver.adminsig.v1_3.DeleteSignaturePolicyResponse;
import com.security.bull.signserver.adminsig.v1_3.DeleteSignatureProfileResponse;
import com.security.bull.signserver.adminsig.v1_3.DepositKeystoreResponse;
import com.security.bull.signserver.adminsig.v1_3.ListSKGPResponse;
import com.security.bull.signserver.adminsig.v1_3.ListSigPolResponse;
import com.security.bull.signserver.adminsig.v1_3.ListSigProfileResponse;
import com.security.bull.signserver.adminsig.v1_3.RetrieveSignaturePolicyResponse;
import com.security.bull.signserver.adminsig.v1_3.RetrieveSignatureProfileResponse;
import com.security.bull.signserver.adminsig.v1_3.RetrieveSkgProfileResponse;


/**
 * A  WebService Response.
 * 
 * <p>Classe Java pour WSResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="returnStatus" use="required" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ReturnStatusEnum" />
 *       &lt;attribute name="errorInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSResponse")
@XmlSeeAlso({
    CreateSignatureKeyCertResponse.class,
    ListSigProfileResponse.class,
    ActivateSignatureKeyResponse.class,
    RetrieveSignatureProfileResponse.class,
    RetrieveSkgProfileResponse.class,
    DeleteSignatureKeyResponse.class,
    RetrieveSignaturePolicyResponse.class,
    CsrForSignatureKeyResponse.class,
    DeleteSignaturePolicyResponse.class,
    DeleteSignatureProfileResponse.class,
    CertificateForSignatureKeyResponse.class,
    ListSigPolResponse.class,
    ListSKGPResponse.class,
    DeleteSigKeyGenProfileResponse.class,
    ArtifactIdResponse.class,
    DepositKeystoreResponse.class
})
public class WSResponse {

    @XmlAttribute(name = "returnStatus", required = true)
    protected ReturnStatusEnum returnStatus;
    @XmlAttribute(name = "errorInfo")
    protected String errorInfo;

    /**
     * Obtient la valeur de la propriété returnStatus.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStatusEnum }
     *     
     */
    public ReturnStatusEnum getReturnStatus() {
        return returnStatus;
    }

    /**
     * Définit la valeur de la propriété returnStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStatusEnum }
     *     
     */
    public void setReturnStatus(ReturnStatusEnum value) {
        this.returnStatus = value;
    }

    /**
     * Obtient la valeur de la propriété errorInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * Définit la valeur de la propriété errorInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorInfo(String value) {
        this.errorInfo = value;
    }

}
