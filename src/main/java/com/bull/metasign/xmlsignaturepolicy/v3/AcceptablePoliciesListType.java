
package com.bull.metasign.xmlsignaturepolicy.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AcceptablePoliciesListType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AcceptablePoliciesListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="AcceptablePolicy" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}ObjectIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptablePoliciesListType", propOrder = {
    "acceptablePolicy"
})
public class AcceptablePoliciesListType {

    @XmlElement(name = "AcceptablePolicy", required = true)
    protected List<ObjectIdentifierType> acceptablePolicy;

    /**
     * Gets the value of the acceptablePolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptablePolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptablePolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectIdentifierType }
     * 
     * 
     */
    public List<ObjectIdentifierType> getAcceptablePolicy() {
        if (acceptablePolicy == null) {
            acceptablePolicy = new ArrayList<ObjectIdentifierType>();
        }
        return this.acceptablePolicy;
    }

}
