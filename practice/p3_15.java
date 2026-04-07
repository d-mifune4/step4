package practice;

public class p3_15 {

    public static void main(String[] args) {
        
        int ran = (int)(Math.random()*100)+1;
    
        System.out.println("点数:"+ran);

    if(ran>=80){
        System.out.println("優");
    }
     else if(70<=ran && ran <80){
        System.out.println("良");
    }
     else if(60<=ran && ran <70){
        System.out.println("可");
    }
     else{
        System.out.println("不可");
     }

    
    
    
    }

}
