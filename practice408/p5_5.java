package practice408;

public class p5_5 {

            public static void main(String[] args) {
        
        int data[] = new int[10];
        int mul3[] = new int[10];
        int nonmul[]= new int[10];
        int ran,i;
        int n=0;
        int m=0;

        for(i=0;i<data.length;i++){         //ランダムに整数を生成
            ran = (int)(Math.random()*100)+1;
            data[i]=ran;
            System.out.print(data[i]+" ");
        }
         System.out.println();
            i=0;
        while(i<data.length){ //data配列内の数値をodd[],even[]に振り分け
            if(data[i]%3==0){
                mul3[n]=data[i];
                n++;
            }else{
                nonmul[m]=data[i];
                m++;
            }
            i++;
        }
            System.out.print("3の倍数:"); //50以上の表示
                for(i=0;i<mul3.length;i++){
                    if(mul3[i]==0){          //0が出ると終了
                            break;
                    }              
                System.out.print(mul3[i]+" ");
            }
                    
                System.out.println();//改行

            System.out.print("3の倍数以外の数:");//50未満の数表示
                for(i=0;i<nonmul.length;i++){
                if(nonmul[i]==0){          //0が出ると終了
                    break;
                }
                    
                System.out.print(nonmul[i]+" ");
                
                }

            
            }
          
    
    
}
