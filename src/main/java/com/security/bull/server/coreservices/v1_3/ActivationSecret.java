
package com.security.bull.server.coreservices.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An activation secret. It protects the access to a users's sensitive object made through Web-Services.
 * In the Signserver extension, an activation secret protects the access to all signer's signature keys and is required for all WSOperations making use of a signature key.
 * 
 * <p>Classe Java pour ActivationSecret complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ActivationSecret">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationSecret")
@XmlSeeAlso({
    PassphraseActivationSecret.class
})
public abstract class ActivationSecret {


}
