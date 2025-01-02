package app.internshipmanag.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Gestionnaire_entreprise")
public class GestionnaireEntreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gestionnaire")
    private Integer idGestionnaire;

    @Column(name = "nom_gestionnaire", nullable = false)
    private String nom;

    @Column(name = "prenom_gestionnaire", nullable = false)
    private String prenom;

    @Column(name = "email_gestionnaire", nullable = false)
    private String email;

    @Column(name = "mot_de_passe_gestionnaire", nullable = false)
    private String motDePasse;

    @OneToMany(mappedBy = "gestionnaire")
    private List<Entreprise> entreprises;

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

    public List<Entreprise> getEntreprises() {
        return entreprises;
    }

    public void setEntreprises(List<Entreprise> entreprises) {
        this.entreprises = entreprises;
    }
}
