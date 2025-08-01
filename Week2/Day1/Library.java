package week1.day2;

public class Library {
	public void addBook(String bookTitle)
	{
		System.out.println(bookTitle+" - Book added successfully");
	}

	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library bookStore=new Library();
		bookStore.addBook("learning");
		bookStore.issueBook();
		

	}

}
