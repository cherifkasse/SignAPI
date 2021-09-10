
package com.security.bull.server.coreservices.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.signserver.adminsig.v1_3.WSActivateSignatureKey;
import com.security.bull.signserver.adminsig.v1_3.WSDeleteSigKeyGenProfile;
import com.security.bull.signserver.adminsig.v1_3.WSDeleteSignaturePolicy;
import com.security.bull.signserver.adminsig.v1_3.WSDeleteSignatureProfile;
import com.security.bull.signserver.adminsig.v1_3.WSDepSigKeyGenProfile;
import com.security.bull.signserver.adminsig.v1_3.WSDepositKeystore;
import com.security.bull.signserver.adminsig.v1_3.WSDepositSignaturePolicy;
import com.security.bull.signserver.adminsig.v1_3.WSDepositSignatureProfile;
import com.security.bull.signserver.adminsig.v1_3.WSListSKGP;
import com.security.bull.signserver.adminsig.v1_3.WSListSigPol;
import com.security.bull.signserver.adminsig.v1_3.WSListSigProfile;
import com.security.bull.signserver.adminsig.v1_3.WSRetrieveSignaturePolicy;
import com.security.bull.signserver.adminsig.v1_3.WSRetrieveSignatureProfile;
import com.security.bull.signserver.adminsig.v1_3.WSRetrieveSkgProfile;
import com.security.bull.signserver.adminsig.v1_3.WSUpdateSigProf;
import com.security.bull.signserver.adminsig.v1_3.WSUpdateSkgProfile;
import com.security.bull.signserver.sigservices.v1_3.WSSignatureOperation;


/**
 * A  WebService Operation.
 * 
 * <p>Classe Java pour WSOperation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WSOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="inDelegationOf" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSOperation")
@XmlSeeAlso({
    WSRetrieveSkgProfile.class,
    WSRetrieveSignatureProfile.class,
    WSDeleteSignaturePolicy.class,
    WSDeleteSigKeyGenProfile.class,
    WSDepositKeystore.class,
    WSDepositSignaturePolicy.class,
    WSDepSigKeyGenProfile.class,
    WSListSigProfile.class,
    WSDeleteSignatureProfile.class,
    WSUpdateSigProf.class,
    WSListSKGP.class,
    WSActivateSignatureKey.class,
    WSUpdateSkgProfile.class,
    WSRetrieveSignaturePolicy.class,
    WSDepositSignatureProfile.class,
    WSListSigPol.class,
    WSSignatureOperation.class
})
public class WSOperation {

    @XmlAttribute(name = "inDelegationOf")
    protected String inDelegationOf;

    /**
     * Obtient la valeur de la propriété inDelegationOf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDelegationOf() {
        return inDelegationOf;
    }

    /**
     * Définit la valeur de la propriété inDelegationOf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDelegationOf(String value) {
        this.inDelegationOf = value;
    }

}
