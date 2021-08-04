package liczymyCzas;

public class Display {
    private int hours;
    private int minutes;
    private int seconds;

    public Display (int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }

    public void plusSeconds (int addSeconds){
        seconds += addSeconds;
        if (seconds < 60)
            return;
        int addMinutes = seconds/60;
        seconds = seconds % 60;
        minutes += addMinutes;
        if(minutes < 60)
            return;
        int addHours = minutes/60;
        minutes = minutes % 60;
        hours += addHours;
        hours = hours % 24;
    }
    public void plusMinutes(int addMinutes) {
        minutes += addMinutes;
        if(minutes < 60)
            return;
        int addHours = minutes/60;
        minutes = minutes % 60;
        hours += addHours;
        hours = hours % 24;
    }
    public void plusHours(int addHours) {
        hours += addHours;
        hours = hours % 24;
    }
    public void minusSeconds(int minusSeconds) {
        seconds -= minusSeconds;
        if (seconds >=0)
            return;
        int minusMinutes = -seconds / 60;
        minutes -= minusMinutes + 1;
        seconds = seconds % 60 + 60;
        if (minutes >=0)
            return;
        minutes = minutes % 60 + 60;
        int minusHours = minutes/60;
        hours -= minusHours + 1;
        hours = (hours + 24000) % 24;
    }
    @Override
    public String toString(){
        String time = "";
        if (hours > 9)
            time += hours;
        else
            time += "0" + hours;
        if (minutes > 9)
            time += ":" + minutes;
        else
            time += ":0" + minutes;
        if (seconds > 9)
            time += ":" + seconds;
        else
            time += ":0" + seconds;
        return time;
    }
}
