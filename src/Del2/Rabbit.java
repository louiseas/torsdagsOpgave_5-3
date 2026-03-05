package Del2;

public class Rabbit extends Animal{

    public Rabbit(String name){
        super(name, 200);
    }

    @Override
    public int attack(){
        return 10;
    }
}
