package practice410;

public class ex_p3_2 {

    public static void main(String[] args) {
        computer[] cp = new computer[3];
        cp[0]= new pc();
        cp[1]= new tabletpc();
        cp[2]= new smartphone();

        for(computer c:cp){
                
            c.showType();
            c.input();
            c.output();
            c.communication();
            System.out.println("--------------------------------------------");
        }
    }
}

