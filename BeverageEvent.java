// BeverageEvent.java
import org.springframework.context.ApplicationEvent;

public class BeverageEvent extends ApplicationEvent {
    private Beverage beverage;

    public BeverageEvent(Object source, Beverage beverage) {
        super(source);
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}

// Waiter.java
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Waiter {
    @EventListener
    public void handleBeverageEvent(BeverageEvent event) {
        Beverage beverage = event.getBeverage();
        System.out.println("Waiter notified: " + beverage.getClass().getSimpleName() + " is ready.");
    }
}
