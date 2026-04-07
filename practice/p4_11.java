package practice;

public class p4_11 {

        public static void main(String[] args) {
        int i,ran;
        int Max = 0;

        for(i=0;i<5;i++){
            ran=(int)(Math.random()*100)+1;
            System.out.println(+ran);

            if(ran>Max){
                Max=ran;
            }
        }
        System.out.println("最大値:"+Max);
        System.err.println();
    }

    
}
