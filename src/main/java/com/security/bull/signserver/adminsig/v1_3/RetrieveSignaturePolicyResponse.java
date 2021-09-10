
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bull.metasign.xmlsignaturepolicy.v3.SignaturePolicy;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * <p>Classe Java pour RetrieveSignaturePolicyResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveSignaturePolicyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;sequence>
 *         &lt;element name="signaturePolicy" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SignaturePolicy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveSignaturePolicyResponse", propOrder = {
    "signaturePolicy"
})
public class RetrieveSignaturePolicyResponse
    extends WSResponse
{

    protected SignaturePolicy signaturePolicy;

    /**
     * Obtient la valeur de la propriété signaturePolicy.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicy }
     *     
     */
    public SignaturePolicy getSignaturePolicy() {
        return signaturePolicy;
    }

    /**
     * Définit la valeur de la propriété signaturePolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicy }
     *     
     */
    public void setSignaturePolicy(SignaturePolicy value) {
        this.signaturePolicy = value;
    }

}
