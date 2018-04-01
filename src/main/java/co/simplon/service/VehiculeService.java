package co.simplon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.ModelEntity.Vehicule;
import co.simplon.Repository.IRepositoryVehicule;

@Service
public class VehiculeService {
	
	// Injection d'une instance de la classe gérant la connexion avec la base de données, étendant l'interface JpaRepository par héritage
	@Autowired
	private IRepositoryVehicule iRepositoryVehicule;

	// Obtenir la liste de tous les véhicules de la table véhicule
	// Correspond à la requête SQL: SELECT * FROM vehicule
	public List<Vehicule> getListVehicule() {	
		return iRepositoryVehicule.findAll();		
	}
	
	// Permet d'insérer un nouveau véhicule dans la table vehicule
	// Correspond à la requête SQL: INSERT INTO vehicule (type, marque, modèle, immatriculation, couleur, id_personne) VALUES ("valeur1", "valeur2", "valeur3", "valeur4", "valeur5", valeur6)
	public Vehicule postVehicule(Vehicule vehicule) {
		return iRepositoryVehicule.save(vehicule);
	}

	// Permet de supprimer un véhicule de la table vehicule
	// Correspond à la requête SQL: DELETE * FROM vehicule WHERE id_vehicule = {id}
	public void deleteVehicule(Long id) {
		iRepositoryVehicule.deleteById(id);
	}

	// Permet d'obtenir les données d'un véhicule de la table vehicule
	// Correspond à la requête SQL: SELECT * FROM vehicule WHERE id_vehicule = {id}
	public Optional<Vehicule> getVehicule(Long id) {
		return iRepositoryVehicule.findById(id);
	}
		
	// Permet de modifier les données d'un véhicule de la table vehicule
	// Correspond à la requête SQL: UPDATE vehicule SET type = "valeur1", marque = "valeur2", modele = "valeur3", immatriculation = "valeur4", couleur = "valeur5",  id_personne = valeur6 WHERE id_vehicule = {id}
	public Vehicule editVehicule(Vehicule vehicule, Long id) {
		Vehicule vehiculeToUpdate = iRepositoryVehicule.getOne(id);		
		vehiculeToUpdate.setType(vehicule.getType());
		vehiculeToUpdate.setMarque(vehicule.getMarque());
		vehiculeToUpdate.setModele(vehicule.getModele());
		vehiculeToUpdate.setImmatriculation(vehicule.getImmatriculation());
		vehiculeToUpdate.setCouleur(vehicule.getCouleur());
		vehiculeToUpdate.setPersonne(vehicule.getPersonne());		
		return iRepositoryVehicule.save(vehiculeToUpdate);
	}

}
