package co.simplon.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.ModelEntity.Vehicule;

// interface héritant de l'interface JpaRepository gérant la connection avec la base de données pour les objects de type Vehicule
@Repository
public interface IRepositoryVehicule extends JpaRepository<Vehicule, Long>{

}
