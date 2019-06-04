import java.util.List;
import java.util.ArrayList;
public class CommandPattern{
    public interface Order {
        void execute();
    }

    public class Receiver {
   
        private String name = "ABC";
        private int quantity = 10;
      
        public void buy(){
            this.quantity++;
           System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
        }
        public void sell(){
            this.quantity--;
           System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
        }
    }

    public class BuyOrder implements Order {
        private Receiver abcStock;
      
        public BuyOrder(Receiver abcStock){
           this.abcStock = abcStock;
        }
      
        public void execute() {
           abcStock.buy();
        }
    }

    public class SellOrder implements Order {
        private Receiver abcStock;
      
        public SellOrder(Receiver abcStock){
           this.abcStock = abcStock;
        }
      
        public void execute() {
           abcStock.sell();
        }
    }

    public class Invoker {
        private List<Order> orderList = new ArrayList<Order>(); 
      
        public void takeOrder(Order order){
           orderList.add(order);      
        }
      
        public void placeOrders(){
           for (Order order : orderList) {
              order.execute();
           }
           orderList.clear();
        }
    }

    public void run(){
        Invoker invoker = new Invoker();
        Receiver object = new Receiver();
        BuyOrder buy = new BuyOrder(object);
        SellOrder sell = new SellOrder(object);

        invoker.takeOrder(buy);
        invoker.takeOrder(buy);
        invoker.takeOrder(buy);
        invoker.takeOrder(buy);
        invoker.takeOrder(buy);
        invoker.takeOrder(sell);
        invoker.takeOrder(sell);
        invoker.takeOrder(sell);
        invoker.takeOrder(sell);
        invoker.placeOrders();;


    }

    public static void main(String[] args) {
        new CommandPattern().run();
    }


}