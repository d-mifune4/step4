package practice410;

public class alarmclock implements Iclock,Ialarm{

    public void alarm(){
        System.out.println("アラームを鳴らす");
    }
    public void setalarm(){
        System.out.println("アラームをセットする");
    }
    public void stopalarm(){
        System.out.println("アラームを止める");
    }
    public void showtime(){
        System.out.println("時刻を知る");
    }
    public void adjusttime(){
        System.out.println("時刻を修正する");
    }   
}
