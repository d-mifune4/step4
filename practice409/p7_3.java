package practice409;

public class p7_3 {

    public static void main(String[] args) {
        
        calculation c = new calculation();
        c.setNumber1(8);
        c.setNumber2(9);

        System.out.println();
        System.out.println(c.getNumber1()+"+"+c.getNumber2()+"="+c.add());
        System.out.println(c.getNumber1()+"-"+c.getNumber2()+"="+c.sub());
        System.out.println();
    }
    
}
