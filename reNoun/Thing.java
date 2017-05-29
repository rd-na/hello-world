package reNoun;

public class Thing{
	
	private java.util.Date dateCreated;
	
	public String sBirthday = "March 26, 2017";
	public String sName = "Thing";
	public boolean bAlive = false;
	public char cRep = 'T';
	
	public Thing(){
		
		dateCreated = new java.util.Date();
		sBirthday = dateCreated.toString();
	}
	
	public java.util.Date getDateCreated(){
	
		return dateCreated;
		
	}

}
