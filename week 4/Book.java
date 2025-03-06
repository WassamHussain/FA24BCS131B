public class Book{
	private String title;
	private String issn;
	private String edition;
	private Date Dop;
	private Person author;

	Book(String title, String issn, String edition, Date Dop, Person author){
		this.title=title;
		this.issn=issn;
		this.edition=edition;
		this.Dop=Dop;
		this.author=author;


}
	Book(Book other){
		this.title=other.title;
		this.issn=other.issn;
		this.edition=other.edition;
		this.Dop=other.Dop;
		this.author=other.author;
	
}

	public void settitle(String title){
		this.title=title;

}
	public void setissn(String issn){
		this.issn=issn;

}
	public void setedition(String edition){
		this.edition=edition;

}
	public void setDop(Date Dop){
		this.Dop=Dop;

}
	public void setauthor(Person author){
		this.author=author;

}
	public String gettitle(){
		return title;

}
	public String getissn(){
		return issn;

}
	public String getedition(){
		return edition;

}
	public Date getDop(){
		return Dop;

}
	public Person getauthor(){
		return author;

}

}