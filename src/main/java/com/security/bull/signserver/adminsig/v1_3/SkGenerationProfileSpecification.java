
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SkGenerationProfileSpecification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SkGenerationProfileSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}SkGenerationProfile">
 *       &lt;sequence>
 *         &lt;element name="kpAlgo" type="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}KPType"/>
 *         &lt;element name="algoParameters" type="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}AlgoParameters" minOccurs="0"/>
 *         &lt;element name="enforcedAuthentication" type="{http://www.bull.security.com/SignServer/adminSig/v1.3.0/}EnforcedAuthenticationMethod" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkGenerationProfileSpecification", propOrder = {
    "kpAlgo",
    "algoParameters",
    "enforcedAuthentication"
})
public class SkGenerationProfileSpecification
    extends SkGenerationProfile
{

    @XmlElement(required = true)
    protected KPType kpAlgo;
    protected AlgoParameters algoParameters;
    protected EnforcedAuthenticationMethod enforcedAuthentication;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Obtient la valeur de la propriété kpAlgo.
     * 
     * @return
     *     possible object is
     *     {@link KPType }
     *     
     */
    public KPType getKpAlgo() {
        return kpAlgo;
    }

    /**
     * Définit la valeur de la propriété kpAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link KPType }
     *     
     */
    public void setKpAlgo(KPType value) {
        this.kpAlgo = value;
    }

    /**
     * Obtient la valeur de la propriété algoParameters.
     * 
     * @return
     *     possible object is
     *     {@link AlgoParameters }
     *     
     */
    public AlgoParameters getAlgoParameters() {
        return algoParameters;
    }

    /**
     * Définit la valeur de la propriété algoParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgoParameters }
     *     
     */
    public void setAlgoParameters(AlgoParameters value) {
        this.algoParameters = value;
    }

    /**
     * Obtient la valeur de la propriété enforcedAuthentication.
     * 
     * @return
     *     possible object is
     *     {@link EnforcedAuthenticationMethod }
     *     
     */
    public EnforcedAuthenticationMethod getEnforcedAuthentication() {
        return enforcedAuthentication;
    }

    /**
     * Définit la valeur de la propriété enforcedAuthentication.
     * 
     * @param value
     *     allowed object is
     *     {@link EnforcedAuthenticationMethod }
     *     
     */
    public void setEnforcedAuthentication(EnforcedAuthenticationMethod value) {
        this.enforcedAuthentication = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
