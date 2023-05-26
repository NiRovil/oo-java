package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		Department department = new Department(departmentName);
		
		System.out.println("Enter woker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		Double salary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, department);
		
		System.out.println("How many contracts to this worker? ");
		int contractsQuantity = sc.nextInt();
		
		int count = 1;

		while(count <= contractsQuantity) {
			System.out.println("Enter contract #" + count + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double vpr = sc.nextDouble();
			System.out.print("Duration (hours): ");
			Integer duration = sc.nextInt();
			
			HourContract hContract = new HourContract(date, vpr, duration);
			worker.addContract(hContract);
			count++;
		}
		
		System.out.println("Enter a month and year to calculate income (MM/YYYY): ");
		String incomeDate = sc.next();
		int month = Integer.parseInt(incomeDate.substring(0, 2));
		int year = Integer.parseInt(incomeDate.substring(3));
		
		System.out.println("Worker: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + incomeDate + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
