package indhirakumar;

class book{
	String name;
	int pages;
	String author;
	
	book(String name,int pages,String author) {
		this.name=name;
		this.pages=pages;
		this.author=author;
	}
	
	String displayInfo() {
		return "Book name is "+this.name+" Pages("+this.pages+") and the author was "+this.author;
	}
}

public class AggregationINjava {

	public static void main(String[] args) {
		book b1=new book("AVATAR", 123, "james");
		book b2=new book("Intersteller", 545, "Cristopher nolen");
		System.out.println(b1.displayInfo());
		System.out.println(b2.displayInfo());
	}

}
