package net.gainde2000.cf.entity;

public class Init_Signataire {
	public Long getDelegationID() {
		return delegationID;
	}
	public void setDelegationID(Long delegationID) {
		this.delegationID = delegationID;
	}
	public String getCleSignataire() {
		return cleSignataire;
	}
	public void setCleSignataire(String cleSignataire) {
		this.cleSignataire = cleSignataire;
	}
	public String getCodePIN() {
		return codePIN;
	}
	public void setCodePIN(String codePIN) {
		this.codePIN = codePIN;
	}
	public Long getIdApplication() {
		return idApplication;
	}
	public void setIdApplication(Long idApplication) {
		this.idApplication = idApplication;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInfoError() {
		return infoError;
	}
	public void setInfoError(String infoError) {
		this.infoError = infoError;
	}
	Long delegationID;
	String cleSignataire;
	String codePIN;
	Long idApplication;
	String status;
	String infoError;

}
