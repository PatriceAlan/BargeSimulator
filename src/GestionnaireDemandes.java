import java.util.ArrayList;
import java.util.List;

public class GestionnaireDemandes {

    private List<Service> demandes;

    public GestionnaireDemandes() {
        this.demandes = new ArrayList<Service>();
    }

    public void ajouterDemande(Service demande) {
        demandes.add(demande);
    }
    public List<Service> getDemandes() {
        return demandes;
    }
}
