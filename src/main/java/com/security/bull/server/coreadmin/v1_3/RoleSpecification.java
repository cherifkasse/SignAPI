
package com.security.bull.server.coreadmin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.signserver.extensions.v1_3.SignManager;
import com.security.bull.signserver.extensions.v1_3.Signer;


/**
 * Definition of a non-existing or queried Role.
 * 
 * <p>Classe Java pour RoleSpecification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoleSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}Role">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleSpecification")
@XmlSeeAlso({
    ServerManager.class,
    Auditor.class,
    Signer.class,
    SignManager.class
})
public abstract class RoleSpecification
    extends Role
{


}
