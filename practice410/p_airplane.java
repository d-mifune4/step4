package practice410;

public abstract class p_airplane {

    private String type;
    
    p_airplane(String type){
        this.type=type;
    }
    public String getName(){
        return type;
    }
    abstract void fly();
    
    
}
