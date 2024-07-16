// Beverage.java
public interface Beverage {
    void prepare();
}

// Coffee.java
import org.springframework.stereotype.Component;

@Component("coffee")
public class Coffee implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing Coffee");
    }
}

// Tea.java
import org.springframework.stereotype.Component;

@Component("tea")
public class Tea implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing Tea");
    }
}
