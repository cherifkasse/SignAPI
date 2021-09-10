package come.example.signapi.model;

public class InfosRetour {
    private String cle_signataire;
    private String status;
    private String id_app;
    private String id_user;

    public InfosRetour() {}

    public InfosRetour(String cle_signataire, String status, String id_app, String id_user) {
        this.cle_signataire = cle_signataire;
        this.status = status;
        this.id_app = id_app;
        this.id_user = id_user;
    }

    public String getCle_signataire() {
        return cle_signataire;
    }

    public void setCle_signataire(String cle_signataire) {
        this.cle_signataire = cle_signataire;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId_app() {
        return id_app;
    }

    public void setId_app(String id_app) {
        this.id_app = id_app;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }
}
