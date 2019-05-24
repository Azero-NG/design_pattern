package main.java;

public class abstract_factory {
    public abstract class mouse{

    }

    public class g502 extends mouse{
        public g502(){
            System.out.println("g502生产");
        }
    }

    public class g903 extends mouse{
        public g903(){
            System.out.println("g903生产");
        }
    }

    public abstract class keyboard{

    }

    public class red_key extends keyboard{
        public red_key(){
            System.out.println("红轴生产");
        }
    }

    public class black_key extends keyboard{
        public black_key(){
            System.out.println("黑轴生产");
        }
    }

    public interface factory{
        public keyboard create_keyboard();
        public mouse create_mouse();
    }

    public class factory_game implements factory{
        public keyboard create_keyboard()
        {
            return new black_key();
        }
        public mouse create_mouse()
        {
            return new g903();
        }
    }

    public class factory_work implements factory{
        public keyboard create_keyboard()
        {
            return new red_key();
        }

        public mouse create_mouse()
        {
            return new g502();
        }
    }

    public void test()
    {
        factory work = new factory_work();
        factory game = new factory_game();

        work.create_keyboard();
        work.create_mouse();
        game.create_keyboard();
        game.create_mouse();
    }

    public static void main(String[] args) {
        abstract_factory af = new abstract_factory();
        af.test();

    }
}
