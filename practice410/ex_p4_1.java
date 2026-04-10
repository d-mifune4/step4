package practice410;


public class ex_p4_1 {

    public static void main(String[] args) {
        

        ex4_1_cellphone cp = new ex4_1_cellphone();
        funcphone(cp);
        funcmailer(cp);
        funccomputer(cp);
    
    }
    public static void funcphone(Iphone phone){
        phone.callphone();
        phone.recievephone();
    }

    public static void funcmailer(Imailer mailer){
        mailer.sendmail();
        mailer.recievemail();
    }
    public static void funccomputer(Icomputer computer){
        computer.playgame();
        computer.browseweb();
    }
    
}
