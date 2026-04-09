package practice409;

public class p7_2 {

    public static void main(String[] args) {
        
        TwoStrings s= new TwoStrings();
        s.setString1("Hello");
        s.setString2("World!!");
        System.out.println("1つ目の文字列は"+s.getString1());
        System.out.println("2つ目の文字列は"+s.getString2());
        System.out.println("2つの文字列を合計したものは"+s.getConnectedString());
    }
    
}
