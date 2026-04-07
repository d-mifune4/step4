package practice;

public class p4_8 {

    public static void main(String[] args) {
        
        while(true){
            int ran = (int)(Math.random()*10)+1;

            System.out.println(+ran);
            if(ran==10){
                System.out.println("終了します。");
                break;
            }
        }
        System.out.println();
    }
    
}
