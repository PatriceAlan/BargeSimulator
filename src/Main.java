import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Création des ports
        Port portA = new Port("A");
        Port portB = new Port("B");
        Port portC = new Port("C");
        Port portD = new Port("D");

        // Création des services
        List<Port> itineraireS1 = new ArrayList<>();
        itineraireS1.add(portA);
        itineraireS1.add(portD);
        Service serviceS1 = new Service("S1", itineraireS1, 0, 6, 35);

        List<Port> itineraireS2 = new ArrayList<>();
        itineraireS2.add(portD);
        itineraireS2.add(portB);
        Service serviceS2 = new Service("S2", itineraireS2, 0, 3, 30);

        List<Port> itineraireS3 = new ArrayList<>();
        itineraireS3.add(portB);
        itineraireS3.add(portD);
        Service serviceS3 = new Service("S3", itineraireS3, 4, 7, 10);

        List<Port> itineraireS4 = new ArrayList<>();
        itineraireS4.add(portA);
        itineraireS4.add(portC);
        Service serviceS4 = new Service("S4", itineraireS4, 6, 9, 15);

        // Création des demandes
        Demande demande1 = new Demande("F", portA, portD, 0, 8, 13);
        Demande demande2 = new Demande("P", portD, portB, 11, 1, 15);
        Demande demande3 = new Demande("R", portA, portC, 2, 13, 20);
        Demande demande4 = new Demande("R", portD, portB, 0, 12, 15);

        // Création du moteur de simulation
        MoteurSimulation moteurSimulation = new MoteurSimulation();

        moteurSimulation.ajouterService(serviceS1);
        moteurSimulation.ajouterService(serviceS2);
        moteurSimulation.ajouterService(serviceS3);
        moteurSimulation.ajouterService(serviceS4);

        moteurSimulation.ajouterDemande(demande1);
        moteurSimulation.ajouterDemande(demande2);
        moteurSimulation.ajouterDemande(demande3);
        moteurSimulation.ajouterDemande(demande4);

        // Simulation pour plusieurs cycles
        for (int cycle = 1; cycle <= MoteurSimulation.NB_CYCLES; cycle++) {
            System.out.println("Cycle " + cycle);
            for (int jour = 1; jour <= MoteurSimulation.CYCLE_LENGTH; jour++) {
                moteurSimulation.simuler();
                moteurSimulation.avancerJour();
            }
        }
    }
}
