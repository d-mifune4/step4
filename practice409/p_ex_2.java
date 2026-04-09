package practice409;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_ex_2 {

    public static void main(String[] args) {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a =(int)(Math.random()*10)+1;
        int b =(int)(Math.random()*10)+1;

        System.out.println("cの値を入力してください。");

        int c=0;
        try{
            c = Integer.parseInt(br.readLine());
            br.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        
        int result = mul(a,b,c);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println(a+"*"+b+"*"+c+"="+result);
    }
    static int mul(int a,int b,int c){
        return a*b*c;
    }



    }

    
