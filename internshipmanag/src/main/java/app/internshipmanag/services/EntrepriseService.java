package app.internshipmanag.services;

import app.internshipmanag.dto.EntrepriseDTO;
import app.internshipmanag.entities.Entreprise;
import app.internshipmanag.repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    public Entreprise saveEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    public List<EntrepriseDTO> getAllEntreprises() {
        return entrepriseRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public EntrepriseDTO getEntrepriseById(Integer siretEntreprise) {
        return entrepriseRepository.findById(siretEntreprise)
                .map(this::convertToDTO)
                .orElse(null);
    }

    public void deleteEntreprise(Integer siretEntreprise) {
        entrepriseRepository.deleteById(siretEntreprise);
    }

    private EntrepriseDTO convertToDTO(Entreprise entreprise) {
        EntrepriseDTO dto = new EntrepriseDTO();
        dto.setSiretEntreprise(entreprise.getSiretEntreprise());
        dto.setRaisonSocial(entreprise.getRaisonSocial());
        dto.setFormeJuridique(entreprise.getFormeJuridique());
        dto.setAdresse(entreprise.getAdresse());
        dto.setVille(entreprise.getVille());
        dto.setCodePostal(entreprise.getCodePostal());
        dto.setTelephone(entreprise.getTelephone());
        dto.setFax(entreprise.getFax());
        dto.setContact(entreprise.getContact());
        dto.setTelContact(entreprise.getTelContact());
        return dto;
    }
}
