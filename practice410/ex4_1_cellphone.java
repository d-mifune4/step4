package practice410;

public class ex4_1_cellphone implements Iphone,Imailer,Icomputer {

    public void sendmail(){
        System.out.println("メールを送信");
    }
    public void recievemail(){
        System.out.println("メールを受信");
    }
    public void browseweb(){
        System.out.println("ウェブを閲覧する");
    }
    public void playgame(){
        System.out.println("ゲームをする");
    }
    public void callphone(){
        System.out.println("電話をかける");
    }
    public void recievephone(){
        System.out.println("電話を受ける");
    }
}
