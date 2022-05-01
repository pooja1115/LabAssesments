package lab;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author
{
	private String Aname;
	@Id
	private int Aid;
	
	@OneToMany(mappedBy="author")
	private List<Book123> book;

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public List<Book123> getBook() {
		return book;
	}

	public void setBook(List<Book123> book) {
		this.book = book;
	}
	
	
	

}