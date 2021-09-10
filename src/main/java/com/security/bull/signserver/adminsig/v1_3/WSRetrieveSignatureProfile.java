
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSRetrieveSignatureProfile complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSRetrieveSignatureProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;attribute name="signatureProfileId" use="required" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRetrieveSignatureProfile")
public class WSRetrieveSignatureProfile
    extends WSOperation
{

    @XmlAttribute(name = "signatureProfileId", required = true)
    protected String signatureProfileId;

    /**
     * Obtient la valeur de la propriété signatureProfileId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureProfileId() {
        return signatureProfileId;
    }

    /**
     * Définit la valeur de la propriété signatureProfileId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureProfileId(String value) {
        this.signatureProfileId = value;
    }

}
