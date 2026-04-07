package practice;

public class p4_14 {

        public static void main(String[] args) {
        
        int i,ran;

        ran=(int)(Math.random()*10)+1;

        if(ran%2==0){
            System.out.println("数値:"+ran+" ");
            for(i=ran;i>0;i--){
                System.out.print("★"+" ");
            }
        }else{
            System.out.println("数値:"+ran);
            for(i=ran;i>0;i--){
                System.out.print("☆"+" ");
        }
        System.out.println();
    }
}
}


    

