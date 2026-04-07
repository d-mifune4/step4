package Java;

public class sample304 {
    
    public static void main(String[] args) {
        
        int dice = (int)(Math.random()*7)+1; // １から７までの乱数発生

        System.out.println("さいころの目:"+dice);

        if(1<= dice && dice <= 6){
            if(dice==2 || dice==4 || dice==6){
                System.out.println("丁(チョウ)です。");
            }else{
                System.out.println("半(ハン)です。");
            }
        }else{
            System.out.println("範囲外の数値です。");
            }
}
}


    

