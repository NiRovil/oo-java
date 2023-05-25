package entities;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	public Worker(String name, WorkerLevel level, double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}
	
	public void addContract(HourContract contract) {
		
	}
	
	public void removeContract(HourContract contract) {
		
	}
	
	public double income(int year, int month) {
		return year + month;
	}
	
}
