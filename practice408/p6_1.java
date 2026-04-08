package practice408;

public class p6_1 {

    public static void main(String[] args) {
        
        Minmax m = new Minmax();
        m.n1=4;
        m.n2=2;

        int max = m.max(m.n1, m.n2);
        int min = m.min(m.n1, m.n2);

        System.out.println(m.n1+"と"+m.n2+"のうち最大の値は"+max);
        System.out.println(m.n1+"と"+m.n2+"のうち最小の値は"+min);
    }
    
}
