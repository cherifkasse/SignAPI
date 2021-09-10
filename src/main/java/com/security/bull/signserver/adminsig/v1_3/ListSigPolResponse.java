
package com.security.bull.signserver.adminsig.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * <p>Classe Java pour ListSigPolResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListSigPolResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;sequence>
 *         &lt;element name="signaturePolicyInfos" type="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}SigPolInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListSigPolResponse", propOrder = {
    "signaturePolicyInfos"
})
public class ListSigPolResponse
    extends WSResponse
{

    protected List<SigPolInfo> signaturePolicyInfos;

    /**
     * Gets the value of the signaturePolicyInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signaturePolicyInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignaturePolicyInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SigPolInfo }
     * 
     * 
     */
    public List<SigPolInfo> getSignaturePolicyInfos() {
        if (signaturePolicyInfos == null) {
            signaturePolicyInfos = new ArrayList<SigPolInfo>();
        }
        return this.signaturePolicyInfos;
    }

}
