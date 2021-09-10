
package com.security.bull.signserver.sigservices.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SubFilter.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SubFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="adbe.pkcs7.detached"/>
 *     &lt;enumeration value="ETSI.CAdES.detached"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubFilter")
@XmlEnum
public enum SubFilter {

    @XmlEnumValue("adbe.pkcs7.detached")
    ADBE_PKCS_7_DETACHED("adbe.pkcs7.detached"),
    @XmlEnumValue("ETSI.CAdES.detached")
    ETSI_C_AD_ES_DETACHED("ETSI.CAdES.detached");
    private final String value;

    SubFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubFilter fromValue(String v) {
        for (SubFilter c: SubFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
