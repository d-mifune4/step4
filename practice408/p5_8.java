package practice408;

public class p5_8 {

        public static void main(String[] args) {
        
        int data[] = new int[5];
        int ran,i;
        int n=0;
        int m=0;
        int t=0;

        for(i=0;i<data.length;i++){         //ランダムに整数を生成+表示
            ran = (int)(Math.random()*-21)+10;
            data[i]=ran;
            System.out.print(data[i]+" ");
        }
            System.out.println();
            i=0;
            while(i<data.length){   //0以上、0以下,0pの振り分け
                if(data[i]>0){
                    n++;
                }else if(data[i]<0){
                   m++; 
                }else{
                    t++;
                }
                i++;
            }

            System.err.println("0より大きい数:"+n+"個");
            System.err.println("0より小さい数:"+m+"個");
            System.err.println("0と同じ数:"+t+"個");

            System.out.println();
                
            }
    
}
