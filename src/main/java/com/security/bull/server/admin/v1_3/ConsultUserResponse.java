
package com.security.bull.server.admin.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.security.bull.server.coreservices.v1_3.ServerId2NameInfo;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * <p>Classe Java pour ConsultUserResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultUserResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bull.security.com/Server/coreServices/v1.3.0/}WSResponse">
 *       &lt;sequence>
 *         &lt;element name="roles" type="{http://www.bull.security.com/Server/admin/v1.3.0/}RoleDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="credentials" type="{http://www.bull.security.com/Server/admin/v1.3.0/}CredentialDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groups" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId2NameInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trustedApplications" type="{http://www.bull.security.com/Server/coreServices/v1.3.0/}ServerId2NameInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultUserResponse", propOrder = {
    "roles",
    "credentials",
    "groups",
    "trustedApplications"
})
public class ConsultUserResponse
    extends WSResponse
{

    protected List<RoleDescription> roles;
    protected List<CredentialDescription> credentials;
    protected List<ServerId2NameInfo> groups;
    protected List<ServerId2NameInfo> trustedApplications;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleDescription }
     * 
     * 
     */
    public List<RoleDescription> getRoles() {
        if (roles == null) {
            roles = new ArrayList<RoleDescription>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credentials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredentials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CredentialDescription }
     * 
     * 
     */
    public List<CredentialDescription> getCredentials() {
        if (credentials == null) {
            credentials = new ArrayList<CredentialDescription>();
        }
        return this.credentials;
    }

    /**
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerId2NameInfo }
     * 
     * 
     */
    public List<ServerId2NameInfo> getGroups() {
        if (groups == null) {
            groups = new ArrayList<ServerId2NameInfo>();
        }
        return this.groups;
    }

    /**
     * Gets the value of the trustedApplications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustedApplications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrustedApplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerId2NameInfo }
     * 
     * 
     */
    public List<ServerId2NameInfo> getTrustedApplications() {
        if (trustedApplications == null) {
            trustedApplications = new ArrayList<ServerId2NameInfo>();
        }
        return this.trustedApplications;
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
