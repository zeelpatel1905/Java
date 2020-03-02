import java.util.*;

public class Booking {
	String bookingName;
	int guests;
	
	Booking(){
		this.bookingName = "";
		this.guests = 0;
	}

	
	Booking(String name, int guest){
		this.bookingName = name;
		this.guests = guest;
	}
	

	public void setBookingName(String name){
		this.bookingName = name;
	}
	
	public void setGuests(int count){
		this.guests = count;
	}

	public String getBookingName(){
		return this.bookingName;
	}

	public int getGuests(){
		return this.guests;
	}

	public double calculateCharge(int a){
		double charge = 0;
		double no = (double) a;

		if(no > 0 && no <= 20){
			charge = no * 29.50 ;			
		}
		else if(no > 20 && no <= 40){
			charge = 590.00 + ( (no - 20.00) * 24.50 );
		}
		else{
			charge = 1080.00 + ( (no - 40.00) * 19.50 );
		}

		return charge;
	}

}