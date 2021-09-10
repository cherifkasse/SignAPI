
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSDeleteSigKeyGenProfile complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSDeleteSigKeyGenProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;attribute name="sigKeyGenProfileId" use="required" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDeleteSigKeyGenProfile")
public class WSDeleteSigKeyGenProfile
    extends WSOperation
{

    @XmlAttribute(name = "sigKeyGenProfileId", required = true)
    protected String sigKeyGenProfileId;

    /**
     * Obtient la valeur de la propriété sigKeyGenProfileId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigKeyGenProfileId() {
        return sigKeyGenProfileId;
    }

    /**
     * Définit la valeur de la propriété sigKeyGenProfileId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigKeyGenProfileId(String value) {
        this.sigKeyGenProfileId = value;
    }

}
