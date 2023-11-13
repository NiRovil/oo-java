package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
		if (checkIn.after(checkOut)) {
			throw new DomainException("Date error!");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainException{
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)){
			throw new DomainException("Date error, check-in and check-out must be after today!");
		} 
		if (checkIn.after(checkOut)) {
			throw new DomainException("Date error, check-in before check-out!");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room " + this.roomNumber + ", checkIn: " + sdf.format(checkIn) + ", checkOut: " + sdf.format(checkOut) + ", " + duration() + " nights.";
	}
	
}
