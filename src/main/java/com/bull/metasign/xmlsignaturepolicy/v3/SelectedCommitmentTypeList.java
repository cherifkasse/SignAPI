
package com.bull.metasign.xmlsignaturepolicy.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SelectedCommitmentTypeList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SelectedCommitmentTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="SelCommitmentType" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}SelectedCommitmentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedCommitmentTypeList", propOrder = {
    "selCommitmentType"
})
public class SelectedCommitmentTypeList {

    @XmlElement(name = "SelCommitmentType", required = true)
    protected List<SelectedCommitmentType> selCommitmentType;

    /**
     * Gets the value of the selCommitmentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selCommitmentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelCommitmentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedCommitmentType }
     * 
     * 
     */
    public List<SelectedCommitmentType> getSelCommitmentType() {
        if (selCommitmentType == null) {
            selCommitmentType = new ArrayList<SelectedCommitmentType>();
        }
        return this.selCommitmentType;
    }

}
