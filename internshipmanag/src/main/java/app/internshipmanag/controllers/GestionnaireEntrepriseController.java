package app.internshipmanag.controllers;

import app.internshipmanag.dto.GestionnaireEntrepriseDTO;
import app.internshipmanag.entities.GestionnaireEntreprise;
import app.internshipmanag.services.GestionnaireEntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gestionnaires")
public class GestionnaireEntrepriseController {

    @Autowired
    private GestionnaireEntrepriseService gestionnaireEntrepriseService;

    @GetMapping
    public List<GestionnaireEntrepriseDTO> getAllGestionnaires() {
        return gestionnaireEntrepriseService.getAllGestionnaires();
    }

    @GetMapping("/{idGestionnaire}")
    public ResponseEntity<GestionnaireEntrepriseDTO> getGestionnaireById(@PathVariable Integer idGestionnaire) {
        GestionnaireEntrepriseDTO gestionnaireDTO = gestionnaireEntrepriseService.getGestionnaireById(idGestionnaire);
        if (gestionnaireDTO != null) {
            return ResponseEntity.ok(gestionnaireDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<GestionnaireEntreprise> createGestionnaire(@RequestBody GestionnaireEntreprise gestionnaireEntreprise) {
        GestionnaireEntreprise savedGestionnaire = gestionnaireEntrepriseService.saveGestionnaire(gestionnaireEntreprise);
        return ResponseEntity.ok(savedGestionnaire);
    }

    @DeleteMapping("/{idGestionnaire}")
    public ResponseEntity<Void> deleteGestionnaire(@PathVariable Integer idGestionnaire) {
        gestionnaireEntrepriseService.deleteGestionnaire(idGestionnaire);
        return ResponseEntity.noContent().build();
    }
}
