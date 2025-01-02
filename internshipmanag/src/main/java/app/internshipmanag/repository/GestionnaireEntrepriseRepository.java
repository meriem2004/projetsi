package app.internshipmanag.repository;

import app.internshipmanag.entities.GestionnaireEntreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestionnaireEntrepriseRepository extends JpaRepository<GestionnaireEntreprise, Integer> {
    // Custom query methods can be added here if needed
}
