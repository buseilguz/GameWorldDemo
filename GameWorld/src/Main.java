import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MernisManager;
import Concrete.PlayerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		Player player1=new Player();
		player1.setPlayerId(1);
		player1.setName("buse");
		player1.setSurname("ilgüz");
		player1.setIdentityNumber("20692813832");
		player1.setBirthDate(1992);
		Player player2=new Player();
		player2.setPlayerId(2);
		player2.setName("buse");
		player2.setSurname("ilgüz");
		player2.setIdentityNumber("20692813832");
		player2.setBirthDate(1992);
		
		Game game1=new Game();
		game1.setGameId(1);
		game1.setGameName("GTA");
		game1.setGamePrice(100);
		
		Game game2=new Game();
		game2.setGameId(2);
		game2.setGameName("AmberBR");
		game2.setGamePrice(200);
		
		Campaign springCampaign=new Campaign();
		springCampaign.setId(1);
		springCampaign.setName("Dev Bahar Ýndirimi");
		springCampaign.setRate(10);
		springCampaign.setDescription("Bahar aylarýna özel %10 indirim");
		
		Campaign welcomeCampaign=new Campaign();
		welcomeCampaign.setId(2);
		welcomeCampaign.setName("Hoþgeldin Kampanyasý");
		welcomeCampaign.setRate(15);
		welcomeCampaign.setDescription("Yeni gelene %15 indirimi");
		
		Sale sale1=new Sale(1);
		Sale sale2=new Sale(2);
		
		
		GameManager gameManager=new GameManager();
		System.out.println("*************************************************");

		gameManager.addGame(game1);
		System.out.println("*************************************************");

		gameManager.deleteGame(game2);
		System.out.println("*************************************************");

		gameManager.updateGame(game1);
		System.out.println("*************************************************");

		PlayerManager playerManager=new PlayerManager(new MernisManager());
		playerManager.addPlayer(player1);
		
		System.out.println("*************************************************");

		playerManager.delete(player2);
		System.out.println("*************************************************");

		playerManager.update(player1);
		System.out.println("*************************************************");

		Player[] players= {player1,player2};
		playerManager.getAll(players);
		System.out.println("*************************************************");

		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.addCampaign(welcomeCampaign);
		System.out.println("*************************************************");

		campaignManager.deleteCampaign(springCampaign);
		System.out.println("*************************************************");

		campaignManager.updateCampaign(welcomeCampaign);
		System.out.println("*************************************************");

		
		SalesManager salesManager=new SalesManager();
		salesManager.salesWithoutCampaign(player2, game2,sale1);
		System.out.println("*************************************************");

		salesManager.salesWithCampaign(player2, game1, springCampaign,sale2);
		
		
	}

}
