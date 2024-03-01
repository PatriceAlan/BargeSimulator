import java.util.ArrayList;
import java.util.List;

public class MoteurSimulation {
    private List<Service> services;
    private List<Demande> demandes;
    private int jourActuel;
    private int cycleActuel;
    static final int CYCLE_LENGTH = 14; // Longueur d'un cycle en jours
    static final int NB_CYCLES = 3; // Nombre de cycles à simuler

    public MoteurSimulation() {
        this.services = new ArrayList<>();
        this.demandes = new ArrayList<>();
        this.jourActuel = 0;
        this.cycleActuel = 0;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Demande> getDemandes() {
        return demandes;
    }

    public void setDemandes(List<Demande> demandes) {
        this.demandes = demandes;
    }

    public int getJourActuel() {
        return jourActuel;
    }

    public void setJourActuel(int jourActuel) {
        this.jourActuel = jourActuel;
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
        System.out.println("---- Simulation pour le jour " + jourActuel + " (Cycle " + (cycleActuel + 1) + ") ----");
        System.out.println();

        // Affichage des nouvelles demandes pour le cycle actuel
        for (Demande demande : demandes) {
            int depart = demande.getDepart() + cycleActuel * CYCLE_LENGTH;
            int arrivee = demande.getArrivee() + cycleActuel * CYCLE_LENGTH;
            if (depart == jourActuel) {
                System.out.println("Nouvelle demande de type " + demande.getType() + " de " + demande.getOrigine().getNom() + " à " + demande.getDestination().getNom() + " pour " + demande.getVolume() + " TEUs au jour " + depart + " du cycle " + (cycleActuel + 1));
            } else if (arrivee == jourActuel) {
                System.out.println("Arrivée de la demande de type " + demande.getType() + " de " + demande.getOrigine().getNom() + " à " + demande.getDestination().getNom() + " pour " + demande.getVolume() + " TEUs au jour " + arrivee + " du cycle " + (cycleActuel + 1));
            }
        }

        // Traitement des services pour un seul cycle
        for (Service service : services) {
            int debutChargement = service.getDebutChargement() + cycleActuel * CYCLE_LENGTH;
            int finChargement = service.getFinChargement() + cycleActuel * CYCLE_LENGTH;
            if (debutChargement <= jourActuel && jourActuel <= finChargement) {
                System.out.println("Chargement/Déchargement pour le service " + service.getNom() + " au jour " + jourActuel + " du cycle " + (cycleActuel + 1));
            }
        }

        // Vérification si une demande ne peut pas arriver dans les temps pour le cycle actuel
        for (Demande demande : demandes) {
            int depart = demande.getDepart() + cycleActuel * CYCLE_LENGTH;
            int arrivee = demande.getArrivee() + cycleActuel * CYCLE_LENGTH;
            if (depart <= jourActuel && jourActuel <= arrivee) {
                boolean serviceDisponible = false;
                for (Service service : services) {
                    if (service.getItineraire().contains(demande.getOrigine()) && (service.getFinChargement() + cycleActuel * CYCLE_LENGTH) >= jourActuel) {
                        serviceDisponible = true;
                        break;
                    }
                }
                if (!serviceDisponible) {
                    System.out.println("La demande de type " + demande.getType() + " de " + demande.getOrigine().getNom() + " à " + demande.getDestination().getNom() + " pour " + demande.getVolume() + " TEUs ne peut pas être servie dans les temps au jour " + jourActuel + " du cycle " + (cycleActuel + 1));
                }
            }
        }

        System.out.println("\n");

        // Passer au cycle suivant lorsque tous les jours du cycle actuel ont été simulés
        if (jourActuel >= (cycleActuel + 1) * CYCLE_LENGTH) {
            cycleActuel++;
        }

        // Arrêter la simulation après un nombre de cycles défini
        if (cycleActuel >= NB_CYCLES) {
            System.out.println("Fin de la simulation après " + NB_CYCLES + " cycles.");
            System.exit(0);
        }
    }



}
