package laboration13;

public class Contact {

	private String name;
	private PhoneNumber phone;
	
	public Contact(String inName, String inHome, String inWork, String inMobile){
		this.name = inName;
		this.phone = new PhoneNumber (inHome, inWork, inMobile);
		
		
	}
	public String getName(){
		return this.name;
	}
	public String getHome(){
		return phone.getHome();
	}
	public String getWork(){
		return phone.getWork();
	}
	public String getMobile(){
		return phone.getMobile();
	}
	public String toString(){
		String res = "Contact: " + this.name + "\nHome:    " + phone.getHome() + "\nWork:    " + phone.getWork() + "\nMobile:  " + phone.getMobile();
		return res;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setHome(String home){
		phone.setHome(home);
	}
	public void setWork(String work){
		phone.setWork(work);
	}
	public void setMobile(String mobile){
		phone.setMobile(mobile);
	}
	
	
	
	
	
	
	
}
