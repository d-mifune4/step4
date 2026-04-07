package practice;

public class p3_10 {

        
    public static void main(String[] args) {
        int ran = (int)(Math.random()*100+1);
        System.out.println("数値:"+ ran);

        if(ran <= 10 || 90<= ran){
            System.out.println("10以下か90以上の値です。");
        }else{
            System.out.println("10より大きく90未満です。");
        }
            
        }

    
}
