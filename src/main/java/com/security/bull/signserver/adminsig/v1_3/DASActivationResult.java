
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DASActivationResult complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DASActivationResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}ActivationResult">
 *       &lt;attribute name="dynamicChallenge" use="required" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DASActivationResult")
public class DASActivationResult
    extends ActivationResult
{

    @XmlAttribute(name = "dynamicChallenge", required = true)
    protected byte[] dynamicChallenge;

    /**
     * Obtient la valeur de la propriété dynamicChallenge.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDynamicChallenge() {
        return dynamicChallenge;
    }

    /**
     * Définit la valeur de la propriété dynamicChallenge.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDynamicChallenge(byte[] value) {
        this.dynamicChallenge = value;
    }

}
