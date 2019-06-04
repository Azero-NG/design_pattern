public class Decorator{
    public interface Memory {
    void output();
    }
    public class DDR3 implements Memory {
    public void output() {
        System.out.println("DDR3 Memory");
    }
    }
    public class DDR4 implements Memory {
    public void output() {
        System.out.println("DDR4 Memory");
    }
    }
    public abstract class MemoryDecorator implements Memory {
    protected Memory mem;
    
    public MemoryDecorator(Memory mem){
        this.mem = mem;
    }
    
    public void output(){
        mem.output();
    }  
    }

    public class KinstomDecorator extends MemoryDecorator{

        public KinstomDecorator(Memory mem){
            super(mem);
        }
        public void output(){
            System.out.print("Kinstom's ");
            this.mem.output();
        }
    }


    public void run()
    {
        Memory ddr3 = new DDR3();
        KinstomDecorator kinsddr3 = new KinstomDecorator(new DDR3());
        System.out.println("DDR3 output:");
        ddr3.output();
        System.out.println("kinstom's DDR3 output:");
        kinsddr3.output();
        System.out.println("kinstom's DDR4 output:");
        new KinstomDecorator(new DDR4()).output();


    }

     public static void main(String[] args){

         new Decorator().run();
     }



}