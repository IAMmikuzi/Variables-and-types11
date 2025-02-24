// Source code is decompiled from a .class file using FernFlower decompiler.
public class SliceoHeaven {
   private String storeName;
   public String storeAddress;
   private String storeEmail;
   public long storePhone;
   private String storeMenu;
   private String pizzalngredients;
   private double pizzaPrice;
   private double sides;
   private String drinks;
   private String orderID;
   private double orderTotal;

   public SliceoHeaven() {
   }

   public void takeOrder(String var1, String var2, double var3, double var5, double var7, String var9) {
      this.pizzalngredients = var9;
      this.pizzaPrice = var7;
      this.sides = var5;
      this.drinks = var2;
      this.orderID = var1;
      this.orderTotal = var3;
      System.out.println("Order accepted!");
   }

   public void makePizza() {
      System.out.println("add ingredients");
      System.out.println("add drink");
   }

   public void printReceipt() {
      System.out.println("Order ID" + this.orderID);
      System.out.println("pizzaPrice" + this.pizzaPrice);
      System.out.println("Order Total" + this.orderTotal);
   }
}
