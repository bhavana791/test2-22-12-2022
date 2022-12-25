package Test2;

public class TestInvoice {

	public static void main(String[] args) {
	    InvoiceItem inv1 = new InvoiceItem(101, "blue ballons", 800, 0.05);
	      System.out.println(inv1);  // toString();

	      // Test Setters and Getters
	      inv1.setQty(999);
	      inv1.setUnitPrice(0.99);
	      System.out.println(inv1);  // toString();
	      System.out.println("\n\nid is: " + inv1.getId());
	      System.out.println("desc is: " + inv1.getDesc());
	      System.out.println("qty is: " + inv1.getQty());
	      System.out.println("unitPrice is: " + inv1.getUnitPrice());

	      // Test getTotal()
	      System.out.println("\n-----------------------------\n");
	      System.out.println("The total is: " + inv1.getTotal());
	   }
	
	}


