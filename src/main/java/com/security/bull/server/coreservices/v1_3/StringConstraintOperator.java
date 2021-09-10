
package com.security.bull.server.coreservices.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StringConstraintOperator.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StringConstraintOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="BEGINS_WITH"/>
 *     &lt;enumeration value="ENDS_WITH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StringConstraintOperator")
@XmlEnum
public enum StringConstraintOperator {

    EQUALS,
    CONTAINS,
    BEGINS_WITH,
    ENDS_WITH;

    public String value() {
        return name();
    }

    public static StringConstraintOperator fromValue(String v) {
        return valueOf(v);
    }

}
