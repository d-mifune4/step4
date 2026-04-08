package practice408;

public class p5_10 {

    public static void main(String[] args) {
        
        int i,ran,m,n;
        int[] data = new int[7];

        for(i=0;i<data.length;i++){
            ran = (int)(Math.random()*10)+1;
            data[i]=ran;
            System.out.print(+data[i]+" ");        
        }
        System.out.println();

        for(m=0;m<data.length;m++){
            for(n=0;n<data[m];n++){

                System.out.print("*"+" ");            
            }
            System.out.println();
        }
    }
    
}
