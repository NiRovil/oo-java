package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Integer roomNumber;
		Date checkIn, checkOut;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Romm number: ");
			roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println(checkIn);
			System.out.print("Check-ouy date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.print(reservation);
			
			System.out.print("Enter data to update the reservation: ");
			System.out.print("Check-in date: ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date: ");
			checkOut = sdf.parse(sc.next());
			reservation.updateDates(checkIn, checkOut);
			System.out.print("Reservation: " + reservation);
			
		}
		catch(ParseException e) {
			System.out.println("Cannot convert the date " + e);
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}

}
