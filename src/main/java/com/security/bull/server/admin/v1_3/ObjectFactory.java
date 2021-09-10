
package com.security.bull.server.admin.v1_3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.security.bull.server.admin.v1_3 package. 
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

    private final static QName _ListGroupsResponse_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "listGroupsResponse");
    private final static QName _ConsultUser_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "consultUser");
    private final static QName _ListUsersResponse_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "listUsersResponse");
    private final static QName _ListUsers_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "listUsers");
    private final static QName _DeleteUser_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "deleteUser");
    private final static QName _DeleteGroupResponse_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "deleteGroupResponse");
    private final static QName _ListGroups_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "listGroups");
    private final static QName _CreateUser_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "createUser");
    private final static QName _CreateGroupResponse_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "createGroupResponse");
    private final static QName _DeleteGroup_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "deleteGroup");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "updateUserResponse");
    private final static QName _DepositKeystoreResponse_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "depositKeystoreResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "deleteUserResponse");
    private final static QName _DepositKeystore_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "depositKeystore");
    private final static QName _AddUsersToGroupResponse_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "addUsersToGroupResponse");
    private final static QName _CreateGroup_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "createGroup");
    private final static QName _CreateUserResponse_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "createUserResponse");
    private final static QName _RemoveUsersFromGroup_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "removeUsersFromGroup");
    private final static QName _ConsultUserResponse_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "consultUserResponse");
    private final static QName _AddUsersToGroup_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "addUsersToGroup");
    private final static QName _UpdateUser_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "updateUser");
    private final static QName _RemoveUsersFromGroupResponse_QNAME = new QName("http://www.bull.security.com/Server/admin/v1.3.0/", "removeUsersFromGroupResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.security.bull.server.admin.v1_3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WSDepositKeystore }
     * 
     */
    public WSDepositKeystore createWSDepositKeystore() {
        return new WSDepositKeystore();
    }

    /**
     * Create an instance of {@link UsersGroupResponse }
     * 
     */
    public UsersGroupResponse createUsersGroupResponse() {
        return new UsersGroupResponse();
    }

    /**
     * Create an instance of {@link WSCreateGroup }
     * 
     */
    public WSCreateGroup createWSCreateGroup() {
        return new WSCreateGroup();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link WSRemoveUsersFromGroup }
     * 
     */
    public WSRemoveUsersFromGroup createWSRemoveUsersFromGroup() {
        return new WSRemoveUsersFromGroup();
    }

    /**
     * Create an instance of {@link ConsultUserResponse }
     * 
     */
    public ConsultUserResponse createConsultUserResponse() {
        return new ConsultUserResponse();
    }

    /**
     * Create an instance of {@link WSAddUsersToGroup }
     * 
     */
    public WSAddUsersToGroup createWSAddUsersToGroup() {
        return new WSAddUsersToGroup();
    }

    /**
     * Create an instance of {@link WSUpdateUser }
     * 
     */
    public WSUpdateUser createWSUpdateUser() {
        return new WSUpdateUser();
    }

    /**
     * Create an instance of {@link ListGroupsResponse }
     * 
     */
    public ListGroupsResponse createListGroupsResponse() {
        return new ListGroupsResponse();
    }

    /**
     * Create an instance of {@link WSConsultUser }
     * 
     */
    public WSConsultUser createWSConsultUser() {
        return new WSConsultUser();
    }

    /**
     * Create an instance of {@link ListUsersResponse }
     * 
     */
    public ListUsersResponse createListUsersResponse() {
        return new ListUsersResponse();
    }

    /**
     * Create an instance of {@link WSListUsers }
     * 
     */
    public WSListUsers createWSListUsers() {
        return new WSListUsers();
    }

    /**
     * Create an instance of {@link WSDeleteUser }
     * 
     */
    public WSDeleteUser createWSDeleteUser() {
        return new WSDeleteUser();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link WSListGroups }
     * 
     */
    public WSListGroups createWSListGroups() {
        return new WSListGroups();
    }

    /**
     * Create an instance of {@link WSCreateUser }
     * 
     */
    public WSCreateUser createWSCreateUser() {
        return new WSCreateUser();
    }

    /**
     * Create an instance of {@link CreateGroupResponse }
     * 
     */
    public CreateGroupResponse createCreateGroupResponse() {
        return new CreateGroupResponse();
    }

    /**
     * Create an instance of {@link WSDeleteGroup }
     * 
     */
    public WSDeleteGroup createWSDeleteGroup() {
        return new WSDeleteGroup();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link DepositKeystoreResponse }
     * 
     */
    public DepositKeystoreResponse createDepositKeystoreResponse() {
        return new DepositKeystoreResponse();
    }

    /**
     * Create an instance of {@link RoleDescription }
     * 
     */
    public RoleDescription createRoleDescription() {
        return new RoleDescription();
    }

    /**
     * Create an instance of {@link CredentialDescription }
     * 
     */
    public CredentialDescription createCredentialDescription() {
        return new CredentialDescription();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListGroupsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "listGroupsResponse")
    public JAXBElement<ListGroupsResponse> createListGroupsResponse(ListGroupsResponse value) {
        return new JAXBElement<ListGroupsResponse>(_ListGroupsResponse_QNAME, ListGroupsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSConsultUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "consultUser")
    public JAXBElement<WSConsultUser> createConsultUser(WSConsultUser value) {
        return new JAXBElement<WSConsultUser>(_ConsultUser_QNAME, WSConsultUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "listUsersResponse")
    public JAXBElement<ListUsersResponse> createListUsersResponse(ListUsersResponse value) {
        return new JAXBElement<ListUsersResponse>(_ListUsersResponse_QNAME, ListUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSListUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "listUsers")
    public JAXBElement<WSListUsers> createListUsers(WSListUsers value) {
        return new JAXBElement<WSListUsers>(_ListUsers_QNAME, WSListUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "deleteUser")
    public JAXBElement<WSDeleteUser> createDeleteUser(WSDeleteUser value) {
        return new JAXBElement<WSDeleteUser>(_DeleteUser_QNAME, WSDeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "deleteGroupResponse")
    public JAXBElement<DeleteResponse> createDeleteGroupResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteGroupResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSListGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "listGroups")
    public JAXBElement<WSListGroups> createListGroups(WSListGroups value) {
        return new JAXBElement<WSListGroups>(_ListGroups_QNAME, WSListGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "createUser")
    public JAXBElement<WSCreateUser> createCreateUser(WSCreateUser value) {
        return new JAXBElement<WSCreateUser>(_CreateUser_QNAME, WSCreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "createGroupResponse")
    public JAXBElement<CreateGroupResponse> createCreateGroupResponse(CreateGroupResponse value) {
        return new JAXBElement<CreateGroupResponse>(_CreateGroupResponse_QNAME, CreateGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDeleteGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "deleteGroup")
    public JAXBElement<WSDeleteGroup> createDeleteGroup(WSDeleteGroup value) {
        return new JAXBElement<WSDeleteGroup>(_DeleteGroup_QNAME, WSDeleteGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositKeystoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "depositKeystoreResponse")
    public JAXBElement<DepositKeystoreResponse> createDepositKeystoreResponse(DepositKeystoreResponse value) {
        return new JAXBElement<DepositKeystoreResponse>(_DepositKeystoreResponse_QNAME, DepositKeystoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "deleteUserResponse")
    public JAXBElement<DeleteResponse> createDeleteUserResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteUserResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDepositKeystore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "depositKeystore")
    public JAXBElement<WSDepositKeystore> createDepositKeystore(WSDepositKeystore value) {
        return new JAXBElement<WSDepositKeystore>(_DepositKeystore_QNAME, WSDepositKeystore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsersGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "addUsersToGroupResponse")
    public JAXBElement<UsersGroupResponse> createAddUsersToGroupResponse(UsersGroupResponse value) {
        return new JAXBElement<UsersGroupResponse>(_AddUsersToGroupResponse_QNAME, UsersGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCreateGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "createGroup")
    public JAXBElement<WSCreateGroup> createCreateGroup(WSCreateGroup value) {
        return new JAXBElement<WSCreateGroup>(_CreateGroup_QNAME, WSCreateGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSRemoveUsersFromGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "removeUsersFromGroup")
    public JAXBElement<WSRemoveUsersFromGroup> createRemoveUsersFromGroup(WSRemoveUsersFromGroup value) {
        return new JAXBElement<WSRemoveUsersFromGroup>(_RemoveUsersFromGroup_QNAME, WSRemoveUsersFromGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "consultUserResponse")
    public JAXBElement<ConsultUserResponse> createConsultUserResponse(ConsultUserResponse value) {
        return new JAXBElement<ConsultUserResponse>(_ConsultUserResponse_QNAME, ConsultUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSAddUsersToGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "addUsersToGroup")
    public JAXBElement<WSAddUsersToGroup> createAddUsersToGroup(WSAddUsersToGroup value) {
        return new JAXBElement<WSAddUsersToGroup>(_AddUsersToGroup_QNAME, WSAddUsersToGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSUpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "updateUser")
    public JAXBElement<WSUpdateUser> createUpdateUser(WSUpdateUser value) {
        return new JAXBElement<WSUpdateUser>(_UpdateUser_QNAME, WSUpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsersGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bull.security.com/Server/admin/v1.3.0/", name = "removeUsersFromGroupResponse")
    public JAXBElement<UsersGroupResponse> createRemoveUsersFromGroupResponse(UsersGroupResponse value) {
        return new JAXBElement<UsersGroupResponse>(_RemoveUsersFromGroupResponse_QNAME, UsersGroupResponse.class, null, value);
    }

}
