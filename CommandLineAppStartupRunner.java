// CommandLineAppStartupRunner.java
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    private final OrderManager orderManager;

    public CommandLineAppStartupRunner(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    @Override
    public void run(String...args) throws Exception {
        orderManager.newOrder("coffee");
        orderManager.newOrder("tea");
    }
}
