package main.java;

public class factory_pattern {
    abstract class product {
        public product(){

        }
    }

    public class keyboard extends product {
        public keyboard() {
            System.out.println("我是键盘");
        }
    }
    public class mouse extends product{
        public mouse(){
            System.out.println("我是鼠标");
        }
    }
    //工厂
    interface Factory{
        product create_product();
    }

    public class keyboard_factory implements Factory{
        public product create_product()
        {
            return new keyboard();
        }
    }

    public class mouse_factory implements Factory{
        public product create_product()
        {
            return new mouse();
        }
    }

    public void test()
    {
        keyboard_factory kf = new keyboard_factory();
        kf.create_product();
        mouse_factory mf = new mouse_factory();
        mf.create_product();
    }




    public static void main(String[] args) {
        factory_pattern fp = new factory_pattern();
        fp.test();

    }
}
