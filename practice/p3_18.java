package practice;

public class p3_18 {

    
    public static void main(String[] args) {
        
        int ran = (int)(Math.random()*46)-10;

        System.out.println("摂氏:"+ran+"度");

        if(ran>=30){
            System.out.println("真夏日です。");
        }
        else if(25<=ran && ran<30){
            System.out.println("夏日です。");
        }
        else if(ran<0){
            System.out.println("真冬日です。");

        }
    }

    
}
