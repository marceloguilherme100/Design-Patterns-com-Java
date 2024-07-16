// OrderManager.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderManager {
    @Autowired
    private BeverageFactory beverageFactory;

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void newOrder(String type) {
        Beverage beverage = beverageFactory.createBeverage(type);
        beverage.prepare();
        eventPublisher.publishEvent(new BeverageEvent(this, beverage));
    }
}
