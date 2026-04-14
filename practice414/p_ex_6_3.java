package practice414;

import java.util.HashSet;

public class p_ex_6_3 {

    public static void main(String[] args) {

        HashSet<Integer> list = new HashSet<Integer>();

        for(int i=0;i<10;i++){
            int ran =(int)(Math.random()*10)+1;
            list.add(ran);
            System.out.print(ran+" ");
        }
        System.out.println();
        
        for(int s:list){
            System.out.print(s+" ");
        }
        System.out.println();
        
    }
    
}
