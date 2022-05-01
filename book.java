package lab;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book123
{
	private String bookname;
	@Id
	private int bookId;
	
	
	@ManyToOne
	Author123 author;

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Author123 getAuthor() {
		return author;
	}

	public void setAuthor(Author123 author) {
		this.author = author;
	}
	
	

}