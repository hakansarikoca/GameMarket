
public class Main {

	public static void main(String[] args) {
				
		PlayerInformation playerInformation = new PlayerInformation("Hakan", "Sarýkoca", "hakan162", "hakan123456789");
		
		CustomerInformation customerInformation = new CustomerInformation("Ahmet","Rasim", 1980 , "12345678900");
		
		String[] games = {"Counter Strike Global Offensive","League Of Legends","Minecraft","Valorant","Warcraft"};
		
		double[] discount = {25,30,10,40,50};
		
		double[] price = {100, 20, 50,70,50};
		PlayerManager playerManager = new PlayerManager();
		playerManager.Register(playerInformation);
		playerManager.Delete(playerInformation);
		
		Verification verification = new Verification("Ahmet","Rasim", 1980 , "12345678900");
		verification.Verifications();
		
		SalesInformation salesInformation = new SalesInformation(games,discount, price);

		SalesManagament salesManagament = new SalesManagament();
		salesManagament.Sell(playerInformation, games, price, discount);
	}

}
