package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName() +" isimli oyun sisteme dahil edildi");
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameName() +" isimli oyun güncellendi");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() +" isimli oyun sistemden silindi");
		
	}

}
