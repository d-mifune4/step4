package practice410;

public class ex_p4_2 {

    public static void main(String[] args) {
        
        alarmclock ac = new alarmclock();
        funcalarm(ac);
        funclock(ac);
    }
    public static void funcalarm(Ialarm alarm){
        alarm.setalarm();
        alarm.alarm();
        alarm.stopalarm();
    }
    public static void funclock(Iclock clock){
        clock.adjusttime();
        clock.showtime();
    }
}
