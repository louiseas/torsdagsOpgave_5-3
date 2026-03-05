package Del1;

//Felter: watt (int), isOn (boolean)
//Konstruktør: tager watt som parameter, isOn starter som false
//Metoder: void turnOn(), void turnOff(), toString()



public class Lamp {
    private int watt;
    private boolean isOn;

    public Lamp (int watt){
        this.watt = watt;
        this.isOn = false;
    }

    public void turnOn() {
    isOn = true;
    }

    public void turnOf() {
    isOn = false;
    }


    public int getWatt() {
        return watt;
    }

    @Override
    public String toString (){
        return "Lamp: "+ watt + " isOn= "+ isOn;
    }

}
