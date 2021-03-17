import java.util.ArrayList;

public class Library 
{
	private ArrayList<Book>bookList = new ArrayList<Book>();
	
	public ArrayList<Book> getBookList(){
		return this.bookList;
	}
	public void setBookList(ArrayList<Book> bookList){
		this.bookList=bookList;
		
	}
	public void addBook(Book bobj) {
		bookList.add(bobj);
	}
	public boolean isEmpty() {
		if(bookList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public ArrayList<Book> viewAllBooks(){
		return bookList;
	}
	public ArrayList<Book> viewBooksByAuthor(String author){
		ArrayList<Book> n=new ArrayList<Book>();
		for(Book b:bookList) {
			if(b.getAuthor().equals(author)) {
				n.add(b);
			}
		}
		if(n.isEmpty()) {
			System.out.println("The list is empty");
		}
		return n;
	}
	public int countnoofbook(String bname) {
		int count=0;
		for(Book b:bookList) {
			if(b.getBookName().equals(bname)) {
				count++;
			}
		}
		return count;
	}

}
