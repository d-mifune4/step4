package practice410;

public abstract class computer {

        private String type;

        public computer(String type){
            this.type = type;
        }
        public abstract void input();

        public abstract void output();

        public void communication(){
            System.out.println("インターネットで通信");
        }
        public void showType(){
            System.out.println("コンピューターの種類"+type);
        }
    }
    
        
    
    

