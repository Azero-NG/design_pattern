
public class Facade {
    public class ModuleA {
        //示意方法
        public void testA(){
            System.out.println("调用ModuleA中的testA方法");
        }
    }

    public class ModuleB {
        //示意方法
        public void testB(){
            System.out.println("调用ModuleB中的testB方法");
        }
    }

    public class ModuleC {
        public void testC(){
            System.out.println("调用ModuleC中的testC方法");
        }
    }

    public class Facade_in {
        public void test(){
            ModuleA a = new ModuleA();
            a.testA();
            ModuleB b = new ModuleB();
            b.testB();
            ModuleC c = new ModuleC();
            c.testC();
        }
    }
    public void run(){
        new Facade_in().test();
    }

    public static void main(String[] args) {
        
        new Facade().run();
    }


}