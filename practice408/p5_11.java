package practice408;

public class p5_11{

    public static void main(String[] args) {
        
        int i,ran;
        int[] data = new int[5];


        for(i=0;i<data.length;i++){
            ran=(int)(Math.random()*100)+1;
            data[i]=ran;
            System.out.print(+data[i]+" ");
        }
        System.out.println();

        System.out.print("0以上60未満:");
        for(i=0;i<data.length;i++){
            if(0<=data[i] && data[i]<60){
                System.out.print(+data[i]+" ");
                
            }
        }System.out.println();

        System.out.print("60以上80未満:");
        for(i=0;i<data.length;i++){
            if(60<=data[i] && data[i]<80){
                System.out.print(+data[i]+" ");
                
            }
        }System.out.println();
        
        System.out.print("80以上:");
        for(i=0;i<data.length;i++){
            if(80<=data[i]){
                System.out.print(+data[i]+" ");
                
            }
        }System.out.println();

        


    }
}