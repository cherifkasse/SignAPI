
package com.security.bull.server.admin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * <p>Classe Java pour DepositKeystoreResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DepositKeystoreResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;attribute name="keystoreId" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositKeystoreResponse")
public class DepositKeystoreResponse
    extends WSResponse
{

    @XmlAttribute(name = "keystoreId")
    protected String keystoreId;

    /**
     * Obtient la valeur de la propriété keystoreId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeystoreId() {
        return keystoreId;
    }

    /**
     * Définit la valeur de la propriété keystoreId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeystoreId(String value) {
        this.keystoreId = value;
    }

}
