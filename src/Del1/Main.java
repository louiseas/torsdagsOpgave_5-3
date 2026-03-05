package Del1;

public class Main {

//Opret en bygning med mindst tre rum. Hvert rum skal have mindst to lamper og ét vindue. Print bygningen og svar på:
//
//Hvor mange lamper er der i hele bygningen?
//Hvad er det samlede wattal?

    public static void main(String[] args) {

        //Kantine:
        //opret bygning
        Building building1 = new Building("EK Erhvervs Akademi");
        //opret rum
        Room room1 = new Room("Kantine:");

        room1.addLamp(new Lamp(60));
        room1.addLamp(new Lamp(30));
        room1.addWindow(new Window(60, 60));
        building1.addRoom(room1);

        //Mødelokale:

        Room room2 = new Room("Mødelokale");
        room2.addLamp(new Lamp(80));
        room2.addLamp(new Lamp(70));
        room2.addLamp(new Lamp(35));
        room2.addWindow(new Window(100, 120));
        room2.addWindow(new Window(80, 100));
        building1.addRoom(room2);

        //Lokale 3.7- klasse lokale

        Room room3 = new Room("Klasselokale 3.7");
        room3.addLamp(new Lamp(50));
        room3.addLamp(new Lamp(50));
        room3.addWindow(new Window(120, 120));
        building1.addRoom(room3);


        //print hele bygningen
        building1.printBuilding();


    }
}
