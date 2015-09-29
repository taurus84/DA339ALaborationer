package laboration13;

public class PhoneNumber {
	private String home;
	private String work;
	private String mobile;
	
	public PhoneNumber (String inHome, String inWork, String inMobile){
		this.home = inHome;
		this.work = inWork;
		this.mobile = inMobile;
	}
	public void setHome(String home){
		this.home = home;
	}
	public void setWork(String work){
		this.work = work;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getHome(){
		return this.home;
	}
	public String getWork(){
		return this.work;
	}
	public String getMobile(){
		return this.mobile;
	}
	public String toString(){
		String res = "Home:    " + this.home + "\nWork:    " + this.work + "\nMobile:  " + this.mobile; 
		return res;
	}
}
