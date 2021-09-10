
package com.security.bull.signserver.adminsig.v1_3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.security.bull.server.coreservices.v1_3.ArtifactIdResponse;
import com.security.bull.server.coreservices.v1_3.WSResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.security.bull.signserver.adminsig.v1_3 package. 
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

    private final static QName _RequestCertForSkc_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "requestCertForSkc");
    private final static QName _UpdateSigProfile_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "updateSigProfile");
    private final static QName _DeleteSigProf_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "deleteSigProf");
    private final static QName _CreateSkcFProfile_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "createSkcFProfile");
    private final static QName _CreateSkcFPkcs12_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "createSkcFPkcs12");
    private final static QName _ListSigPols_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "listSigPols");
    private final static QName _ActivateSignatureKey_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "activateSignatureKey");
    private final static QName _DeleteSKGProf_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "deleteSKGProf");
    private final static QName _RetrieveSigProf_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "retrieveSigProf");
    private final static QName _RetrieveSkgProfResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "retrieveSkgProfResponse");
    private final static QName _UpdateSignatureSecret_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "updateSignatureSecret");
    private final static QName _ListSKGP_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "listSKGP");
    private final static QName _UpdateSignatureSecretResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "updateSignatureSecretResponse");
    private final static QName _DepositKeystore_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "depositKeystore");
    private final static QName _SigKeyGenProfParams_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "sigKeyGenProfParams");
    private final static QName _DepositCertForSkc_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "depositCertForSkc");
    private final static QName _ListSigPolsResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "listSigPolsResponse");
    private final static QName _RetrieveSkgProf_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "retrieveSkgProf");
    private final static QName _ListSigProfileResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "listSigProfileResponse");
    private final static QName _UpdateSkgProfileResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "updateSkgProfileResponse");
    private final static QName _ActivateSignatureKeyResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "activateSignatureKeyResponse");
    private final static QName _CsrForSkcResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "csrForSkcResponse");
    private final static QName _RetrieveSigPolResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "retrieveSigPolResponse");
    private final static QName _ListSigProfile_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "listSigProfile");
    private final static QName _DeleteSigPolResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "deleteSigPolResponse");
    private final static QName _DepositSigPolicy_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "depositSigPolicy");
    private final static QName _RetrieveSigPol_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "retrieveSigPol");
    private final static QName _UpdateSkgProfile_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "updateSkgProfile");
    private final static QName _DeleteSKGProfResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "deleteSKGProfResponse");
    private final static QName _ListSKGPResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "listSKGPResponse");
    private final static QName _DepositCertForSkcResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "depositCertForSkcResponse");
    private final static QName _RetrieveSigProfResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "retrieveSigProfResponse");
    private final static QName _DeleteSigKeyResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "deleteSigKeyResponse");
    private final static QName _DeleteSigProfResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "deleteSigProfResponse");
    private final static QName _GenerateCsrForSkc_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "generateCsrForSkc");
    private final static QName _DepositSigProfile_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "depositSigProfile");
    private final static QName _DepositKeystoreResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "depositKeystoreResponse");
    private final static QName _RequestCertForSkcResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "requestCertForSkcResponse");
    private final static QName _ArtifactIdResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "artifactIdResponse");
    private final static QName _DeleteSigKey_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "deleteSigKey");
    private final static QName _CreateSkcResponse_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "createSkcResponse");
    private final static QName _CreateSkcFKP_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "createSkcFKP");
    private final static QName _DeleteSigPol_QNAME = new QName("http://www.bull.security.com/SignServer/adminSig/v1.3.0/", "deleteSigPol");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.security.bull.signserver.adminsig.v1_3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateSignatureKeyCertResponse }
     * 
     */
    public CreateSignatureKeyCertResponse createCreateSignatureKeyCertResponse() {
        return new CreateSignatureKeyCertResponse();
    }

    /**
     * Create an instance of {@link ListSigProfileResponse }
     * 
     */
    public ListSigProfileResponse createListSigProfileResponse() {
        return new ListSigProfileResponse();
    }

    /**
     * Create an instance of {@link WSRetrieveSkgProfile }
     * 
     */
    public WSRetrieveSkgProfile createWSRetrieveSkgProfile() {
        return new WSRetrieveSkgProfile();
    }

    /**
     * Create an instance of {@link WSDeleteSignatureKey }
     * 
     */
    public WSDeleteSignatureKey createWSDeleteSignatureKey() {
        return new WSDeleteSignatureKey();
    }

    /**
     * Create an instance of {@link ActivateSignatureKeyResponse }
     * 
     */
    public ActivateSignatureKeyResponse createActivateSignatureKeyResponse() {
        return new ActivateSignatureKeyResponse();
    }

    /**
     * Create an instance of {@link RetrieveSignatureProfileResponse }
     * 
     */
    public RetrieveSignatureProfileResponse createRetrieveSignatureProfileResponse() {
        return new RetrieveSignatureProfileResponse();
    }

    /**
     * Create an instance of {@link WSRetrieveSignatureProfile }
     * 
     */
    public WSRetrieveSignatureProfile createWSRetrieveSignatureProfile() {
        return new WSRetrieveSignatureProfile();
    }

    /**
     * Create an instance of {@link WSDeleteSignaturePolicy }
     * 
     */
    public WSDeleteSignaturePolicy createWSDeleteSignaturePolicy() {
        return new WSDeleteSignaturePolicy();
    }

    /**
     * Create an instance of {@link WSUpdateSignatureSecret }
     * 
     */
    public WSUpdateSignatureSecret createWSUpdateSignatureSecret() {
        return new WSUpdateSignatureSecret();
    }

    /**
     * Create an instance of {@link RetrieveSkgProfileResponse }
     * 
     */
    public RetrieveSkgProfileResponse createRetrieveSkgProfileResponse() {
        return new RetrieveSkgProfileResponse();
    }

    /**
     * Create an instance of {@link DeleteSignatureKeyResponse }
     * 
     */
    public DeleteSignatureKeyResponse createDeleteSignatureKeyResponse() {
        return new DeleteSignatureKeyResponse();
    }

    /**
     * Create an instance of {@link WSCreateSignatureKeyCertFromKeyPair }
     * 
     */
    public WSCreateSignatureKeyCertFromKeyPair createWSCreateSignatureKeyCertFromKeyPair() {
        return new WSCreateSignatureKeyCertFromKeyPair();
    }

    /**
     * Create an instance of {@link RetrieveSignaturePolicyResponse }
     * 
     */
    public RetrieveSignaturePolicyResponse createRetrieveSignaturePolicyResponse() {
        return new RetrieveSignaturePolicyResponse();
    }

    /**
     * Create an instance of {@link CsrForSignatureKeyResponse }
     * 
     */
    public CsrForSignatureKeyResponse createCsrForSignatureKeyResponse() {
        return new CsrForSignatureKeyResponse();
    }

    /**
     * Create an instance of {@link WSDeleteSigKeyGenProfile }
     * 
     */
    public WSDeleteSigKeyGenProfile createWSDeleteSigKeyGenProfile() {
        return new WSDeleteSigKeyGenProfile();
    }

    /**
     * Create an instance of {@link WSDepositKeystore }
     * 
     */
    public WSDepositKeystore createWSDepositKeystore() {
        return new WSDepositKeystore();
    }

    /**
     * Create an instance of {@link WSDepositSignaturePolicy }
     * 
     */
    public WSDepositSignaturePolicy createWSDepositSignaturePolicy() {
        return new WSDepositSignaturePolicy();
    }

    /**
     * Create an instance of {@link DeleteSignaturePolicyResponse }
     * 
     */
    public DeleteSignaturePolicyResponse createDeleteSignaturePolicyResponse() {
        return new DeleteSignaturePolicyResponse();
    }

    /**
     * Create an instance of {@link WSDepSigKeyGenProfile }
     * 
     */
    public WSDepSigKeyGenProfile createWSDepSigKeyGenProfile() {
        return new WSDepSigKeyGenProfile();
    }

    /**
     * Create an instance of {@link WSGenerateCsrForSignatureKey }
     * 
     */
    public WSGenerateCsrForSignatureKey createWSGenerateCsrForSignatureKey() {
        return new WSGenerateCsrForSignatureKey();
    }

    /**
     * Create an instance of {@link WSCreateSignatureKeyCertFromPkcs12 }
     * 
     */
    public WSCreateSignatureKeyCertFromPkcs12 createWSCreateSignatureKeyCertFromPkcs12() {
        return new WSCreateSignatureKeyCertFromPkcs12();
    }

    /**
     * Create an instance of {@link WSListSigProfile }
     * 
     */
    public WSListSigProfile createWSListSigProfile() {
        return new WSListSigProfile();
    }

    /**
     * Create an instance of {@link WSDeleteSignatureProfile }
     * 
     */
    public WSDeleteSignatureProfile createWSDeleteSignatureProfile() {
        return new WSDeleteSignatureProfile();
    }

    /**
     * Create an instance of {@link DeleteSignatureProfileResponse }
     * 
     */
    public DeleteSignatureProfileResponse createDeleteSignatureProfileResponse() {
        return new DeleteSignatureProfileResponse();
    }

    /**
     * Create an instance of {@link WSUpdateSigProf }
     * 
     */
    public WSUpdateSigProf createWSUpdateSigProf() {
        return new WSUpdateSigProf();
    }

    /**
     * Create an instance of {@link WSListSKGP }
     * 
     */
    public WSListSKGP createWSListSKGP() {
        return new WSListSKGP();
    }

    /**
     * Create an instance of {@link WSRequestCertificateForSignatureKey }
     * 
     */
    public WSRequestCertificateForSignatureKey createWSRequestCertificateForSignatureKey() {
        return new WSRequestCertificateForSignatureKey();
    }

    /**
     * Create an instance of {@link WSCreateSignatureKeyCertFromProfile }
     * 
     */
    public WSCreateSignatureKeyCertFromProfile createWSCreateSignatureKeyCertFromProfile() {
        return new WSCreateSignatureKeyCertFromProfile();
    }

    /**
     * Create an instance of {@link CertificateForSignatureKeyResponse }
     * 
     */
    public CertificateForSignatureKeyResponse createCertificateForSignatureKeyResponse() {
        return new CertificateForSignatureKeyResponse();
    }

    /**
     * Create an instance of {@link WSActivateSignatureKey }
     * 
     */
    public WSActivateSignatureKey createWSActivateSignatureKey() {
        return new WSActivateSignatureKey();
    }

    /**
     * Create an instance of {@link ListSigPolResponse }
     * 
     */
    public ListSigPolResponse createListSigPolResponse() {
        return new ListSigPolResponse();
    }

    /**
     * Create an instance of {@link ListSKGPResponse }
     * 
     */
    public ListSKGPResponse createListSKGPResponse() {
        return new ListSKGPResponse();
    }

    /**
     * Create an instance of {@link DeleteSigKeyGenProfileResponse }
     * 
     */
    public DeleteSigKeyGenProfileResponse createDeleteSigKeyGenProfileResponse() {
        return new DeleteSigKeyGenProfileResponse();
    }

    /**
     * Create an instance of {@link WSUpdateSkgProfile }
     * 
     */
    public WSUpdateSkgProfile createWSUpdateSkgProfile() {
        return new WSUpdateSkgProfile();
    }

    /**
     * Create an instance of {@link WSDepositCertificateForSignatureKey }
     * 
     */
    public WSDepositCertificateForSignatureKey createWSDepositCertificateForSignatureKey() {
        return new WSDepositCertificateForSignatureKey();
    }

    /**
     * Create an instance of {@link DepositKeystoreResponse }
     * 
     */
    public DepositKeystoreResponse createDepositKeystoreResponse() {
        return new DepositKeystoreResponse();
    }

    /**
     * Create an instance of {@link WSRetrieveSignaturePolicy }
     * 
     */
    public WSRetrieveSignaturePolicy createWSRetrieveSignaturePolicy() {
        return new WSRetrieveSignaturePolicy();
    }

    /**
     * Create an instance of {@link WSDepositSignatureProfile }
     * 
     */
    public WSDepositSignatureProfile createWSDepositSignatureProfile() {
        return new WSDepositSignatureProfile();
    }

    /**
     * Create an instance of {@link WSListSigPol }
     * 
     */
    public WSListSigPol createWSListSigPol() {
        return new WSListSigPol();
    }

    /**
     * Create an instance of {@link SkGenerationProfileReference }
     * 
     */
    public SkGenerationProfileReference createSkGenerationProfileReference() {
        return new SkGenerationProfileReference();
    }

    /**
     * Create an instance of {@link DASActivationData }
     * 
     */
    public DASActivationData createDASActivationData() {
        return new DASActivationData();
    }

    /**
     * Create an instance of {@link ActivationData }
     * 
     */
    public ActivationData createActivationData() {
        return new ActivationData();
    }

    /**
     * Create an instance of {@link SCEPRequestResult }
     * 
     */
    public SCEPRequestResult createSCEPRequestResult() {
        return new SCEPRequestResult();
    }

    /**
     * Create an instance of {@link DASAuthentication }
     * 
     */
    public DASAuthentication createDASAuthentication() {
        return new DASAuthentication();
    }

    /**
     * Create an instance of {@link KPType }
     * 
     */
    public KPType createKPType() {
        return new KPType();
    }

    /**
     * Create an instance of {@link ActivationResult }
     * 
     */
    public ActivationResult createActivationResult() {
        return new ActivationResult();
    }

    /**
     * Create an instance of {@link SigPolInfo }
     * 
     */
    public SigPolInfo createSigPolInfo() {
        return new SigPolInfo();
    }

    /**
     * Create an instance of {@link DASActivationResult }
     * 
     */
    public DASActivationResult createDASActivationResult() {
        return new DASActivationResult();
    }

    /**
     * Create an instance of {@link AlgoParameters }
     * 
     */
    public AlgoParameters createAlgoParameters() {
        return new AlgoParameters();
    }

    /**
     * Create an instance of {@link SkGenerationProfileSpecification }
     * 
     */
    public SkGenerationProfileSpecification createSkGenerationProfileSpecification() {
        return new SkGenerationProfileSpecification();
    }

    /**
     * Create an instance of {@link ServerSignaturePolicy }
     * 
     */
    public ServerSignaturePolicy createServerSignaturePolicy() {
        return new ServerSignaturePolicy();
    }

    /**
     * Create an instance of {@link SCEPRequestParameters }
     * 
     */
    public SCEPRequestParameters createSCEPRequestParameters() {
        return new SCEPRequestParameters();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSRequestCertificateForSignatureKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "requestCertForSkc")
    public JAXBElement<WSRequestCertificateForSignatureKey> createRequestCertForSkc(WSRequestCertificateForSignatureKey value) {
        return new JAXBElement<WSRequestCertificateForSignatureKey>(_RequestCertForSkc_QNAME, WSRequestCertificateForSignatureKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSUpdateSigProf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "updateSigProfile")
    public JAXBElement<WSUpdateSigProf> createUpdateSigProfile(WSUpdateSigProf value) {
        return new JAXBElement<WSUpdateSigProf>(_UpdateSigProfile_QNAME, WSUpdateSigProf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDeleteSignatureProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "deleteSigProf")
    public JAXBElement<WSDeleteSignatureProfile> createDeleteSigProf(WSDeleteSignatureProfile value) {
        return new JAXBElement<WSDeleteSignatureProfile>(_DeleteSigProf_QNAME, WSDeleteSignatureProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCreateSignatureKeyCertFromProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "createSkcFProfile")
    public JAXBElement<WSCreateSignatureKeyCertFromProfile> createCreateSkcFProfile(WSCreateSignatureKeyCertFromProfile value) {
        return new JAXBElement<WSCreateSignatureKeyCertFromProfile>(_CreateSkcFProfile_QNAME, WSCreateSignatureKeyCertFromProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCreateSignatureKeyCertFromPkcs12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "createSkcFPkcs12")
    public JAXBElement<WSCreateSignatureKeyCertFromPkcs12> createCreateSkcFPkcs12(WSCreateSignatureKeyCertFromPkcs12 value) {
        return new JAXBElement<WSCreateSignatureKeyCertFromPkcs12>(_CreateSkcFPkcs12_QNAME, WSCreateSignatureKeyCertFromPkcs12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSListSigPol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "listSigPols")
    public JAXBElement<WSListSigPol> createListSigPols(WSListSigPol value) {
        return new JAXBElement<WSListSigPol>(_ListSigPols_QNAME, WSListSigPol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSActivateSignatureKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "activateSignatureKey")
    public JAXBElement<WSActivateSignatureKey> createActivateSignatureKey(WSActivateSignatureKey value) {
        return new JAXBElement<WSActivateSignatureKey>(_ActivateSignatureKey_QNAME, WSActivateSignatureKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDeleteSigKeyGenProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "deleteSKGProf")
    public JAXBElement<WSDeleteSigKeyGenProfile> createDeleteSKGProf(WSDeleteSigKeyGenProfile value) {
        return new JAXBElement<WSDeleteSigKeyGenProfile>(_DeleteSKGProf_QNAME, WSDeleteSigKeyGenProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSRetrieveSignatureProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "retrieveSigProf")
    public JAXBElement<WSRetrieveSignatureProfile> createRetrieveSigProf(WSRetrieveSignatureProfile value) {
        return new JAXBElement<WSRetrieveSignatureProfile>(_RetrieveSigProf_QNAME, WSRetrieveSignatureProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSkgProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "retrieveSkgProfResponse")
    public JAXBElement<RetrieveSkgProfileResponse> createRetrieveSkgProfResponse(RetrieveSkgProfileResponse value) {
        return new JAXBElement<RetrieveSkgProfileResponse>(_RetrieveSkgProfResponse_QNAME, RetrieveSkgProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSUpdateSignatureSecret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "updateSignatureSecret")
    public JAXBElement<WSUpdateSignatureSecret> createUpdateSignatureSecret(WSUpdateSignatureSecret value) {
        return new JAXBElement<WSUpdateSignatureSecret>(_UpdateSignatureSecret_QNAME, WSUpdateSignatureSecret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSListSKGP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "listSKGP")
    public JAXBElement<WSListSKGP> createListSKGP(WSListSKGP value) {
        return new JAXBElement<WSListSKGP>(_ListSKGP_QNAME, WSListSKGP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "updateSignatureSecretResponse")
    public JAXBElement<WSResponse> createUpdateSignatureSecretResponse(WSResponse value) {
        return new JAXBElement<WSResponse>(_UpdateSignatureSecretResponse_QNAME, WSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDepositKeystore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "depositKeystore")
    public JAXBElement<WSDepositKeystore> createDepositKeystore(WSDepositKeystore value) {
        return new JAXBElement<WSDepositKeystore>(_DepositKeystore_QNAME, WSDepositKeystore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDepSigKeyGenProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "sigKeyGenProfParams")
    public JAXBElement<WSDepSigKeyGenProfile> createSigKeyGenProfParams(WSDepSigKeyGenProfile value) {
        return new JAXBElement<WSDepSigKeyGenProfile>(_SigKeyGenProfParams_QNAME, WSDepSigKeyGenProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDepositCertificateForSignatureKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "depositCertForSkc")
    public JAXBElement<WSDepositCertificateForSignatureKey> createDepositCertForSkc(WSDepositCertificateForSignatureKey value) {
        return new JAXBElement<WSDepositCertificateForSignatureKey>(_DepositCertForSkc_QNAME, WSDepositCertificateForSignatureKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSigPolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "listSigPolsResponse")
    public JAXBElement<ListSigPolResponse> createListSigPolsResponse(ListSigPolResponse value) {
        return new JAXBElement<ListSigPolResponse>(_ListSigPolsResponse_QNAME, ListSigPolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSRetrieveSkgProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "retrieveSkgProf")
    public JAXBElement<WSRetrieveSkgProfile> createRetrieveSkgProf(WSRetrieveSkgProfile value) {
        return new JAXBElement<WSRetrieveSkgProfile>(_RetrieveSkgProf_QNAME, WSRetrieveSkgProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSigProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "listSigProfileResponse")
    public JAXBElement<ListSigProfileResponse> createListSigProfileResponse(ListSigProfileResponse value) {
        return new JAXBElement<ListSigProfileResponse>(_ListSigProfileResponse_QNAME, ListSigProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "updateSkgProfileResponse")
    public JAXBElement<WSResponse> createUpdateSkgProfileResponse(WSResponse value) {
        return new JAXBElement<WSResponse>(_UpdateSkgProfileResponse_QNAME, WSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateSignatureKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "activateSignatureKeyResponse")
    public JAXBElement<ActivateSignatureKeyResponse> createActivateSignatureKeyResponse(ActivateSignatureKeyResponse value) {
        return new JAXBElement<ActivateSignatureKeyResponse>(_ActivateSignatureKeyResponse_QNAME, ActivateSignatureKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CsrForSignatureKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "csrForSkcResponse")
    public JAXBElement<CsrForSignatureKeyResponse> createCsrForSkcResponse(CsrForSignatureKeyResponse value) {
        return new JAXBElement<CsrForSignatureKeyResponse>(_CsrForSkcResponse_QNAME, CsrForSignatureKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSignaturePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "retrieveSigPolResponse")
    public JAXBElement<RetrieveSignaturePolicyResponse> createRetrieveSigPolResponse(RetrieveSignaturePolicyResponse value) {
        return new JAXBElement<RetrieveSignaturePolicyResponse>(_RetrieveSigPolResponse_QNAME, RetrieveSignaturePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSListSigProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "listSigProfile")
    public JAXBElement<WSListSigProfile> createListSigProfile(WSListSigProfile value) {
        return new JAXBElement<WSListSigProfile>(_ListSigProfile_QNAME, WSListSigProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSignaturePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "deleteSigPolResponse")
    public JAXBElement<DeleteSignaturePolicyResponse> createDeleteSigPolResponse(DeleteSignaturePolicyResponse value) {
        return new JAXBElement<DeleteSignaturePolicyResponse>(_DeleteSigPolResponse_QNAME, DeleteSignaturePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDepositSignaturePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "depositSigPolicy")
    public JAXBElement<WSDepositSignaturePolicy> createDepositSigPolicy(WSDepositSignaturePolicy value) {
        return new JAXBElement<WSDepositSignaturePolicy>(_DepositSigPolicy_QNAME, WSDepositSignaturePolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSRetrieveSignaturePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "retrieveSigPol")
    public JAXBElement<WSRetrieveSignaturePolicy> createRetrieveSigPol(WSRetrieveSignaturePolicy value) {
        return new JAXBElement<WSRetrieveSignaturePolicy>(_RetrieveSigPol_QNAME, WSRetrieveSignaturePolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSUpdateSkgProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "updateSkgProfile")
    public JAXBElement<WSUpdateSkgProfile> createUpdateSkgProfile(WSUpdateSkgProfile value) {
        return new JAXBElement<WSUpdateSkgProfile>(_UpdateSkgProfile_QNAME, WSUpdateSkgProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSigKeyGenProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "deleteSKGProfResponse")
    public JAXBElement<DeleteSigKeyGenProfileResponse> createDeleteSKGProfResponse(DeleteSigKeyGenProfileResponse value) {
        return new JAXBElement<DeleteSigKeyGenProfileResponse>(_DeleteSKGProfResponse_QNAME, DeleteSigKeyGenProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSKGPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "listSKGPResponse")
    public JAXBElement<ListSKGPResponse> createListSKGPResponse(ListSKGPResponse value) {
        return new JAXBElement<ListSKGPResponse>(_ListSKGPResponse_QNAME, ListSKGPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "depositCertForSkcResponse")
    public JAXBElement<WSResponse> createDepositCertForSkcResponse(WSResponse value) {
        return new JAXBElement<WSResponse>(_DepositCertForSkcResponse_QNAME, WSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveSignatureProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "retrieveSigProfResponse")
    public JAXBElement<RetrieveSignatureProfileResponse> createRetrieveSigProfResponse(RetrieveSignatureProfileResponse value) {
        return new JAXBElement<RetrieveSignatureProfileResponse>(_RetrieveSigProfResponse_QNAME, RetrieveSignatureProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSignatureKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "deleteSigKeyResponse")
    public JAXBElement<DeleteSignatureKeyResponse> createDeleteSigKeyResponse(DeleteSignatureKeyResponse value) {
        return new JAXBElement<DeleteSignatureKeyResponse>(_DeleteSigKeyResponse_QNAME, DeleteSignatureKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSignatureProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "deleteSigProfResponse")
    public JAXBElement<DeleteSignatureProfileResponse> createDeleteSigProfResponse(DeleteSignatureProfileResponse value) {
        return new JAXBElement<DeleteSignatureProfileResponse>(_DeleteSigProfResponse_QNAME, DeleteSignatureProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSGenerateCsrForSignatureKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "generateCsrForSkc")
    public JAXBElement<WSGenerateCsrForSignatureKey> createGenerateCsrForSkc(WSGenerateCsrForSignatureKey value) {
        return new JAXBElement<WSGenerateCsrForSignatureKey>(_GenerateCsrForSkc_QNAME, WSGenerateCsrForSignatureKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDepositSignatureProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "depositSigProfile")
    public JAXBElement<WSDepositSignatureProfile> createDepositSigProfile(WSDepositSignatureProfile value) {
        return new JAXBElement<WSDepositSignatureProfile>(_DepositSigProfile_QNAME, WSDepositSignatureProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositKeystoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "depositKeystoreResponse")
    public JAXBElement<DepositKeystoreResponse> createDepositKeystoreResponse(DepositKeystoreResponse value) {
        return new JAXBElement<DepositKeystoreResponse>(_DepositKeystoreResponse_QNAME, DepositKeystoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateForSignatureKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "requestCertForSkcResponse")
    public JAXBElement<CertificateForSignatureKeyResponse> createRequestCertForSkcResponse(CertificateForSignatureKeyResponse value) {
        return new JAXBElement<CertificateForSignatureKeyResponse>(_RequestCertForSkcResponse_QNAME, CertificateForSignatureKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtifactIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "artifactIdResponse")
    public JAXBElement<ArtifactIdResponse> createArtifactIdResponse(ArtifactIdResponse value) {
        return new JAXBElement<ArtifactIdResponse>(_ArtifactIdResponse_QNAME, ArtifactIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDeleteSignatureKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "deleteSigKey")
    public JAXBElement<WSDeleteSignatureKey> createDeleteSigKey(WSDeleteSignatureKey value) {
        return new JAXBElement<WSDeleteSignatureKey>(_DeleteSigKey_QNAME, WSDeleteSignatureKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSignatureKeyCertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "createSkcResponse")
    public JAXBElement<CreateSignatureKeyCertResponse> createCreateSkcResponse(CreateSignatureKeyCertResponse value) {
        return new JAXBElement<CreateSignatureKeyCertResponse>(_CreateSkcResponse_QNAME, CreateSignatureKeyCertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCreateSignatureKeyCertFromKeyPair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "createSkcFKP")
    public JAXBElement<WSCreateSignatureKeyCertFromKeyPair> createCreateSkcFKP(WSCreateSignatureKeyCertFromKeyPair value) {
        return new JAXBElement<WSCreateSignatureKeyCertFromKeyPair>(_CreateSkcFKP_QNAME, WSCreateSignatureKeyCertFromKeyPair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDeleteSignaturePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/SignServer/adminSig/v1.3.0/", name = "deleteSigPol")
    public JAXBElement<WSDeleteSignaturePolicy> createDeleteSigPol(WSDeleteSignaturePolicy value) {
        return new JAXBElement<WSDeleteSignaturePolicy>(_DeleteSigPol_QNAME, WSDeleteSignaturePolicy.class, null, value);
    }

}
