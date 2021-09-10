
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnuRevReqType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnuRevReqType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="clrcheck"/>
 *     &lt;enumeration value="ocspcheck"/>
 *     &lt;enumeration value="bothcheck"/>
 *     &lt;enumeration value="nocheck"/>
 *     &lt;enumeration value="eitherCheck"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnuRevReqType")
@XmlEnum
public enum EnuRevReqType {

    @XmlEnumValue("clrcheck")
    CLRCHECK("clrcheck"),
    @XmlEnumValue("ocspcheck")
    OCSPCHECK("ocspcheck"),
    @XmlEnumValue("bothcheck")
    BOTHCHECK("bothcheck"),
    @XmlEnumValue("nocheck")
    NOCHECK("nocheck"),
    @XmlEnumValue("eitherCheck")
    EITHER_CHECK("eitherCheck"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EnuRevReqType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnuRevReqType fromValue(String v) {
        for (EnuRevReqType c: EnuRevReqType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
