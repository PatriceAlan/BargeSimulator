public class Demande {
    private String type;
    private Port origine;
    private Port destination;
    private int depart;
    private int arrivee;
    private int volume;

    public void setType(String type) {
        this.type = type;
    }

    public void setOrigine(Port origine) {
        this.origine = origine;
    }

    public void setDestination(Port destination) {
        this.destination = destination;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public void setArrivee(int arrivee) {
        this.arrivee = arrivee;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

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