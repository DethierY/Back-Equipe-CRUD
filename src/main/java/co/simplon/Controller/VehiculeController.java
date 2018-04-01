package co.simplon.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ModelEntity.Vehicule;
import co.simplon.service.VehiculeService;


// Classe de gestioin des liaisons entre le client, l'appli Spring Boot et la base de données
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/vehicule")
public class VehiculeController {

	@Autowired
	VehiculeService vehiculeService = new VehiculeService();

	// Méthode répondant à une requête html de type GET à l'adresse http://localhost/8080/vehicule/list
	@GetMapping(value="/list")
	public List<Vehicule> geListVehicule() {	
		return  vehiculeService.getListVehicule();		
	}
	
	// Méthode répondant à une requête html de type POST à l'adresse http://localhost/8080/vehicule/create
	@PostMapping(value="/create") 
	public Vehicule postVehicule(@RequestBody Vehicule vehicule) {
		return vehiculeService.postVehicule(vehicule);
	}

	// Méthode répondant à une requête html de type DELETE à l'adresse http://localhost/8080/vehicule/delete/{id}
	@DeleteMapping(value="/delete/{id}")
	public void deleteVehicule(@PathVariable Long id) {
		vehiculeService.deleteVehicule(id);;
	}

	// Méthode répondant à une requête html de type GET à l'adresse http://localhost/8080/vehicule/detail/{id}
	@GetMapping(value="/detail/{id}")
	public Optional<Vehicule> getVehicule(@PathVariable Long id) {
		return vehiculeService.getVehicule(id);
	}
	
	// Méthode répondant à une requête html de type PUT à l'adresse http://localhost/8080/vehicule/edit/{id}
	@PutMapping(value="/edit/{id}") 
	public Vehicule editVehicule(@RequestBody Vehicule vehicule,@PathVariable ("id") Long id) {
		return vehiculeService.editVehicule(vehicule, id);
	}

}
