package exceptionhandling;


//java-Bean , Plain Old Java Object --> POJO
class UserAccnt 
{
	private int id;// r
	private String name;// r
	private String pwd;// w
	private long mob;// r & w
	private String reason = "Mob number cannot be negative value";


	public UserAccnt(int id, String name, String pwd, long mob) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		if(mob > 0)
		{
		 this.mob = mob;
		}
		else
		{
		  IllegalArgumentException ref = 
				  new IllegalArgumentException(reason);
		  throw ref;
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

}

//Service
class AccntService 
{
	private static int ID = 1;
	private static UserAccnt a1;

	public static UserAccnt createAcnt(String un, String pwd, long mob) {
		a1 = new UserAccnt(ID, un, pwd, mob);
		ID++;
		return a1;
	}

	public static void showAcntDetails() {
		System.out.println(a1.getId());
		System.out.println(a1.getMob());
		System.out.println(a1.getName());
	}

	public static void updateMob(long newMob) {
		System.out.println("Old mob : " + a1.getMob());
		if(newMob > 0)
		{
		a1.setMob(newMob);
		}
		else
		{
		  String reason = "Mob number cannot be negative value";
		  IllegalArgumentException ref = 
				  new IllegalArgumentException(reason);
		  throw ref;
		}
		System.out.println("Updated mob : " + a1.getMob());
	}

	public static void updatePwd(String newPwd) {
		System.out.println("Updating password");
		a1.setPwd(newPwd);
		System.out.println("Password Updated");
	}

}

public class Mainclass6 {
	public static void main(String[] args) {
		AccntService.createAcnt("Smith", "pwd123", 98765441232l);
		AccntService.showAcntDetails();
		AccntService.updateMob(-888888888182l);
		AccntService.showAcntDetails();

		AccntService.updatePwd("pwd2345");

	}
}
