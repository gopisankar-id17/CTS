import java.util.*;

interface Observer {
    void update(double price);
}

class MobileApp implements Observer {
    public void update(double price) {
        System.out.println("Mobile Price: " + price);
    }
}

class StockMarket {
    private List<Observer> observers = new ArrayList<>();

    void register(Observer o) {
        observers.add(o);
    }

    void notifyObservers(double price) {
        for(Observer o : observers)
            o.update(price);
    }
}

public class ObserverTest {
    public static void main(String[] args) {
        StockMarket sm = new StockMarket();

        sm.register(new MobileApp());

        sm.notifyObservers(1000);
    }
}