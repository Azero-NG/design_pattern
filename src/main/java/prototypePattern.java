public class prototypePattern{
    class Prototye implements Cloneable{
        public Prototye clone(){
            Prototye prototype = null;
            try{
                prototype = (Prototye)super.clone();

            }catch(CloneNotSupportedException e){
                e.printStackTrace();
            }
            return prototype;
        }


    }

    class ConcretePrototype extends Prototye{
        public void show() {
            System.out.println("原型模式");
        }
    }

    public void main(){
        ConcretePrototype cp = new ConcretePrototype();  
        for(int i=0; i< 10; i++){  
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();  
            clonecp.show();  
        }
    }

    public static void main(String[] args){
        prototypePattern a = new prototypePattern();
        a.main();
    }


}