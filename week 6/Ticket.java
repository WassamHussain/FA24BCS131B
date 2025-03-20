public class Ticket{
	int ticketid;
	Customer customer;
	int screenNumber;
	int seatNumber;
	String movietitle;
	double price;
	
	Ticket(int ticketid, Customer customer,int screenNumber,int seatNumber, String movietitle, double price){
		this.ticketid=ticketid;
		this.customer=customer;
		this.screenNumber=screenNumber;
		this.seatNumber=seatNumber;
		this.movietitle=movietitle;
		this.price=price;

}

}