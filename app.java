public class App {
    public static void main(String[] args) throws Exception {
        SliceoHeaven pizza = new SliceoHeaven();
        pizza.takeOrder("123456789","bear",59.9,5.0,54.9, "cheese pizza");
        pizza.makePizza();
        pizza.printReceipt();
        
    }
}
