package Del2;

public class Lion extends Animal{

    public Lion(String name){
        super(name, 100);
    }

    @Override
    public int attack(){
        return 50;
    }
}
