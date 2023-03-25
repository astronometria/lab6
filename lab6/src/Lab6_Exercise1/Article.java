package Lab6_Exercise1;

public class Article {
	
	private int reference;
	private String name;
	private String supplier;
	private double purchase_price;
	private double selling_price;
	
	public Article(int reference, String name, String supplier, double purchase_price, double selling_price) {
		super();
		this.reference = reference;
		this.name = name;
		this.supplier = supplier;
		this.purchase_price = purchase_price;
		this.selling_price = selling_price;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public double getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(double purchase_price) {
		this.purchase_price = purchase_price;
	}

	public double getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(double selling_price) {
		this.selling_price = selling_price;
	}

	@Override
	public String toString() {
		return "Reference : "+ reference + "\tnom : "+ name +"\tSupplier: "+ supplier +"\tPurchase price : "+ purchase_price +
						"\tSelling price: "+ selling_price;
	}
	
	public void display() {
		System.out.printf("Référence : %-10d name : %-s Supplier %-10s Purchase Price : %-10.2f Selling price : %-10.2f", reference , name , supplier, purchase_price, selling_price);
	}
	
	

}
