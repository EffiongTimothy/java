package tdd;

public class Clock {
    private int hour;
    private int minute;
    private int seconds;

    public Clock(int hour,int minute,int seconds){
        this.hour =hour;
        this.minute =minute;
        this.seconds =seconds;}
public int getHour(){
    return hour;
}
public int getMinute(){
    return minute;
}
public int getSeconds(){
    return seconds;
}

    public void setHour(int hour) {
        if(hour < 0 & hour >= 23){this.hour = 0;}
    else {
        this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute < 0 & minute >= 59){this.minute = 0;}
        else {this.minute = minute;}
    }

    public void setSeconds(int seconds) {
if (seconds < 0 & seconds >= 59){this.seconds = 0;}
        else{this.seconds = seconds;}
    }

    public int displayTime(int hour, int minute, int seconds) {

        return hour;
    }
}
