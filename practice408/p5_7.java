package practice408;

public class p5_7 {

    public static void main(String[] args) {
        
        int data[] = new int[5];
        int moreavg[] = new int[10];
        int lessavg[]= new int[10];
        int ran,i;
        int n=0;
        int m=0;
        double avg=0.0;

        for(i=0;i<data.length;i++){         //ランダムに整数を生成+表示
            ran = (int)(Math.random()*10)+1;
            data[i]=ran;
            System.out.print(data[i]+" ");
        }
        for(i=0;i<data.length;i++){ //合計値算出
            avg += data[i]; 
        }
            System.out.println();
            System.out.println("合計値:"+avg);

            avg=avg/10;             //平均値算出
            System.out.println("平均値:"+avg);

            i=0;
            while(i<data.length){   //平均値以上、平均値以下の振り分け
                if(data[i]>avg){
                    moreavg[n]=data[i];
                n++;
            }else{
                lessavg[m]=data[i];
                m++;
            }
            i++;
        }

            System.out.print("平均値より大きい数:"); //平均値以上の表示
                for(i=0;i<moreavg.length;i++){
                    if(moreavg[i]==0){          //0が出ると終了
                            break;
                    }              
                System.out.print(moreavg[i]+" ");
            }
                    
                System.out.println();//改行

            System.out.print("平均値より小さい数:");//平均値未満の数表示
                for(i=0;i<lessavg.length;i++){
                if(lessavg[i]==0){          //0が出ると終了
                    break;
                }
                    
                System.out.print(lessavg[i]+" ");
                
                }

                
            }
         }

    

