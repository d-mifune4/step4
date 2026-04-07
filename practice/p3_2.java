package practice;

public class p3_2 {

    public static void main(String[] args) {
        
        int dice= (int)(Math.random()*10)+1;

        System.out.println("乱数の値:"+dice);

        if(dice != 1){

            System.out.println("1ではありません。");
        }
    }
    
}
