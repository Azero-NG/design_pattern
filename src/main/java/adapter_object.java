public class adapter_object{
    class adaptee_typec {
        public void typec(){
            System.out.println("typec接口被插入");

        }
    }

    interface Target_usb{
        public void usb();
    }

    class usb2typecTarget implements Target_usb{
        private adaptee_typec adaptee;
        public usb2typecTarget(adaptee_typec adaptee){
            this.adaptee = adaptee;
        }

        public void usb(){
            System.out.println("usb 转typec被插入");
            this.adaptee.typec();
            
        }
    }

    public void  run(){
        Target_usb usb2typec = new usb2typecTarget(new adaptee_typec());
        usb2typec.usb();
    }
    public static void main(String [] args)
    {
        new adapter_object().run();
    }


}