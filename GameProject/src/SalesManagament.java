
public class SalesManagament {

		public void Sell(PlayerInformation player, String[] games, double[] price,double[] discount) {
			
			System.out.println(player.username + " Adlý Oyuncunun " + games[0]  + " Adlý oyunu indirim ile " + (price[0] - (price[0] * discount[0] / 100)) + " ye Satýn Aldý.");
		
			
		}

}
