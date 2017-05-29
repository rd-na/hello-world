package reNoun;

public class Place<T, V>{
	
	private java.util.Date dateCreated;
	
	public String sBirthday = "March 26, 2017";
	public String sName = "Place";
	public V[] dimA;
	public V[] dimB;
	public V[] dimC;
	public V[] dimD;
	public T[] posX;
	public T[] posY;
	public T[] posZ;
	
	public Place(){
		
		dateCreated = new java.util.Date();
		sBirthday = dateCreated.toString();
	}
	
	public java.util.Date getDateCreated(){
	
		return dateCreated;
		
	}

}


