package practice408;

public class p5_13 {

    public static void main(String[] args) {
        
        int i,j,ran;
        int[][] data = new int[3][3];
        int Max=-1;
        int Min=10;

        for(i=0;i<data.length;i++){
            for(j=0;j<data[i].length;j++){
                ran=(int)(Math.random()*10);
                data[i][j]=ran;

                if(Max<ran){
                    Max=ran;
                }
                if(Min>ran){
                    Min=ran;
                }
            }
        }
        for(i=0;i<data.length;i++){
            for(j=0;j<data[i].length;j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("最大値:"+Max);
        System.out.println("最小値:"+Min);
    }
    
}
