package com.jspiders.empdb;

public class Employee {

	private int id;
	private String name;
	private String job;
	private double sal;
	private double comm;
	private String hiredate;
	private int deptno;
	
	public Employee()
	{
		
	}

	public Employee(int id, String name, String job, double sal, double comm, String hiredate, int deptno) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
		this.hiredate = hiredate;
		this.deptno = deptno;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

}
