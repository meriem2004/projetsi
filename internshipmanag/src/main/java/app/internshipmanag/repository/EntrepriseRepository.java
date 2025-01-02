package app.internshipmanag.repository;

import app.internshipmanag.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {
    // You can add custom queries here if needed
}
