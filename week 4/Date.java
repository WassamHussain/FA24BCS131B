public class Date{
	private int day;
	private int month;
	private int year;

	Date(int day, int month, int year){
	setDay(day);
	setMonth(month);
	setYear(year);

	}


	public void setDay(int day){
		if (day<=31 && day>0){
			this.day = day;
		}
	}


	public void setMonth(int month){
		if (month<13 && month>0){
			this.month = month;
		}
	}


	public void setYear(int year){
		if (year>0){
			this.year = year;
		}
	}
	public int getDay(){
		return day;
}
	public int getMonth(){
		return month;
}
	public int getYear(){
		return year;
}
	public void display(){
		System.out.println(day+"/"+month+"/"+year+"/");

}
	Date(Date other){
		this.day=other.day;
		this.month=other.month;
		this.year=other.year;
	
}


}