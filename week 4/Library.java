public class Library{
	private Person staff;
	private Book book;
	private String name;
	private Person incharge;

	Library(Person staff, Book book, String name, Person incharge){
		this.staff=staff;
		this.book=book;
		this.name=name;
		this.incharge=incharge;


}

	Library(Library other){
		this.staff=other.staff;
		this.book=other.book;
		this.name=other.name;
		this.incharge=other.incharge;


}
	public void setstaff(Person staff){
		this.staff=staff;

}
	public void setbook(Book book){
		this.book=book;

}
	public void setname(String name){
		this.name=name;

}
	public void setincharge(Person incharge){
		this.staff=staff;

}
	public Person getstaff(){
		return staff;
}
	public Book getbook(){
		return book;
}
	public String getname(){
		return name;
}
	public Person getincharge(){
		return incharge;
}
	public void displaybook(){
		System.out.println("Staff: "+staff+" "+"Book: "+book+" "+"Library name: "+name+"Incharge: "+Incharge);


}


}