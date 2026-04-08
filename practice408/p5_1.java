package practice408;

public class p5_1 {

    public static void main(String[] args) {
        
        int data[] = new int[7];
        int ran;
        int i;
        
        for(i=0;i<data.length;i++){
            ran = (int)(Math.random()*10)+1;
            data[i]=ran;
            System.out.print("data["+i+"]:"+data[i]+" ");
        }
        System.out.println();
    }
    
}
