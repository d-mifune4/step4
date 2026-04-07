package practice;

public class p4_2 {

        public static void main(String[] args) {
        
        int ran = (int)(Math.random()*10)+1;

        System.out.println("数:"+ran);

        while(ran>0){
            System.out.print("■"+" ");
            ran--;
        }
        System.out.println();
 
    
}

}

