package practice;

public class p3_1 {

    public static void main(String[] args) {
        
        int dice = (int)(Math.random()*10)+1;

            System.err.println(+dice);

        if(dice >= 5){
            System.out.println("5以上です。");
        }
    }
    
}
