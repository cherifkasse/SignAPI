
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * <p>Classe Java pour DeleteSignaturePolicyResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DeleteSignaturePolicyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;sequence>
 *         &lt;element name="signaturePolicyOid" type="{http://www.bull.security.com/netUtils}OID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSignaturePolicyResponse", propOrder = {
    "signaturePolicyOid"
})
public class DeleteSignaturePolicyResponse
    extends WSResponse
{

    protected String signaturePolicyOid;

    /**
     * Obtient la valeur de la propriété signaturePolicyOid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignaturePolicyOid() {
        return signaturePolicyOid;
    }

    /**
     * Définit la valeur de la propriété signaturePolicyOid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignaturePolicyOid(String value) {
        this.signaturePolicyOid = value;
    }

}
