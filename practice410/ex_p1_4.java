package practice410;

public class ex_p1_4 {

    public static void  main(String[] args){
        counter_2 c1,c2;
        c1=new counter_2();
        c2=new counter_2();
        c1.count();
        c2.count();
        c2.count();
        c2.reset();
        c1.count();
        c1.count();
        c2.count();
        System.out.println("c1のカウント数："+c1.getcount());
        System.out.println("c2のカウント数："+c2.getcount());
        System.out.println("トータルのカウント数："+counter_2.gettotalcount());



    }
    
}
