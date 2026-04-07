package practice;

public class p3_13 {

    public static void main(String[] args) {
        int ran = (int)(Math.random()*3)+1;

        switch (ran){
            case 1:
                System.out.println("グーです。");
                break;
            case 2:
                System.out.println("チョキです。");
                break;
            case 3:
                System.out.println("パーです。");    
            default:
                break;
        }
    }

    
}
