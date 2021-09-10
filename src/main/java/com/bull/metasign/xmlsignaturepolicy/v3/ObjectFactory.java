
package com.bull.metasign.xmlsignaturepolicy.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bull.metasign.xmlsignaturepolicy.v3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Transform_QNAME = new QName("http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#", "Transform");
    private final static QName _Transforms_QNAME = new QName("http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#", "Transforms");
    private final static QName _SignaturePolicy_QNAME = new QName("http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#", "SignaturePolicy");
    private final static QName _TransformTypeXPath_QNAME = new QName("http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#", "XPath");
    private final static QName _TransformTypeXSLT_QNAME = new QName("http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#", "XSLT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bull.metasign.xmlsignaturepolicy.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignaturePolicy }
     * 
     */
    public SignaturePolicy createSignaturePolicy() {
        return new SignaturePolicy();
    }

    /**
     * Create an instance of {@link SignPolicyInfo }
     * 
     */
    public SignPolicyInfo createSignPolicyInfo() {
        return new SignPolicyInfo();
    }

    /**
     * Create an instance of {@link ObjectIdentifierType }
     * 
     */
    public ObjectIdentifierType createObjectIdentifierType() {
        return new ObjectIdentifierType();
    }

    /**
     * Create an instance of {@link SignatureValidationPolicyType }
     * 
     */
    public SignatureValidationPolicyType createSignatureValidationPolicyType() {
        return new SignatureValidationPolicyType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link DeltaTimeType }
     * 
     */
    public DeltaTimeType createDeltaTimeType() {
        return new DeltaTimeType();
    }

    /**
     * Create an instance of {@link SelectedCommitmentType }
     * 
     */
    public SelectedCommitmentType createSelectedCommitmentType() {
        return new SelectedCommitmentType();
    }

    /**
     * Create an instance of {@link SignerRulesType }
     * 
     */
    public SignerRulesType createSignerRulesType() {
        return new SignerRulesType();
    }

    /**
     * Create an instance of {@link GeneralSubTreeType }
     * 
     */
    public GeneralSubTreeType createGeneralSubTreeType() {
        return new GeneralSubTreeType();
    }

    /**
     * Create an instance of {@link CertificateTrustPointType }
     * 
     */
    public CertificateTrustPointType createCertificateTrustPointType() {
        return new CertificateTrustPointType();
    }

    /**
     * Create an instance of {@link AcceptablePoliciesListType }
     * 
     */
    public AcceptablePoliciesListType createAcceptablePoliciesListType() {
        return new AcceptablePoliciesListType();
    }

    /**
     * Create an instance of {@link GeneralSubTreesListType }
     * 
     */
    public GeneralSubTreesListType createGeneralSubTreesListType() {
        return new GeneralSubTreesListType();
    }

    /**
     * Create an instance of {@link SignPolExtensionsListType }
     * 
     */
    public SignPolExtensionsListType createSignPolExtensionsListType() {
        return new SignPolExtensionsListType();
    }

    /**
     * Create an instance of {@link CommonRulesType }
     * 
     */
    public CommonRulesType createCommonRulesType() {
        return new CommonRulesType();
    }

    /**
     * Create an instance of {@link AlgAndLengthType }
     * 
     */
    public AlgAndLengthType createAlgAndLengthType() {
        return new AlgAndLengthType();
    }

    /**
     * Create an instance of {@link CommitmentRulesListType }
     * 
     */
    public CommitmentRulesListType createCommitmentRulesListType() {
        return new CommitmentRulesListType();
    }

    /**
     * Create an instance of {@link CommitmentRuleType }
     * 
     */
    public CommitmentRuleType createCommitmentRuleType() {
        return new CommitmentRuleType();
    }

    /**
     * Create an instance of {@link SignerAndVerifierRulesType }
     * 
     */
    public SignerAndVerifierRulesType createSignerAndVerifierRulesType() {
        return new SignerAndVerifierRulesType();
    }

    /**
     * Create an instance of {@link NameConstraintsType }
     * 
     */
    public NameConstraintsType createNameConstraintsType() {
        return new NameConstraintsType();
    }

    /**
     * Create an instance of {@link SigningCertTrustConditionType }
     * 
     */
    public SigningCertTrustConditionType createSigningCertTrustConditionType() {
        return new SigningCertTrustConditionType();
    }

    /**
     * Create an instance of {@link SelectedCommitmentTypeList }
     * 
     */
    public SelectedCommitmentTypeList createSelectedCommitmentTypeList() {
        return new SelectedCommitmentTypeList();
    }

    /**
     * Create an instance of {@link AnyType }
     * 
     */
    public AnyType createAnyType() {
        return new AnyType();
    }

    /**
     * Create an instance of {@link TimeStampTrustConditionType }
     * 
     */
    public TimeStampTrustConditionType createTimeStampTrustConditionType() {
        return new TimeStampTrustConditionType();
    }

    /**
     * Create an instance of {@link DigestMethodType }
     * 
     */
    public DigestMethodType createDigestMethodType() {
        return new DigestMethodType();
    }

    /**
     * Create an instance of {@link VerifierRulesType }
     * 
     */
    public VerifierRulesType createVerifierRulesType() {
        return new VerifierRulesType();
    }

    /**
     * Create an instance of {@link AlgorithmConstraintSetType }
     * 
     */
    public AlgorithmConstraintSetType createAlgorithmConstraintSetType() {
        return new AlgorithmConstraintSetType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link QPropertiesListType }
     * 
     */
    public QPropertiesListType createQPropertiesListType() {
        return new QPropertiesListType();
    }

    /**
     * Create an instance of {@link AlgConstraintsListType }
     * 
     */
    public AlgConstraintsListType createAlgConstraintsListType() {
        return new AlgConstraintsListType();
    }

    /**
     * Create an instance of {@link TimePeriodType }
     * 
     */
    public TimePeriodType createTimePeriodType() {
        return new TimePeriodType();
    }

    /**
     * Create an instance of {@link CommitmentType }
     * 
     */
    public CommitmentType createCommitmentType() {
        return new CommitmentType();
    }

    /**
     * Create an instance of {@link CertificateTrustTreesType }
     * 
     */
    public CertificateTrustTreesType createCertificateTrustTreesType() {
        return new CertificateTrustTreesType();
    }

    /**
     * Create an instance of {@link CertificateRevReqType }
     * 
     */
    public CertificateRevReqType createCertificateRevReqType() {
        return new CertificateRevReqType();
    }

    /**
     * Create an instance of {@link RevocationReqType }
     * 
     */
    public RevocationReqType createRevocationReqType() {
        return new RevocationReqType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#", name = "Transform")
    public JAXBElement<TransformType> createTransform(TransformType value) {
        return new JAXBElement<TransformType>(_Transform_QNAME, TransformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#", name = "Transforms")
    public JAXBElement<TransformsType> createTransforms(TransformsType value) {
        return new JAXBElement<TransformsType>(_Transforms_QNAME, TransformsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#", name = "SignaturePolicy")
    public JAXBElement<SignaturePolicy> createSignaturePolicy(SignaturePolicy value) {
        return new JAXBElement<SignaturePolicy>(_SignaturePolicy_QNAME, SignaturePolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#", name = "XPath", scope = TransformType.class)
    public JAXBElement<String> createTransformTypeXPath(String value) {
        return new JAXBElement<String>(_TransformTypeXPath_QNAME, String.class, TransformType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.com/metasign/xmlSignaturePolicy/v3.1#", name = "XSLT", scope = TransformType.class)
    public JAXBElement<String> createTransformTypeXSLT(String value) {
        return new JAXBElement<String>(_TransformTypeXSLT_QNAME, String.class, TransformType.class, value);
    }

}
