public class Clock{
public static void main(String[] args){}
private int hour;
private int min;
private int sec;

public Clock (int hour, int min, int sec) {
this.hour = hour;
this.min = min;
this.sec = sec;
}

public void setHour(int hour) {
if (hour > 23) {
this.hour = 0;
} else {
this.hour = hour;
}
}
public int getHour() {
return hour;
}

public void setMin() {
if (min > 59) {
this.min = 0;
} else {
this.min = min;
}
}
public int getMin() {
return min;
}

public void setSec() {
if (sec > 59) {
this.sec = 0;
} else {
this.sec = sec;
}
}
public int getSec() {
return sec;
}

public void displayTime() {
System.out.printf("%02d: %02d: %02d: %n", hour, min, sec);
}

}