package app.internshipmanag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.internshipmanag.entities.InternshipOffer;

public interface InternshipOfferRepository extends JpaRepository<InternshipOffer, Long> {
}
