public class Address{
	private String country;
	private String city;
	private String honum;

	Address(String country, String city, String honum){
		this.country=country;
		this.city=city;
		this.honum=honum;
	
}

	public void setcountry(String country){
		this.country=country;
	
}
	public void setcity(String city){
		this.city=city;
	
}
	public void sethonum(String honum){
		this.honum=honum;
	
}
	public String getcountry(){
		return country;
}
	public String getcity(){
		return city;
}
	public String gethonum(){
		return honum;
}

	Address(Address other){
		this.country=other.country;
		this.city=other.city;
		this.honum=other.honum;



}

}