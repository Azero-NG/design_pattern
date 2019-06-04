import java.util.ArrayList;
import java.util.List;
public class Observer_object{

    public abstract class Observer {
        protected Subject subject;
        public abstract void update(int state);
    }

    public class Subject {
        private List<Observer> observers
            = new ArrayList<Observer>();
        private int state;

        public void setState(int state) {
            this.state = state;
            notifyAllObservers();
        }

        public void attach(Observer observer){
            observers.add(observer);
        }

        public void notifyAllObservers(){
            for (Observer observer : observers) {
                observer.update(state);
            }
        }
    }

    public class BinaryObserver extends Observer{
        private String name;
        public BinaryObserver(String name){
            this.name = name;
        }
        @Override
        public void update(int state) {
            System.out.println( name+" was called because "
            + state);
        }
    }

    public void run(){
        BinaryObserver a = new BinaryObserver("a");
        BinaryObserver b = new BinaryObserver("b");
        BinaryObserver c = new BinaryObserver("c");

        Subject cause = new Subject();
        cause.attach(a);
        cause.attach(b);
        cause.attach(c);

        cause.setState(1154);
    }

    public static void main(String[] args) {
        new Observer_object().run();
    }




}