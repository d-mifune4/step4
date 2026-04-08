package practice408;

public class p6_2 {

    public static void main(String[] args) {
        Calc c = new Calc();
        double a=4.0,b=2.0;

        System.out.println(a+"+"+b+"="+c.add(a,b));
        System.out.println(a+"-"+b+"="+c.sub(a,b));
        System.out.println(a+"*"+b+"="+c.mul(a,b));
        System.out.println(a+"/"+b+"="+c.div(a,b));

        System.out.println();
    }
    
}
