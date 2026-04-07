package practice;

public class p4_13 {

    public static void main(String[] args) {
        
        int i,ran;

        ran=(int)(Math.random()*10)+1;

        if(ran>=5){
            System.out.println("数値:"+ran+" ");
            for(i=ran;i>0;i--){
                System.out.print("■"+" ");
            }
        }else{
            System.out.print("数値:"+ran);
        }
        System.out.println();
    }
    
}
