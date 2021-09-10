
package com.security.bull.server.coreadmin.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An Application. It may be either one of ApplicationSpecification, or ApplicationReference depending if it respectively designates a new (or queried) Application or an existing one.
 * 
 * <p>Classe Java pour Application complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Application">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreAdmin/v1.3.0/}User">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application")
@XmlSeeAlso({
    ApplicationSpecification.class,
    ApplicationReference.class
})
public abstract class Application
    extends User
{


}
