package Del1;

//Felter: name (String), rooms (ArrayList<Room>)
//Konstruktør: tager name
//Metoder:
//void addRoom(Room room)
//int getTotalLampCount() — total antal lamper i hele bygningen
//int getTotalWatt() — samlet wattal for hele bygningen
//void printBuilding() — printer alle rum med deres lamper og vinduer

import java.util.ArrayList;

public class Building {
    String name;
    ArrayList<Room>rooms;

    public Building(String name){
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    void addRoom(Room room){
    rooms.add(room);
    }

    int getTotalLampCount(){ // antal lamper i hele bygningen
    int total = 0;
    for(Room room : rooms){
        total+= room.getLampCount();
    }
    return total;
    }

    int getTotalWatt(){ // samlet wattTal for hele bygningen
    int total = 0;
    for (Room room : rooms){
        total += room.getTotalWatt();
    }
    return total;
    }

    void printBuilding(){ // printer alle rum med deres lamper og vinduer
        System.out.println("~~~~~~~~"+ name+ "~~~~~~~~");
        for(Room room : rooms){
            System.out.println(room.getName());
            room.printRoom();
        }
        System.out.println("Total lamp count: "+ getTotalLampCount()+ "Total watt count: "+ getTotalWatt());
    }

}

