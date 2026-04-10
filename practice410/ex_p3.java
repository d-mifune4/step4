package practice410;

public class ex_p3 {

    public static void main(String[] args) {
        
        newcalc n = new newcalc();
        n.setNumber1(10);
        n.setNumber2(2);
        System.out.println(n.getNumber1()+"+"+n.getNumber2()+"="+n.add());
        System.out.println(n.getNumber1()+"-"+n.getNumber2()+"="+n.sub());
        System.out.println(n.getNumber1()+"*"+n.getNumber2()+"="+n.mul());
        System.out.println(n.getNumber1()+"/"+n.getNumber2()+"="+n.div());
        System.out.println();
    }
    
}
