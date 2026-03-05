package Del2;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args){
        ArrayList<Animal>animals = new ArrayList<>();
        animals.add(new Lion("Simba"));
        animals.add(new Lion("Nala"));
        animals.add(new Wolf("Wolfie"));
        animals.add(new Rabbit("HareHop"));


        System.out.println("Dyrene der kan konkurrere: ");
        System.out.println();
        for(Animal animal : animals){
            System.out.println(animal);
        }
        System.out.println();
        System.out.println("~~ kamp 1 ~~");
        System.out.println();

        Contest contest1 = new Contest(animals.get(1), animals.get(2));
        while(contest1.getWinner() == null){
            contest1.playRound();
        }
        System.out.println();
        System.out.println("Vinderen er: "+ contest1.getWinner());

    }
}
