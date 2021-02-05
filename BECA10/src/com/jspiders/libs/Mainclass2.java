package com.jspiders.libs;

//java-Bean
class Employee extends Object {
	private int id;
	private String name;
	private double sal;
	private String job;

	public Employee(int id, String name, double sal, String job) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.job = job;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + job + " " + sal;
	}

	@Override
	public boolean equals(Object obj) // Object obj = e3;
	{
		return this.id == obj.hashCode();
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Jeff", 2000, "Dev");
		Employee e2 = new Employee(2, "Smith", 2000, "QA");
		Employee e3 = new Employee(1, "Jeff", 2000, "Dev");

		int i1 = e1.hashCode();
		System.out.println(i1);

		int i2 = e2.hashCode();
		System.out.println(i2);

		System.out.println(e1.toString());

		System.out.println(e2);// println()---calls-->toString()

		boolean b1 = e1.equals(e2);
		System.out.println(b1);

		boolean b2 = e1.equals(e3);
		System.out.println(b2);

		boolean b3 = e2.equals(e3);
		System.out.println(b3);
	}
}
