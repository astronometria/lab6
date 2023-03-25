package Lab6_Exercise1;

public class TestArticle {

	public static void main(String[] args) {
		Article phone = new ArticleElectromenager (1270 , "Phone" , "LG" , 1200 , 1500 , 230);
		Article radio = new ArticleElectromenager (1258 , "radio" , "Sony" , 250 , 320 , 450);
		
		Article [] articleArray = {phone , radio};
		
		System.out.println("Income detail (from the sales):");
		System.out.printf("Income from the sale of the 50 of the first articleArray = $%.2f", articleArray[0].getSelling_price()*50);
		
	}

}
