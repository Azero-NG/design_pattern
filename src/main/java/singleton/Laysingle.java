public class Laysingle{
    private static Laysingle instance = null;

    private Laysingle(){}

    public static Laysingle get_instance(){
        if(instance == null){
            instance = new Laysingle;
        }
        return instance;
    }
}