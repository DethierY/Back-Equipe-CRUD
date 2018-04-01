# Back-Equipe-CRUD

## Le dossier Front-Equipe-CRUD/Complements:

Tous les fichiers annexes sont dans le dossier **Complements** du repository **Front-Equipe-CRUD**, à savoir:  
* **gedesaft_v2.sql** : script du schema de la base de données;
* **data_gedesaft_v2.sql** : export des données existantes de la base de données;
* dossier **Mock-up** qui contient les quelques écrans qui ont été maquettés;
* **co.simplon.GEDESAFTv2-0.0.1-SNAPSHOT.jar** : le .jar de l'appli back java;
* **GedesaftUML.mdj** : un fichier StarUml qui contient:  
    - Le diagramme de classes;
    - Les uses-cases;
    - Les diagrammes d'activité.
 
 ## Les différents repository:
 
 * **Back-Equipe-CRUD** : Le repo de la partie back Spring boot/jpa de l'appli.  
      J'en ai réalisé tout ce qui concerne les véhicules (classes Vehicule, VehiculeController, VehiculeService, interface IRepositoryVehicule), ainsi que les mêmes classes existantes concernant les armes impliquées et les véhicules impliqués.
 * **Front-Equiupe-CRUD** : Le repo de la partie front angular de l'appli.  
      J'en ai réalisé le angular.module.ts, le vehicule.ts, vehicule.service.ts le routing des composants véhicules dans le app-routing.ts, et les composants: vehicules, v-ajout, v-detail.  
      **Son README contient toutes les explications d'installation et de lancement de l'appli**.
 * **GEDESAFT** : première version du back, sans jpa, 100% travail personnel.  
    **Contient un test unitaire de la classe vehiculeController** : j'y suis arrivé sur ce back, par sur celui avec JPA.
 * **essaisCRUD** : "maquette" de navigation CRUD que j'ai mise au point avant de la transposer dans le front d'équipe.  
    **Contient la fonction Delete** qui n'est structurellement pas présente dans le front d'équipe.
 
 **GEDESAFT** et **essaisCRUD** sont compatibles avec la base de données utilisée pour le projet de groupe, donc sont testables (via Postman pour GEDESAFT).
