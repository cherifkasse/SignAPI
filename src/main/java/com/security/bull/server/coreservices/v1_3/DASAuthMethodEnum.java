
package com.security.bull.server.coreservices.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DASAuthMethodEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DASAuthMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASIC_OTP"/>
 *     &lt;enumeration value="OTP_WITH_HASH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DASAuthMethodEnum")
@XmlEnum
public enum DASAuthMethodEnum {

    BASIC_OTP,
    OTP_WITH_HASH;

    public String value() {
        return name();
    }

    public static DASAuthMethodEnum fromValue(String v) {
        return valueOf(v);
    }

}
