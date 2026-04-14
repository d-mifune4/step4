package practice414;

import java.io.*;
import java.util.*;

public class p_ex_6_2 {
    public static void main(String[] args)throws IOException {


	    ArrayList<String>  array_b = new ArrayList<String>();

        HashMap<String,String> list = new HashMap<String,String>();

        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String kanji[]={"O","一","二","三","四","五","六","七","八","九"};
        list.put("0",kanji[0]);
        list.put("1",kanji[1]);
        list.put("2",kanji[2]);
        list.put("3",kanji[3]);
        list.put("4",kanji[4]);
        list.put("5",kanji[5]);
        list.put("6",kanji[6]);
        list.put("7",kanji[7]);
        list.put("8",kanji[8]);
        list.put("9",kanji[9]);
        
        System.out.print("整数の値を入力してください：");    
        String buf = br.readLine();

        String[] array_a=buf.split("");
            

            for(int i=0;i<array_a.length;i++){
                array_b.add(list.get(array_a[i]));
                if(list.get(array_a[i])==null){
                    System.out.println("整数の値を入力してください。");
                    break;
                }
            }
            int l=3;
            int t = array_b.size();

            while (t>l){
                t-=l;
                array_b.add(t,",");
                
            }
         

        for(String s: array_b){
            System.out.print(s+" ");
        }
            
            System.out.println();


       
        
    }
    
}
