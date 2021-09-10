
package com.security.bull.server.coreservices.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour UserTypeEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UserTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="com.bull.security.server.core.Application"/>
 *     &lt;enumeration value="com.bull.security.server.core.User"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserTypeEnum")
@XmlEnum
public enum UserTypeEnum {

    @XmlEnumValue("com.bull.security.server.core.Application")
    COM_BULL_SECURITY_SERVER_CORE_APPLICATION("com.bull.security.server.core.Application"),
    @XmlEnumValue("com.bull.security.server.core.User")
    COM_BULL_SECURITY_SERVER_CORE_USER("com.bull.security.server.core.User");
    private final String value;

    UserTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserTypeEnum fromValue(String v) {
        for (UserTypeEnum c: UserTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
