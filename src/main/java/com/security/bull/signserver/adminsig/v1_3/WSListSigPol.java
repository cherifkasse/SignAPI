
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.Chain;
import com.security.bull.server.coreservices.v1_3.WSOperation;


/**
 * <p>Classe Java pour WSListSigPol complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSListSigPol">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSOperation">
 *       &lt;sequence>
 *         &lt;element name="constraintChain" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}Chain" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSListSigPol", propOrder = {
    "constraintChain"
})
public class WSListSigPol
    extends WSOperation
{

    protected Chain constraintChain;

    /**
     * Obtient la valeur de la propriété constraintChain.
     * 
     * @return
     *     possible object is
     *     {@link Chain }
     *     
     */
    public Chain getConstraintChain() {
        return constraintChain;
    }

    /**
     * Définit la valeur de la propriété constraintChain.
     * 
     * @param value
     *     allowed object is
     *     {@link Chain }
     *     
     */
    public void setConstraintChain(Chain value) {
        this.constraintChain = value;
    }

}
