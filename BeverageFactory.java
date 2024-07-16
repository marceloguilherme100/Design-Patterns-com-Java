// BeverageFactory.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeverageFactory {
    @Autowired
    private ApplicationContext context;

    public Beverage createBeverage(String type) {
        return (Beverage) context.getBean(type);
    }
}
