package practice;

public class p3_9 {
        
    public static void main(String[] args) {
        int ran = (int)(Math.random()*100+1);
        System.out.println("数値:"+ ran);

        if(ran < 50){
            System.out.println("50未満です。");
        }else{
            System.out.println("50以上です。");
        }
            
        }

    
}
