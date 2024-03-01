import java.util.ArrayList;
import java.util.List;

public class MoteurSimulation {
    private List<Service> services;
    private List<Demande> demandes;
    private int jourActuel;

    public MoteurSimulation() {
        this.services = new ArrayList<>();
        this.demandes = new ArrayList<>();
        this.jourActuel = 0;
    }

    public void ajouterService(Service service) {
        services.add(service);
    }

    public void ajouterDemande(Demande demande) {
        demandes.add(demande);
    }

    public void avancerJour() {
        jourActuel++;
        if (jourActuel > 14) {
            jourActuel = 1; // Réinitialiser le compteur des jours de la semaine
        }
    }


    public void simuler() {
        System.out.println("---- Simulation pour le jour " + jourActuel + ":" + " ----");
        System.out.println();
        for (Demande demande : demandes) {
            if (demande.getDepart() == jourActuel) {
                System.out.println("Nouvelle demande de type " + demande.getType() + " de " + demande.getOrigine().getNom() + " à " + demande.getDestination().getNom() + " pour " + demande.getVolume() + " TEUs");
            }
        }

        for (Service service : services) {
            if (service.getDebutChargement() <= jourActuel && jourActuel <= service.getFinChargement()) {
                System.out.println("Chargement/Déchargement pour le service " + service.getNom());
            } else {
                System.out.println("Rien ne se passe pour le service " + service.getNom());
            }
        }
        System.out.println("\n");
    }
}
