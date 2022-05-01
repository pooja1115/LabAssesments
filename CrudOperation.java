package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudOperation {

	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		Author123 a1=new Author123();
		a1.setAid(100);
		a1.setAname("J.D.Varma");
		
		Book123 b1=new Book123();
		b1.setBookId(500);
		b1.setBookname("Science");
		b1.setAuthor(a1);
		
		Book123 b2=new Book123();
		b2.setBookId(501);
		b2.setBookname("psycology");
		b2.setAuthor(a1);
		
		Book123 b3=new Book123();
		b3.setBookId(502);
		b3.setBookname("Chemistry");
		b3.setAuthor(a1);
		
		List<Book123> list=new ArrayList<Book123>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		
		a1.setBook(list);
		session.save(a1);
		session.save(b1);
		session.save(b2);
		session.save(b3);


		
		tx.commit();
		
		System.out.println("data added");
		
		
	   System.out.println("if you want to delete press 1 otherwise 2 :");
		int l=sc.nextInt();
		if(l==1) 
		{
			Transaction tx1=session.beginTransaction();
			System.out.println("please enter bookname which is wnat to delete :");
			String delete=sc.next();
		Query q=session.createQuery("delete from Book123 where bookname=:x");
		q.setParameter("x",delete);
		int count=q.executeUpdate();
		System.out.println(count+" records deleted");
		tx1.commit();
		}
		
		
		
		session.close();
		factory.close();

		
			


	}

}