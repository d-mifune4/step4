package practice;

public class p3_16 {

    public static void main(String[] args) {
        
        int ran = (int)(Math.random()*100)+1;

        System.out.println("数値:"+ran);

        if(ran%2==0 && ran%3==0){
            System.out.println("2と3の倍数です。");
        }
        else if(ran%3 == 0){
            System.out.println("3の倍数です。");
        }
        else if(ran%2==0 ){
            System.out.println("2の倍数です。");

        }
    }
    
}
