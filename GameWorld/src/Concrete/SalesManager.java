package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public class SalesManager {
	public void salesWithoutCampaign(Player player,Game game,Sale sale) {
		System.out.println(sale.getSaleId()+" numaralý satýþýn detaylarý:\n"+game.getGameName() +"isimli oyun" + player.getName() + player.getSurname()+ " tarafýndan " + game.getGamePrice() +"TL fiyata satýn alýnmýþtýr");
		
	}
	
	public void salesWithCampaign(Player player,Game game,Campaign campaign,Sale sale) {
		int PriceAfterCampaign=(int) (game.getGamePrice()-(game.getGamePrice()*campaign.getRate())/100);
		System.out.println(sale.getSaleId()+" numaralý satýþýn detaylarý:\n"+game.getGameName()+" isimli oyun "+ player.getName() + " "+player.getSurname()+ " tarafýndan " +campaign.getName() +" kampanyasýndan yararlanýlarak "+ PriceAfterCampaign +"TL fiyata satýn alýnmýþtýr");
	}

}
