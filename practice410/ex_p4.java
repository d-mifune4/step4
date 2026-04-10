package practice410;

public class ex_p4 {

    public static void main(String[] args) {
        
        fightair f = new fightair();
        passair p = new passair();

        System.out.println(f.getName());
        f.fly();
        f.fight();
        
        System.out.println();

        System.out.println(p.getName());
        p.fly();
        p.carry();

        System.out.println();


    }
    
}
