package chapterThree.tdd;

public class AirConditioner {
    private boolean state;
private int temperature;
    public void turnOn() {
         state = true;
    }
    public void turnOff() {
         this.state = state;
    }
    public boolean getState(){
        return state;
    }
    public void increaseTemperature(int degree) {
        if(temperature < degree){
 temperature += 30;
        }
    }
    public void decreaseTemperature(int degree) {
        if(temperature < degree){
    temperature = 16;
        }
    }
public int getTemperature(){
        return temperature;
}


}
