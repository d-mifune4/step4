package practice;

public class p4_9 {

        public static void main(String[] args) {
        
        while(true){
            int ran = (int)(Math.random()*100)+1;

            System.out.println(+ran);
            if(ran%10 == 0){
                System.out.println("終了します。");
                break;
            }
        }
        System.out.println();
    }

    
}
