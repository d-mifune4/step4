package practice409;

public class p6_1_2 {

    public static void main(String[] args) {
        Minmax2 m = new Minmax2();
        int a=4,b=2,c=5;
        System.out.println(a+"と"+b+"と"+c+"のうち、最大のものは"+m.max(a, b, c));
        System.out.println(a+"と"+b+"と"+c+"のうち、最小のものは"+m.min(a, b, c));
    }
}

