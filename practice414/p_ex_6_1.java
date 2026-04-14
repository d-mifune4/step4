package practice414;

import java.io.*;
import java.util.*;

public class p_ex_6_1 {

    public static void main(String[] args)throws IOException{
        
        HashMap<String,String> list = new HashMap<String,String>();
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String English[]={"cat","dog","bird","tiger"};
        list.put(English[0], "猫");
        list.put(English[1], "犬");
        list.put(English[2], "鳥");
        list.put(English[3], "トラ");


        System.out.print("英語で動物の名前を入力してください：");
        String buf = br.readLine();

        if (buf.equals(English[0])){
            System.out.println("「"+list.get("cat")+"」"+"です。");
        }else if(buf.equals(English[1])){
            System.out.println("「"+list.get("dog")+"」"+"です。");
        }else if(buf.equals(English[2])){
            System.out.println("「"+list.get("bird")+"」"+"です。");
        }else if(buf.equals(English[3])){
            System.out.println("「"+list.get("tiger")+"」"+"です。");
        }else{
            System.out.println("対応するデータは登録されていません。");
        }

    }

}
    

