package practice;

public class p3_11 {

        public static void main(String[] args) {
        int ran = (int)(Math.random()*100+1);
        System.out.println("数値:"+ ran);

        if(20 <= ran && ran <80){
            System.out.println("20以上80未満です。");
        }else{
            System.out.println("20未満か,80以上です。");
        }
            
        }

    
}
