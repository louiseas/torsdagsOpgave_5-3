package Del2;

public class Wolf extends Animal{

    public Wolf(String name){
        super(name, 75);
    }

    @Override
    public int attack(){
        return 35;
    }
}
