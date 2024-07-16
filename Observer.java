// Observer.java
public interface Observer {
    void update(Beverage beverage);
}

// Waiter.java
public class Waiter implements Observer {
    @Override
    public void update(Beverage beverage) {
        System.out.println("Waiter notified: " + beverage.getClass().getSimpleName() + " is ready.");
    }
}
