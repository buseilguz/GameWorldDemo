package Concrete;



import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{
	
	MernisManager mernisManager;

	public PlayerManager(MernisManager mernisManager) {
		
		this.mernisManager = mernisManager;
	}

	@Override
	public void addPlayer(Player player)  {
		boolean result;
		result= mernisManager.mernisManager(player);
		if (result==true) {
			System.out.println(player.getName()+"  isimli oyuncu sisteme dahil edildi");
		}else {
			System.out.println(player.getName()+" isimli oyuncu i�in Mernis do�rulamas� ba�ar�s�z olmu�tur.");
		}
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getName()+" isimli oyuncu bilgileri g�ncellenmi�tir.");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getName()+" isimli oyuncu sistemden silinmi�tir.");
		

	}
	public void getAll(Player[] players) {
		System.out.println("OYUNCULARIN L�STES�");
		for(Player player:players) {
			System.out.println(player.getName()+" "+player.getSurname());
		}
		
	}

}
