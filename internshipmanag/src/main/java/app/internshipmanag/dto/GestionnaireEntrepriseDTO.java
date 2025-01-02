package app.internshipmanag.dto;

public class GestionnaireEntrepriseDTO {

    private Integer idGestionnaire;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;

    // Getters and Setters
    public Integer getIdGestionnaire() {
        return idGestionnaire;
    }

    public void setIdGestionnaire(Integer idGestionnaire) {
        this.idGestionnaire = idGestionnaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
