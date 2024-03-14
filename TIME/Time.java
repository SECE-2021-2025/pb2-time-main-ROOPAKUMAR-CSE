package PROJECT.TIME;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if(hour > 0 && hour <= 24){
            this.hour = hour;
        }
        else{
            System.out.println("HOUR CANT BE ABOVE 24");
        }
        
        if(minute <= 59){
            this.minute = minute;
        }
        
        if(second <= 59){
            this.second = second;
        }  
        
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        String time="";
        if(this.hour < 10) {
            time += "0"+this.hour+":";
        }
        else if(this.hour <= 24){ 
            time += this.hour+":";
        }

        if(this.minute < 10) {
            time += "0"+this.minute+":";
        } 
        else if(this.minute < 60){
            time += this.minute+":";
        }

        if(this.second < 10) {
            time += "0"+this.second;
        } 
        else{
            time += this.second;
        }
        return time;
    }
}
