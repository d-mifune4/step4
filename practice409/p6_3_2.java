package practice409;

public class p6_3_2 {

    public static void main(String[] args) {
        Circle_2 c = new Circle_2();

        c.r=4.0;
        System.out.println("半径"+c.r+"の円の円周は"+c.circuference());
        System.out.println("半径"+c.r+"の円の面積は"+c.area2());
    }
    
}
