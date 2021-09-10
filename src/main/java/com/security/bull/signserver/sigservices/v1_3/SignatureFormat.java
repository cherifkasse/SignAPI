
package com.security.bull.signserver.sigservices.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SignatureFormat.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CMS"/>
 *     &lt;enumeration value="CADES_BES"/>
 *     &lt;enumeration value="CADES_EPES"/>
 *     &lt;enumeration value="XADES_BES"/>
 *     &lt;enumeration value="XADES_EPES"/>
 *     &lt;enumeration value="PADES_BES"/>
 *     &lt;enumeration value="PADES_EPES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignatureFormat")
@XmlEnum
public enum SignatureFormat {

    CMS,
    CADES_BES,
    CADES_EPES,
    XADES_BES,
    XADES_EPES,
    PADES_BES,
    PADES_EPES;

    public String value() {
        return name();
    }

    public static SignatureFormat fromValue(String v) {
        return valueOf(v);
    }

}
