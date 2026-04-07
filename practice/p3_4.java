package practice;


public class p3_4 {

    public static void main(String[] args) {
        int ran = (int)(Math.random()*100)+1;

        System.out.println("乱数の値:"+ran);

        if(ran <= 10 || ran >= 90){
        
        System.out.println("乱数"+ran+"は10以下か、90以上の値です。");

        }
    }
    
}
