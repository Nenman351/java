package chapter3;

public class Clock {
    private static int hour;
    private static int minute;
    private static int second;



    public Clock(int hour, int minute, int second){
        if(hour >= 23){
            hour = 00;
        }
        this.hour = hour;
        if(minute >= 59){
            minute = 00;
        }
        this.minute = minute;
        if(second >= 59){
            second = 00;
        }
        this.second = second;

    }

    public void setHour(int hour){
        if(hour >= 23){
            hour = 00;
        }
        this.hour = hour;
    }

    public static int getHour(){
        return hour;
    }

    public void setMinute(int minute){
        if(minute >= 59){
            minute = 00;
        }
        this.minute = minute;
    }

    public static int getMinute(){
        return minute;
    }

    public void setSecond(int second){
        if(second >= 59){
            second = 00;
        }
        this.second = second;
    }

    public static int getSecond(){
        return second;
    }

    public int getTime(){
        int time = Integer.parseInt(((hour + ":" + minute + ":" + second)));
        return time;
    }

}

