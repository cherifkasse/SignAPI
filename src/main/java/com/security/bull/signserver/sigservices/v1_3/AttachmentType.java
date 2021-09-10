
package com.security.bull.signserver.sigservices.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AttachmentType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DETACHED"/>
 *     &lt;enumeration value="ENVELOPING"/>
 *     &lt;enumeration value="ENVELOPED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentType")
@XmlEnum
public enum AttachmentType {


    /**
     * A detached signature. Signature and documents are in separated files.
     * 
     */
    DETACHED,

    /**
     * An enveloping signature (document inside signature).
     * 
     */
    ENVELOPING,

    /**
     * An enveloped signature. The signature is contained inside a document.
     * 
     */
    ENVELOPED;

    public String value() {
        return name();
    }

    public static AttachmentType fromValue(String v) {
        return valueOf(v);
    }

}
