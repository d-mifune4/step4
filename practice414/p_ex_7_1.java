package practice414;

public class p_ex_7_1 {
    
    public static void main(String[] args) {
        int a[]={0,1,2};

        try {
            for(int i=0;i<4;i++){
                System.out.println("a["+i+"]"+a[i]);
                
            }
        }catch (Exception e) {
               System.out.println("配列の範囲を超えています。"); 
            }


        }
    }
