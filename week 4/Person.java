public class Person{
	private String name;
	private Address address;
	private String role;
	
	Person(String name, Address address){
		this.name=name;
		this.address=address;
	
}
	Person(Person other){
		this.name=other.name;
		this.address=other.address;
	
}
	public void setname(String name){
		this.name=name;

}
	public String getname(){
		return name;
}
	public void display(){
		System.out.println("name"+name+" "+"address"+address);
}
	public void setrole(String role){
		this.role=role;

}
	public String getrole(){
		return role;
}




}