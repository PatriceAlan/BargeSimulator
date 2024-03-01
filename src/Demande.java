public class Demande {
    private String type;
    private Port origine;
    private Port destination;
    private int depart;
    private int arrivee;
    private int volume;

    public Demande(String type, Port origine, Port destination, int depart, int arrivee, int volume) {
        this.type = type;
        this.origine = origine;
        this.destination = destination;
        this.depart = depart;
        this.arrivee = arrivee;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public Port getOrigine() {
        return origine;
    }

    public Port getDestination() {
        return destination;
    }

    public int getDepart() {
        return depart;
    }

    public int getArrivee() {
        return arrivee;
    }

    public int getVolume() {
        return volume;
    }
}