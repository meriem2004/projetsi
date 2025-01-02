package app.internshipmanag.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "INTERNSHIP_OFFERS")
public class InternshipOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OFFER_ID")
    private Long offerId;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Lob
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Lob
    @Column(name = "REQUIREMENTS")
    private String requirements;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "DURATION_MONTHS")
    private Integer durationMonths;

    @Column(name = "STIPEND")
    private Double stipend;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID", nullable = false)
    private Entreprise company;

    @ManyToOne
    @JoinColumn(name = "REPRESENTATIVE_ID", nullable = false)
    private CompanyRepresentative representative;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    // Getters and Setters
}
