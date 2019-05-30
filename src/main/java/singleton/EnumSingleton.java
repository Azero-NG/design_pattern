
public class EnumSingleton{
    private EnumSingleton(){}
    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }
    private static enum Singleton{
        INSTANCE;
        private EnumSingleton singleton;
        //JVM会保证此方法绝对只调用一次
        private Singleton(){
	    System.out.println("Singleton 初始化");
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance(){
            return singleton;
        }
    }
    public static void main(String[] args) {
	System.out.println("main start");
        EnumSingleton obj1 = getInstance();
        EnumSingleton obj2 = getInstance();
        //输出结果：obj1==obj2?true
        System.out.println("obj1==obj2?" + (obj1==obj2));
	System.out.println(Singleton.INSTANCE.getClass().getName());
    }
}
//第一次调用 Singleton会导致构造函数执行,之后不会也就是jvm保证此方法绝对只调用一次

