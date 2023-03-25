package Lab6_Exercise1;

public class ArticleElectromenager extends Article {
	
	private int stockElectro;

	public ArticleElectromenager(int reference, String name, String supplier, double purchase_price,
			double selling_price, int stockElectro) {
		super(reference, name, supplier, purchase_price, selling_price);
		this.stockElectro = stockElectro;
	}
	public double fillStockAE(int addStock) {
		this.stockElectro = stockElectro + addStock;
		double cost = this.getPurchase_price() * addStock;
		return cost;
	}
	public double sellAE (int sold) {
		this.stockElectro = stockElectro - sold;
		double amount = this.getSelling_price() * sold;
		return amount;
	}
	@Override
	public String toString() {
		return "(ArticleElectromenager): "+super.toString() + "\tNumber of item in stock: " +
				stockElectro ;
	}
	public void display() {
		super.display();
		System.out.printf("Number of items in stock : %-10d",stockElectro);
	}

}
