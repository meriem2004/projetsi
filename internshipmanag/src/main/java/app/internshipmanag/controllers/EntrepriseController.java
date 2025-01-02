package app.internshipmanag.controllers;

import app.internshipmanag.dto.EntrepriseDTO;
import app.internshipmanag.entities.Entreprise;
import app.internshipmanag.services.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entreprises")
public class EntrepriseController {

    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping
    public List<EntrepriseDTO> getAllEntreprises() {
        return entrepriseService.getAllEntreprises();
    }

    @GetMapping("/{siretEntreprise}")
    public ResponseEntity<EntrepriseDTO> getEntrepriseById(@PathVariable Integer siretEntreprise) {
        EntrepriseDTO entrepriseDTO = entrepriseService.getEntrepriseById(siretEntreprise);
        if (entrepriseDTO != null) {
            return ResponseEntity.ok(entrepriseDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Entreprise> createEntreprise(@RequestBody Entreprise entreprise) {
        Entreprise savedEntreprise = entrepriseService.saveEntreprise(entreprise);
        return ResponseEntity.ok(savedEntreprise);
    }

    @DeleteMapping("/{siretEntreprise}")
    public ResponseEntity<Void> deleteEntreprise(@PathVariable Integer siretEntreprise) {
        entrepriseService.deleteEntreprise(siretEntreprise);
        return ResponseEntity.noContent().build();
    }
}
