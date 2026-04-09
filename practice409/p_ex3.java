package practice409;

public class p_ex3 {

    public static void main(String[] args) {
        int a=(int)(Math.random()*10)+1;
        int b=(int)(Math.random()*10)+1;

        System.out.println("たて:"+a);
        System.out.println("よこ:"+b);
        square(a,b);
        System.out.println();

    }
    static void square(int a,int b){
        for(int i=a;i>0;i--){
            for(int j=b;j>0;j--){
                System.out.print("■"+" ");
            }
            System.out.println();
        }
    }
}
