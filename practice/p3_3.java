package practice;

public class p3_3 {

    public static void main(String[] args) {
        
        int ran = (int)(Math.random()*100)+1;

        System.out.println("乱数の値:"+ran);

        if(ran < 50){
            System.out.println("乱数"+ran+"は50未満です");
        }
    }    
}
