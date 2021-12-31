package rekursion;

import java.util.ArrayList;

public class Ort {

    private String name;
    private ArrayList<Ort> nachbarn;

    public Ort(String name) {
        this.name = name;
        this.nachbarn = new ArrayList<>();
    }

    public void addNachbar(Ort o){
        this.nachbarn.add(o);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ort> getNachbarn() {
        return nachbarn;
    }

    public int countHops(Ort start, Ort goal) {
        ArrayList <Ort> hops = new ArrayList<>(); // Arraylist dient zum Speichern des Wegs
        return countHops(start, goal, hops);
    }

    private int countHops(Ort start, Ort goal, ArrayList<Ort> hops) {
        if (hops.contains(this))
        {
            // Eigener Knoten bereits in Liste, somit Abbruch
            return -1;
        }
        hops.add(this); // sich selbst in den Weg als Hop aufnehmen

        for (Ort n : getNachbarn()) {
            if (n == goal) {
                // Ziel wurde gefunden, der Weg steht nun in der Liste
                return hops.size();
            }

            int count = n.countHops(start, goal, hops);
            if (count > 0)
                return count;
        }
        hops.remove(this); // sich selbst wieder aus dem Weg herausnehmen
        return -1;
    }
}
