
package com.security.bull.signserver.extensions.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreadmin.v1_3.RoleSpecification;


/**
 * <p>Classe Java pour SignManager complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignManager">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}RoleSpecification">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignManager")
public class SignManager
    extends RoleSpecification
{


}
