package practice;

public class p4_16 {

    public static void main(String[] args) {
        int i,j;
        int t;

        for(i=1;i<=9;i++){
            for(j=1;j<=9;j++){
                t=i*j;
                System.out.print(i+"*"+j+"="+t+" ");
            if(j==9){
                System.out.println();
            }
            }
        }
        System.out.println();
    }
    
}
