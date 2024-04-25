package 객체배열;

public class Product {
	
	private String name;
	private int unitprice;
	private int amount;
	
	
	   public Product(String name, int unitPrice, int amount) {
	      this.name = name;
	      this.unitprice = unitPrice;
	      this.amount = amount;
	   }

	   public String getName() {
	      return name;
	   }

	   public int getUnitPrice() {
	      return unitprice;
	   }

	   public int getAmount() {
	      return amount;
	   }

}
