package practice410;

public class counter_2{

    private int count=0;
    private static int totalcount = 0;

    public void reset(){
        count = 0;
    }
    public void count(){
        totalcount += count;
        count++;
       
    }
    public int getcount(){
        return count;
    }

    static int gettotalcount(){
        return totalcount;
    }



}