import java.util.List;

public class Service {
    private String nom;
    private List<Port> itineraire;
    private int debutChargement;
    private int finChargement;

    public Service(String nom, List<Port> itineraire, int debutChargement, int finChargement) {
        this.nom = nom;
        this.itineraire = itineraire;
        this.debutChargement = debutChargement;
        this.finChargement = finChargement;
    }

    public String getNom() {
        return nom;
    }

    public List<Port> getItineraire() {
        return itineraire;
    }

    public int getDebutChargement() {
        return debutChargement;
    }

    public int getFinChargement() {
        return finChargement;
    }
}