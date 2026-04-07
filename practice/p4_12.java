package practice;

public class p4_12 {

            public static void main(String[] args) {
        int i,ran;
        int Min = 100;

        for(i=0;i<5;i++){
            ran=(int)(Math.random()*100)+1;
            System.out.println(+ran);

            if(Min>ran){
                Min=ran;
            }
        }
        System.out.println("最小値:"+Min);
        System.err.println();
    }


    
}
