
package com.security.bull.signserver.sigservices.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CanonicalizationAlgo.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CanonicalizationAlgo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCLUSIVE"/>
 *     &lt;enumeration value="INCLUSIVE_WITH_COMMENTS"/>
 *     &lt;enumeration value="EXCLUSIVE"/>
 *     &lt;enumeration value="EXCLUSIVE_WITH_COMMENTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CanonicalizationAlgo")
@XmlEnum
public enum CanonicalizationAlgo {

    INCLUSIVE,
    INCLUSIVE_WITH_COMMENTS,
    EXCLUSIVE,
    EXCLUSIVE_WITH_COMMENTS;

    public String value() {
        return name();
    }

    public static CanonicalizationAlgo fromValue(String v) {
        return valueOf(v);
    }

}
