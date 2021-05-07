
public class SalesInformation {
	

	
	public SalesInformation(String[] games,double[] discount, double[] price) {
		int i;
		for(i = 0; i<games.length ;i++) {
			
			
			double discountPrice = price[i] - (price[i] * discount[i] / 100);

			System.out.println("Satýþtaki Oyunlar : " + games[i] + " Fiyat : " + price[i] + " Ýndirimli Fiyat :" + discountPrice);
			
		}
	
	}
	

}
