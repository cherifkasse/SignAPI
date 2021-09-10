
package com.security.bull.server.coreadmin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A new Admin (server administrator).
 * 
 * <p>Classe Java pour ServerManager complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ServerManager">
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
@XmlType(name = "ServerManager")
public class ServerManager
    extends RoleSpecification
{


}
