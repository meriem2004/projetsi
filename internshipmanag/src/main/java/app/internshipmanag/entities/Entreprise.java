package app.internshipmanag.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Entreprise")
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "siret_entreprise")
    private Integer siretEntreprise;

    @Column(name = "raison_social_entreprise", nullable = false)
    private String raisonSocial;

    @Column(name = "forme_juridique", nullable = false)
    private String formeJuridique;

    @Column(name = "adresse_entreprise", nullable = false)
    private String adresse;

    @Column(name = "ville_entreprise", nullable = false)
    private String ville;

    @Column(name = "code_postal_entreprise", nullable = false)
    private Integer codePostal;

    @Column(name = "telephone_entreprise", nullable = false)
    private String telephone;

    @Column(name = "fax_entreprise")
    private String fax;

    @Column(name = "contact_entreprise", nullable = false)
    private String contact;

    @Column(name = "tel_contact", nullable = false)
    private String telContact;

    @ManyToOne
    @JoinColumn(name = "id_gestionnaire", nullable = false)
    private GestionnaireEntreprise gestionnaire;

    // Getters and Setters
    public Integer getSiretEntreprise() {
        return siretEntreprise;
    }

    public void setSiretEntreprise(Integer siretEntreprise) {
        this.siretEntreprise = siretEntreprise;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getFormeJuridique() {
        return formeJuridique;
    }

    public void setFormeJuridique(String formeJuridique) {
        this.formeJuridique = formeJuridique;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Integer getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelContact() {
        return telContact;
    }

    public void setTelContact(String telContact) {
        this.telContact = telContact;
    }

    public GestionnaireEntreprise getGestionnaire() {
        return gestionnaire;
    }

    public void setGestionnaire(GestionnaireEntreprise gestionnaire) {
        this.gestionnaire = gestionnaire;
    }
}
