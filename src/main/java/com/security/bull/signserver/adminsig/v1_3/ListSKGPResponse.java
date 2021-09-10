
package com.security.bull.signserver.adminsig.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.ServerId2NameInfo;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * <p>Classe Java pour ListSKGPResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListSKGPResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;sequence>
 *         &lt;element name="skgProfileInfos" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId2NameInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListSKGPResponse", propOrder = {
    "skgProfileInfos"
})
public class ListSKGPResponse
    extends WSResponse
{

    protected List<ServerId2NameInfo> skgProfileInfos;

    /**
     * Gets the value of the skgProfileInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skgProfileInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkgProfileInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerId2NameInfo }
     * 
     * 
     */
    public List<ServerId2NameInfo> getSkgProfileInfos() {
        if (skgProfileInfos == null) {
            skgProfileInfos = new ArrayList<ServerId2NameInfo>();
        }
        return this.skgProfileInfos;
    }

}
