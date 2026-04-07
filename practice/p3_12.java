package practice;

public class p3_12 {

        public static void main(String[] args) {
        int ran = (int)(Math.random()*21)-10;
        System.out.println("数値:"+ ran);

        if(ran<0){
            System.out.println("負の値です。");
        }else{
            System.out.println("正の値です。");
        }
            
        }

    
}
