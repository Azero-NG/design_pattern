package main.java;

public class simple_factory {

    //产品

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

    public class Factory {
        public product create_product(int type) {
            switch (type) {

                case 1:
                    return new keyboard();

                case 2:
                    return new mouse();

                default:
                    break;
            }
            return null;
        }
    }

    public void test()
    {
        Factory fac = new Factory();
        fac.create_product(1);
        fac.create_product(2);
    }

    public static void main(String[] args) {
        simple_factory factory_test = new simple_factory();
        factory_test.test();
    }


}
