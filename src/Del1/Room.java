package Del1;

//Felter: name (String), lamps (ArrayList<Lamp>), windows (ArrayList<Window>)
//Konstruktør: tager name
//Metoder:
//void addLamp(Lamp lamp)
//void addWindow(Window window)
//int getLampCount()
//int getTotalWatt() — sum af alle lampernes watt
//int getTotalWindowArea() — sum af alle vinduers areal
//void printRoom()

import java.util.ArrayList;

public class Room {
    String name;
    ArrayList<Lamp> lamps;
    ArrayList<Window> windows;

    public Room(String name) {
        this.name = name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    void addWindow(Window window) {
        windows.add(window);
    }

    int getLampCount() {
        return lamps.size();
    }

    int getTotalWatt() { //sum af alle lampernes watt
        int total = 0;
        for (Lamp lamp : lamps) {
            total += lamp.getWatt();
        }
        return total;
    }

    int getTotalWindowArea() { // sum af alle vinduers areal
        int total = 0;
        for (Window window : windows) {
            total += window.getAreaCm2();
        }
        return total;
    }

    public void printRoom() {
    //Printer cunmets navn, Lamper 0g vinduer til konsolen
        System.out.println(name + " (" + lamps.size() + " Lamper, " + windows.size() + " vinduer) ");
// Byg Lampeliste som tekst
        StringBuilder lampStr = new StringBuilder( " Lamper: ");
        for (int i = 0; i < lamps.size(); i++) {
            lampStr.append(lamps.get(i));
            if (i < lamps.size() - 1) lampStr.append(", ");
        }
        lampStr.append(" (total: ").append(getTotalWatt()).append ("W)");
        System. out.println(lampStr);
// Byg vinduesliste som tekst
        StringBuilder winStr = new StringBuilder(" Vinduer: ");
        for (int i = 0; i < windows.size(); i++) {
            winStr.append(windows.get(i));
            if (i < windows.size() - 1) winStr.append(", ");
        }
        System.out.println(winStr);
    }

}




