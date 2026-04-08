package practice408;

public class p5_6 {

               public static void main(String[] args) {
        
        int data[] = new int[10];
        int ran,i;
        int Max=0;
        int Min=10;
        double avg=0.0;

        for(i=0;i<data.length;i++){         //ランダムに整数を生成
            ran = (int)(Math.random()*10)+1;
            data[i]=ran;
            System.out.print(data[i]+" ");
        }
         System.out.println();

         for(i=0;i<data.length;i++){//ランダム整数の中の最大値
            if(Max<data[i]){
                Max=data[i];
            }
        }
        for(i=0;i<data.length;i++){  
            if(Min>data[i]){
                Min=data[i];
                
            }
        }  
        for(i=0;i<data.length;i++){
            avg += data[i]; 
        }
            
            
            avg= avg/10;

            System.out.print("最大値");
            System.out.println(+Max);

            System.out.print("最小値");
            System.out.println(+Min);

            System.err.print("平均値");
            System.err.println(+avg);

            System.out.println();
         }
    
}

