import java.util.ArrayList;
import java.util.List;

public class Service {

    private String id;
    private int capacite;
    private String origine;
    private String destination;

    private List<String> terminauxIntermediaires;

    public Service(String id, int capacite, String origine, String destination) {
        this.id = id;
        this.capacite = capacite;
        this.origine = origine;
        this.destination = destination;
        this.terminauxIntermediaires = new ArrayList<String>();
    }

    public String getId() {
        return id;
    }

    public int getCapacite() {
        return capacite;
    }

    public String getOrigine() {
        return origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String toString() {
        return "Service [id=" + id + ", capacite=" + capacite + ", origine=" + origine + ", destination=" + destination + "]";
    }
}
