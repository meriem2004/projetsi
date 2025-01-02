package app.internshipmanag.services;

import app.internshipmanag.dto.GestionnaireEntrepriseDTO;
import app.internshipmanag.entities.GestionnaireEntreprise;
import app.internshipmanag.repository.GestionnaireEntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GestionnaireEntrepriseService {

    @Autowired
    private GestionnaireEntrepriseRepository gestionnaireEntrepriseRepository;

    public GestionnaireEntreprise saveGestionnaire(GestionnaireEntreprise gestionnaireEntreprise) {
        return gestionnaireEntrepriseRepository.save(gestionnaireEntreprise);
    }

    public List<GestionnaireEntrepriseDTO> getAllGestionnaires() {
        return gestionnaireEntrepriseRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public GestionnaireEntrepriseDTO getGestionnaireById(Integer idGestionnaire) {
        return gestionnaireEntrepriseRepository.findById(idGestionnaire)
                .map(this::convertToDTO)
                .orElse(null);
    }

    public void deleteGestionnaire(Integer idGestionnaire) {
        gestionnaireEntrepriseRepository.deleteById(idGestionnaire);
    }

    private GestionnaireEntrepriseDTO convertToDTO(GestionnaireEntreprise gestionnaireEntreprise) {
        GestionnaireEntrepriseDTO dto = new GestionnaireEntrepriseDTO();
        dto.setIdGestionnaire(gestionnaireEntreprise.getIdGestionnaire());
        dto.setNom(gestionnaireEntreprise.getNom());
        dto.setPrenom(gestionnaireEntreprise.getPrenom());
        dto.setEmail(gestionnaireEntreprise.getEmail());
        dto.setMotDePasse(gestionnaireEntreprise.getMotDePasse());
        return dto;
    }
}
