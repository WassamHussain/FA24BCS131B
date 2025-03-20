public class Seat{
	int seatnumber;
	int rownumber;
	String seattype;
	double price;
	boolean isBooked;

	Seat(int seatnumber, int rownumber,String seattype, double price){
		this.seatnumber=seatnumber;
		this.rownumber=rownumber;
		this.seattype=seattype;
		this.price=price;
}
	public boolean bookseat(){
		if(!isBooked){
			isBooked=true;
			return true;
}
		else
			return false;

}
	public void displayseat(){
		System.out.println("seatnumber: "+seatnumber);
		System.out.println("rownumber: "+rownumber);
		System.out.println("seattype: "+seattype);
		System.out.println("price: "+price);
		System.out.println("Booked: "+isBooked);;
		
		
}
	

}