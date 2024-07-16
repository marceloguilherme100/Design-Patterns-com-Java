// Main.java
public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = OrderManager.getInstance();

        Observer waiter = new Waiter();
        orderManager.addObserver(waiter);

        orderManager.newOrder("coffee");
        orderManager.newOrder("tea");
    }
}
