
package com.security.bull.server.coreservices.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReturnStatusEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MSIGN_SRV_STATUS_SUCCESS"/>
 *     &lt;enumeration value="MSIGN_SRV_STATUS_INTERNAL_ERROR"/>
 *     &lt;enumeration value="MSIGN_SRV_STATUS_REJECTED_REQUEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnStatusEnum")
@XmlEnum
public enum ReturnStatusEnum {

    MSIGN_SRV_STATUS_SUCCESS,
    MSIGN_SRV_STATUS_INTERNAL_ERROR,
    MSIGN_SRV_STATUS_REJECTED_REQUEST;

    public String value() {
        return name();
    }

    public static ReturnStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
