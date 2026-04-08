package practice408;

public class p6_3 {

    public static void main(String[] args) {
        
        Circle c = new Circle();

        c.r=4.0;
        System.out.println("半径"+c.r+"の円周は"+c.circumference());
        System.out.println("半径"+c.r+"の円の面積は"+c.area());

        System.out.println();
    }
    
}
