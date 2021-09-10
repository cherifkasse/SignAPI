
package com.security.bull.signserver.sigservices.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.bull.metasign.xmlsignaturepolicy.v3.CommitmentType;
import com.bull.metasign.xmlsignaturepolicy.v3.TransformsType;
//import org.w3._2000._09.xmldsig_.TransformsType;


/**
 * <p>Classe Java pour SignatureProfileSpecification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignatureProfileSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signaturePolicyOid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verificationPolicyOid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachment" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}AttachmentType"/>
 *         &lt;element name="format" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}SignatureFormat"/>
 *         &lt;element name="augmentation" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}AugmentationType"/>
 *         &lt;element name="commitments" type="{http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#}CommitmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signerRole" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}SignerRole" minOccurs="0"/>
 *         &lt;element name="signatureAlgoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transformationAlgo" type="{http://www.w3.org/2000/09/xmldsig#}TransformsType" minOccurs="0"/>
 *         &lt;element name="canonicalizationAlgo" type="{http://www.bull.security.com/SignServer/sigServices/v1.3.0/}CanonicalizationAlgo" minOccurs="0"/>
 *         &lt;element name="requireSigningTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requirePlaceOfSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requireContactInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="archive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureProfileSpecification", propOrder = {
    "signaturePolicyOid",
    "verificationPolicyOid",
    "attachment",
    "format",
    "augmentation",
    "commitments",
    "signerRole",
    "signatureAlgoId",
    "transformationAlgo",
    "canonicalizationAlgo",
    "requireSigningTime",
    "requirePlaceOfSignature",
    "requireContactInfo"
})
public class SignatureProfileSpecification {

    protected String signaturePolicyOid;
    protected String verificationPolicyOid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AttachmentType attachment;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SignatureFormat format;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AugmentationType augmentation;
    protected List<CommitmentType> commitments;
    protected SignerRole signerRole;
    @XmlElement(required = true)
    protected String signatureAlgoId;
    protected TransformsType transformationAlgo;
    @XmlSchemaType(name = "string")
    protected CanonicalizationAlgo canonicalizationAlgo;
    protected Boolean requireSigningTime;
    protected Boolean requirePlaceOfSignature;
    protected Boolean requireContactInfo;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "archive", required = true)
    protected boolean archive;

    /**
     * Obtient la valeur de la propriété signaturePolicyOid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignaturePolicyOid() {
        return signaturePolicyOid;
    }

    /**
     * Définit la valeur de la propriété signaturePolicyOid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignaturePolicyOid(String value) {
        this.signaturePolicyOid = value;
    }

    /**
     * Obtient la valeur de la propriété verificationPolicyOid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationPolicyOid() {
        return verificationPolicyOid;
    }

    /**
     * Définit la valeur de la propriété verificationPolicyOid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationPolicyOid(String value) {
        this.verificationPolicyOid = value;
    }

    /**
     * Obtient la valeur de la propriété attachment.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getAttachment() {
        return attachment;
    }

    /**
     * Définit la valeur de la propriété attachment.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setAttachment(AttachmentType value) {
        this.attachment = value;
    }

    /**
     * Obtient la valeur de la propriété format.
     * 
     * @return
     *     possible object is
     *     {@link SignatureFormat }
     *     
     */
    public SignatureFormat getFormat() {
        return format;
    }

    /**
     * Définit la valeur de la propriété format.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureFormat }
     *     
     */
    public void setFormat(SignatureFormat value) {
        this.format = value;
    }

    /**
     * Obtient la valeur de la propriété augmentation.
     * 
     * @return
     *     possible object is
     *     {@link AugmentationType }
     *     
     */
    public AugmentationType getAugmentation() {
        return augmentation;
    }

    /**
     * Définit la valeur de la propriété augmentation.
     * 
     * @param value
     *     allowed object is
     *     {@link AugmentationType }
     *     
     */
    public void setAugmentation(AugmentationType value) {
        this.augmentation = value;
    }

    /**
     * Gets the value of the commitments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commitments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitmentType }
     * 
     * 
     */
    public List<CommitmentType> getCommitments() {
        if (commitments == null) {
            commitments = new ArrayList<CommitmentType>();
        }
        return this.commitments;
    }

    /**
     * Obtient la valeur de la propriété signerRole.
     * 
     * @return
     *     possible object is
     *     {@link SignerRole }
     *     
     */
    public SignerRole getSignerRole() {
        return signerRole;
    }

    /**
     * Définit la valeur de la propriété signerRole.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerRole }
     *     
     */
    public void setSignerRole(SignerRole value) {
        this.signerRole = value;
    }

    /**
     * Obtient la valeur de la propriété signatureAlgoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureAlgoId() {
        return signatureAlgoId;
    }

    /**
     * Définit la valeur de la propriété signatureAlgoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureAlgoId(String value) {
        this.signatureAlgoId = value;
    }

    /**
     * Obtient la valeur de la propriété transformationAlgo.
     * 
     * @return
     *     possible object is
     *     {@link TransformsType }
     *     
     */
    public TransformsType getTransformationAlgo() {
        return transformationAlgo;
    }

    /**
     * Définit la valeur de la propriété transformationAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformsType }
     *     
     */
    public void setTransformationAlgo(TransformsType value) {
        this.transformationAlgo = value;
    }

    /**
     * Obtient la valeur de la propriété canonicalizationAlgo.
     * 
     * @return
     *     possible object is
     *     {@link CanonicalizationAlgo }
     *     
     */
    public CanonicalizationAlgo getCanonicalizationAlgo() {
        return canonicalizationAlgo;
    }

    /**
     * Définit la valeur de la propriété canonicalizationAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link CanonicalizationAlgo }
     *     
     */
    public void setCanonicalizationAlgo(CanonicalizationAlgo value) {
        this.canonicalizationAlgo = value;
    }

    /**
     * Obtient la valeur de la propriété requireSigningTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireSigningTime() {
        return requireSigningTime;
    }

    /**
     * Définit la valeur de la propriété requireSigningTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireSigningTime(Boolean value) {
        this.requireSigningTime = value;
    }

    /**
     * Obtient la valeur de la propriété requirePlaceOfSignature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequirePlaceOfSignature() {
        return requirePlaceOfSignature;
    }

    /**
     * Définit la valeur de la propriété requirePlaceOfSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequirePlaceOfSignature(Boolean value) {
        this.requirePlaceOfSignature = value;
    }

    /**
     * Obtient la valeur de la propriété requireContactInfo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireContactInfo() {
        return requireContactInfo;
    }

    /**
     * Définit la valeur de la propriété requireContactInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireContactInfo(Boolean value) {
        this.requireContactInfo = value;
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

    /**
     * Obtient la valeur de la propriété archive.
     * 
     */
    public boolean isArchive() {
        return archive;
    }

    /**
     * Définit la valeur de la propriété archive.
     * 
     */
    public void setArchive(boolean value) {
        this.archive = value;
    }

}
