package practice408;

public class p5_12 {

    public static void main(String[] args) {
        
        int ran,i,j;
        int[][] data = new int[3][3];

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                ran=(int)(Math.random()*10)+1;
                data[i][j]=ran;
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(data[i][j]+" ");          
            }
            System.out.println();
        }

    }
    
}
