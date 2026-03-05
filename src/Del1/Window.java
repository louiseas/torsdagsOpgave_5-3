package Del1;

//Felter: widthCm (int), heightCm (int)
//Konstruktør: tager bredde og højde
//Metoder: int getAreaCm2(), toString()

public class Window {
    private int widthCM;
    private int heightCM;

    public Window(int widthCM, int heightCM){
        this.widthCM = widthCM;
        this.heightCM = heightCM;
    }


    int getAreaCm2(){
        return heightCM*widthCM;
    }

    @Override
    public String toString(){
        return "The area is: " + getAreaCm2();
    }


}
