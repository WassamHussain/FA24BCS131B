public class Screen{
	int screenNumber;
	String movietitle;
	Seat seat[][];

	Screen(int screenNumber, String movietitle, int row, int column){
		this.screenNumber=screenNumber;
		this.movietitle=movietitle;
		this.seat= new Seat[row][column];
		int counter=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				counter=counter+1;
				seat[i][j]=new Seat(counter,row,"VIP",1200.0);
}
}
		
}
	public boolean bookSeat(int row, int column, Customer customer){
		if(!seat[row][column].isBooked){
			seat[row][column].bookseat();
			return true;
}
		else 
			return false;
}

}