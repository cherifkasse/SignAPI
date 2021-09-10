
package com.security.bull.signserver.sigservices.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AugmentationType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AugmentationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="XL"/>
 *     &lt;enumeration value="LTV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AugmentationType")
@XmlEnum
public enum AugmentationType {

    NONE,
    T,
    C,
    XL,
    LTV;

    public String value() {
        return name();
    }

    public static AugmentationType fromValue(String v) {
        return valueOf(v);
    }

}
