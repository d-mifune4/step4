package practice408;

public class p5_3 {

    public static void main(String[] args) {
        
        int data[] = new int[10];
        int odd[] = new int[10];
        int even[]= new int[10];
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
            if(data[i]%2==0){
                even[n]=data[i];
                n++;
            }else{
                odd[m]=data[i];
                m++;
            }
            i++;
        }
            System.out.print("奇数:"); //奇数の表示
                for(i=0;i<odd.length;i++){
                    if(odd[i]==0){          //0が出ると終了
                            break;
                    }              
                System.out.print(odd[i]+" ");
            }
                    
                System.out.println();//改行

            System.out.print("偶数:"); //偶数の表示
                for(i=0;i<odd.length;i++){
                if(even[i]==0){          //0が出ると終了
                    break;
                }
                    
                System.out.print(even[i]+" ");
                
                }

            
            }
                
            }
        


            
        
