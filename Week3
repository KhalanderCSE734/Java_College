import java.util.Scanner;

class Book{
	String name,author;
	double price;
	int page_no;
	Book(){};
	Book(String name,String author,double price, int page_no){
		this.name = name;
		this.author = author;
		this.price = price;
		this.page_no = page_no;
	}
	void setName(String name){
		this.name = name;
	}
	void setAuthor(String author){
		this.author = author;
	}
	void setPrice(double price){
		this.price = price;
	}
	void setPage(int page_no){
		this.page_no = page_no;
	}
	

	String getName(){
		return this.name;
	}
	String getAuthor(){
		return this.author;
	}
	double getPrice(){
		return this.price;
	}
	int getPage(){
		return this.page_no;
	}
	

	public String toString(){
		/*System.out.println("The name of the Book is "+this.name);
		System.out.println("The author of the Book "+this.name+" is "+this.author);
		System.out.println("The Price of the Book "+this.name+" is "+this.price);
		System.out.println("The "+this.name+" contains "+this.page_no+" pages");*/

		String book = "";
		//book = "The name of the Book is "+this.name+" author of the Book "+this.name+" is "+this.author+ " The Price of the Book "+this.name+" is "+this.price+" The "+this.name+" book contains "+this.page_no+" pages";
		book = "Book{ \n"+this.name+" "+this.name+" "+this.author+" "+this.price+" "+this.page_no+" \n}";						
		return book;
	}

}

class getandset{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of books");
	int n = sc.nextInt();
	sc.nextLine();
	Book book[] = new Book[n];
	int cur;++
	for(int i=0;i<n;i++){
		cur = i+1;
		System.out.println("Enter the details of Book "+ cur);
		String name,author;
		int page_no;double price;
		System.out.println("Enter the name of the book: ");
		name = sc.nextLine();
		System.out.println("Enter the author name of the book "+name+" : ");
		author = sc.nextLine();
		System.out.println("Enter the price of the book "+name);
		price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the number of the pages in "+name);
		page_no = sc.nextInt();
		sc.nextLine();
		  book[i] = new Book(name,author,price,page_no);
	}
	
	for(int i=0;i<n;i++){
		//cur = i+1;
		//System.out.println("The details of book "+ cur + " is ");
		//System.out.println(book[i].toString());
		System.out.println(book[i]);

	}

	}
}
