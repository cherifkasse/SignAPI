
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSDeleteSignaturePolicy complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSDeleteSignaturePolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;attribute name="signaturePolicyOid" use="required" type="{http://www.bull.security.com/netUtils}OID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDeleteSignaturePolicy")
public class WSDeleteSignaturePolicy
    extends WSOperation
{

    @XmlAttribute(name = "signaturePolicyOid", required = true)
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
