package practice;

public class p3_17 {

    
    public static void main(String[] args) {
        
        int ran = (int)(Math.random()*100)+1;

        System.out.println("数値:"+ran);

        if(ran%2==0 && ran<=50){
            System.out.println("50以下の偶数です。");
        }
        else if(ran%2 == 0){
            System.out.println("偶数です。");
        }
        else if(ran<=50 ){
            System.out.println("50以下です。");

        }
    }

    
}
