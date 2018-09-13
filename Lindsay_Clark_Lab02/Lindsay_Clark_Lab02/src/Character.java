public class Character implements Skills, Stats{
	
	private int attack;
	private int defense;
	private int specialAttack;
	private int health;
	private int strength;
	
	public Character(){
		attack = 5;
		defense = 4;
		specialAttack = 8;
		health = 100;
		strength = 2;
	}
	
	public int attack(){
		return attack*strength;
	}
	
	public int defend(){
		return (defense*-1)*strength;
	}
	
	public int specialAttack(){
		return specialAttack*strength;
	}
	
	public int getHealth(){
		return health;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int getDefense(){
		return defense;
	}
	
	public int getAttack(){
		return attack;
	}
	
	protected void setHealth(int health){
		this.health = health;
	}
	
	protected void setStrength(int strength){
		this.strength = strength;
	}
	
	protected void setDefense(int defense){
		this.defense = defense;
	}
	
	protected void setAttack(int attack){
		this.attack = attack;
	}

}
