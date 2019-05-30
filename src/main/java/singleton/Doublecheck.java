public class Doublecheck{
    private static volatile Doublecheck instance = null;
    
    private Doublecheck(){}
    public Doublecheck get_instance()
    {
        if(instance==null)
        {
            synchronized (Doublecheck.class) {
                if (instance == null)
                {
                    instance = new Doublecheck();
                }
            }

        }

        return instance
    }
}