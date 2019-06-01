public class adapter{
    class adaptee_typec {
        public void typec(){
            System.out.println("typec接口被插入");

        }
    }

    interface Target_usb{
        public void usb();
    }

    class usb2typecTarget extends adaptee_typec implements Target_usb2{
        public void usb(){
            System.out.println("usb 转typec被插入");
            super.typec();
        }
    }

    public void  run(){
        Target_usb usb2typec = new usb2typecTarget();
        usb2typec.usb();
    }
    public static void main(String [] args)
    {
        new adapter().run();
    }


}