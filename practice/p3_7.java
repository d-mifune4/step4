package practice;

public class p3_7 {

    public static void main(String[] args) {
        int ran = (int)(Math.random()*10+1);
        System.out.println("数値:"+ ran);

        if(ran>=5){
            System.out.println("5以上です。");
        }else{
            System.out.println("5未満です。");
        }
            
        }
    }

