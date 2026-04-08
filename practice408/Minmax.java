package practice408;

public class Minmax {

    int n1,n2;

   int max(int n1,int n2){
        if(n1>n2){
            return n1;
        }
        return n2;
    }

   int min(int n1,int n2){
        if(n1<n2){
            return n1;
        }
        return n2;
   }


    
}
