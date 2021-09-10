
package com.security.bull.server.coreservices.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArtifactInfoFile complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArtifactInfoFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptions" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}DescriptionEntry" maxOccurs="unbounded"/>
 *         &lt;element name="keyWords" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}KeywordsEntry" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArtifactInfoFile", propOrder = {
    "descriptions",
    "keyWords"
})
public class ArtifactInfoFile {

    @XmlElement(required = true)
    protected List<DescriptionEntry> descriptions;
    @XmlElement(required = true)
    protected List<KeywordsEntry> keyWords;

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionEntry }
     * 
     * 
     */
    public List<DescriptionEntry> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<DescriptionEntry>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the keyWords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyWords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyWords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordsEntry }
     * 
     * 
     */
    public List<KeywordsEntry> getKeyWords() {
        if (keyWords == null) {
            keyWords = new ArrayList<KeywordsEntry>();
        }
        return this.keyWords;
    }

}
