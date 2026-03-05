package Del2;

//Lav en klasse Animal med felterne:
//
//name (String)
//energy (int)
//Lav konstruktør, relevante getters/setters, og en metode boolean isActive() der returnerer true hvis energy er større end 0.
//
//Lav en metode int attack() der returnerer hvor meget energi dyret trækker fra sin modstander. Du bestemmer selv om den skal være abstrakt eller konkret — tænk over hvad der giver mest mening.
//
//Lav en toString() der fx printer:

public abstract class Animal {
    String name;
    int energy;

    public Animal(String name, int energy){
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    boolean isActive(){
        return energy>0;
    }

    public abstract int attack();

    @Override
    public String toString() {
        return name + " (energi: "+ energy + ")";
    }
}
