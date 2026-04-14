package practice414;

import java.io.*;
import java.util.*;

public class p_ex_6_4 {

    public static void main(String[] args)throws IOException{

        HashSet<String> list = new HashSet<String>();
    
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        System.out.print("英単語を入力：");
        String buf = br.readLine();

       String[] array_a=buf.split("");
       
       for(int i=0;i<array_a.length;i++){
            list.add(array_a[i]);

       }
        for(String s:list){
            System.out.print(s+" ");
        }
    
    
    
    
    
    
    
    
    }



    
}
