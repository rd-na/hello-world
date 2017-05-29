package reNoun;

public class Person{
	
	private int iMobility = 1;
	private int iHealth = 1;
	private char cGender = 'u';
	private java.util.Date dateCreated;
	
	public String sBirthday = "March 26, 2017";
	public String sName = "Person";
	public boolean bAlive = true;
	
	public Person(){
		
		dateCreated = new java.util.Date();
		sBirthday = dateCreated.toString();
	}
	
	public java.util.Date getDateCreated(){
	
		return dateCreated;
		
	}

	public int getMobility(){
		
		return iMobility;
		
	}
	
	public int getHealth(){
		
		return iHealth;
		
	}
	
	public char getGender(){
		
		return cGender;
		
	}
	
	public void setMobility(int mobility){
		
		iMobility = mobility;
		
	}

	
	public void setHealth(int health){
		
		iHealth = health;
		
		this.bAlive = iHealth <= 0 ? false : true;
		
	}
	
	public void setGender(char gender){
		
		cGender = gender;
		
	}
	
}
