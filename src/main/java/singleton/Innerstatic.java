public class Innerstatic{
    private static class SingletonHolder{
        public static Innerstatic instance = new Innerstatic();
    }

    private Innerstatic(){}
    public static Innerstatic get_instance(){
        return SingletonHolder.instance;
    }
}