package net.gainde2000.cf.entity;

import java.util.Date;

public class Utilisateur {

	long delegationId;
	String signature_Key;
	String activation_Code;
	String Prenom_Nom;
	long trustedApplication;
	Date dateExpiration_certificate; 
	String num_cnid;
	
	public Date getDateExpiration_certificate() {
		return dateExpiration_certificate;
	}
	public void setDateExpiration_certificate(Date dateExpiration_certificate) {
		this.dateExpiration_certificate = dateExpiration_certificate;
	}
	public long getTrustedApplication() {
		return trustedApplication;
	}
	public void setTrustedApplication(long trustedApplication) {
		this.trustedApplication = trustedApplication;
	}
	public String getPrenom_Nom() {
		return Prenom_Nom;
	}
	public void setPrenom_Nom(String prenom_Nom) {
		Prenom_Nom = prenom_Nom;
	}
	public long getDelegationId() {
		return delegationId;
	}
	public void setDelegationId(long delegationId) {
		this.delegationId = delegationId;
	}
	public String getSignature_Key() {
		return signature_Key;
	}
	public void setSignature_Key(String signature_Key) {
		this.signature_Key = signature_Key;
	}
	public String getActivation_Code() {
		return activation_Code;
	}
	public void setActivation_Code(String activation_Code) {
		this.activation_Code = activation_Code;
	}

	public String getNumeroCNID() {
		return num_cnid;
	}
	public void setNumeroCNID(String numero_cnid) {
		this.num_cnid = numero_cnid;
	}
	
}
