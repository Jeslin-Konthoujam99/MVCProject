package model;

public class StudentDatabase
{
	   private String ID;
	   private String name;
	   private String sex;
   public StudentDatabase(String iD, String name, String sex) {
		//super();
		this.ID = iD;
		this.name = name;
		this.sex = sex;
	}
public String getID() {
	return ID;
	
}
public void setID(String iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}

   
}
