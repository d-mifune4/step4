package practice;

public class p4_1 {

    public static void main(String[] args) {
        
        int ran = (int)(Math.random()*10)+1;

        System.out.println("数:"+ran);

        for(int i=ran;ran>0;ran--){
            System.out.print("■"+" ");
        }
        System.out.println();
    }
    
}
