package practice;

public class p4_3 {

        public static void main(String[] args) {
        
        int ran = (int)(Math.random()*10)+1;

        System.out.println("数:"+ran);

        do{
            System.out.print("■"+" ");
            ran--;
        }while(ran>0);
        
        System.out.println();

    }

}

