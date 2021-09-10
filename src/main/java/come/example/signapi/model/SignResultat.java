package come.example.signapi.model;

import org.springframework.web.multipart.MultipartFile;

public class SignResultat {
    private byte[] fichier;
    private String status;
    private String infoError="";
    private String fichier1;

    public SignResultat(byte[] fichier, String status, String infoError, String file) {
        this.fichier = fichier;
        this.status = status;
        this.infoError = infoError;
        this.fichier1 = file;
    }

    public String getFichier1() {
        return fichier1;
    }

    public void setFichier1(String fichier1) {
        this.fichier1 = fichier1;
    }

    public String getInfoError() {
        return infoError;
    }

    public void setInfoError(String infoError) {
        this.infoError = infoError;
    }

    public SignResultat() {}

    public byte[] getFichier() {
        return fichier;
    }

    public void setFichier(byte[] fichier) {
        this.fichier = fichier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
