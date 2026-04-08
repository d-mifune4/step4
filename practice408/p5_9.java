package practice408;

public class p5_9 {

            public static void main(String[] args) {
        
        int data[] = new int[10];
        int more50[] = new int[10];
        int less50[]= new int[10];
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
            if(data[i]>=50){
                more50[n]=data[i];
                n++;
            }else{
                less50[m]=data[i];
                m++;
            }
            i++;
        }
            System.out.print("50以上の数:"); //50以上の表示
                for(i=0;i<more50.length;i++){
                    if(more50[i]==0){          //0が出ると終了
                            break;
                    }              
                System.out.print(more50[i]+" ");
            }
                    
                System.out.println();//改行

            System.out.print("50未満の数:");//50未満の数表示
                for(i=0;i<less50.length;i++){
                if(less50[i]==0){          //0が出ると終了
                    break;
                }
                    
                System.out.print(less50[i]+" ");
                
                }

            
            }
          
    

    
}
