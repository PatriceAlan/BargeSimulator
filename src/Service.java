import java.util.List;

public class Service {
    private String nom;
    private List<Port> itineraire;
    private int debutChargement;
    private int finChargement;

    private int capacite;

    public Service(String nom, List<Port> itineraire, int debutChargement, int finChargement, int capacite) {
        this.nom = nom;
        this.itineraire = itineraire;
        this.debutChargement = debutChargement;
        this.finChargement = finChargement;
        this.capacite = capacite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Port> getItineraire() {
        return itineraire;
    }

    public void setItineraire(List<Port> itineraire) {
        this.itineraire = itineraire;
    }

    public int getDebutChargement() {
        return debutChargement;
    }

    public void setDebutChargement(int debutChargement) {
        this.debutChargement = debutChargement;
    }

    public int getFinChargement() {
        return finChargement;
    }

    public void setFinChargement(int finChargement) {
        this.finChargement = finChargement;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}