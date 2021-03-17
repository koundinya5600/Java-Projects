import java.util.Scanner;
//import java.lang.*;
public class Main{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Library l1=new Library();
		
			System.out.println("1.Add Book\r\n"
					+ "2.Display all book details\r\n"
					+ "3.Search Book by author \r\n"
					+ "4.Count number of books - by book name\r\n"
					+ "5.Exit\r\n"
					+ "Enter your choice:");
			int choice = s.nextInt();
			if(choice<=5) {
				switch(choice) {
				case 1:
					Book b=new Book();
					System.out.println("Enter the isbnno:");
					b.setIsbnno(s.nextInt());
					s.nextLine();
					System.out.println("Enter the book name:");
					b.setBookName(s.nextLine());
					System.out.println("Enter the author name:");
					b.setAuthor(s.nextLine());
					l1.addBook(b);
					break;
				case 2:
					for(Book book:l1.viewAllBooks()) {
						System.out.println("ISBN no:"+book.getIsbnno());
						System.out.println("Book name:"+book.getBookName());
						System.out.println("Author name:"+book.getAuthor());
					}
						break;
				case 3:
					System.out.println("Enter the author name:");
					for(Book book:l1.viewBooksByAuthor(s.nextLine())) {
						System.out.println("ISBN no:"+book.getIsbnno());
						System.out.println("Book name:"+book.getBookName());
						System.out.println("Author name:"+book.getAuthor());
						}
					break;
				case 4:
					System.out.println("Enter the book name:");
					System.out.println("Number of books:"+l1.countnoofbook(s.nextLine()));
					break;
				case 5:
					break;
		
				}
		}
	
		
	}

	
}
