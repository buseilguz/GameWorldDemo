package Entities;



public class Player {
	private int playerId;
	private String name;
	private String surname;
	private String identityNumber;
	private int birthDate;
	public Player()
	{}
	public Player(int playerId, String name, String surname, String identityNumber, int birthDate) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.surname = surname;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public int getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	
	
	

}
