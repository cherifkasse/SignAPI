
package com.security.bull.server.coreadmin.v1_3;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.security.bull.server.coreadmin.v1_3 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.security.bull.server.coreadmin.v1_3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServerManager }
     * 
     */
    public ServerManager createServerManager() {
        return new ServerManager();
    }

    /**
     * Create an instance of {@link UsersToGroupAssociation }
     * 
     */
    public UsersToGroupAssociation createUsersToGroupAssociation() {
        return new UsersToGroupAssociation();
    }

    /**
     * Create an instance of {@link ApplicationSpecification }
     * 
     */
    public ApplicationSpecification createApplicationSpecification() {
        return new ApplicationSpecification();
    }

    /**
     * Create an instance of {@link CredentialReference }
     * 
     */
    public CredentialReference createCredentialReference() {
        return new CredentialReference();
    }

    /**
     * Create an instance of {@link CredentialId }
     * 
     */
    public CredentialId createCredentialId() {
        return new CredentialId();
    }

    /**
     * Create an instance of {@link UserReference }
     * 
     */
    public UserReference createUserReference() {
        return new UserReference();
    }

    /**
     * Create an instance of {@link ApplicationReference }
     * 
     */
    public ApplicationReference createApplicationReference() {
        return new ApplicationReference();
    }

    /**
     * Create an instance of {@link X509Certificate }
     * 
     */
    public X509Certificate createX509Certificate() {
        return new X509Certificate();
    }

    /**
     * Create an instance of {@link Auditor }
     * 
     */
    public Auditor createAuditor() {
        return new Auditor();
    }

    /**
     * Create an instance of {@link UserSpecification }
     * 
     */
    public UserSpecification createUserSpecification() {
        return new UserSpecification();
    }

    /**
     * Create an instance of {@link PasswordWrapper }
     * 
     */
    public PasswordWrapper createPasswordWrapper() {
        return new PasswordWrapper();
    }

    /**
     * Create an instance of {@link RoleReference }
     * 
     */
    public RoleReference createRoleReference() {
        return new RoleReference();
    }

    /**
     * Create an instance of {@link GroupSpecification }
     * 
     */
    public GroupSpecification createGroupSpecification() {
        return new GroupSpecification();
    }

    /**
     * Create an instance of {@link GroupReference }
     * 
     */
    public GroupReference createGroupReference() {
        return new GroupReference();
    }

}
