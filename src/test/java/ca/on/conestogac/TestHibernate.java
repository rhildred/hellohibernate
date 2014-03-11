package ca.on.conestogac;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.Date;
import org.hibernate.Session;
import com.mkyong.util.HibernateUtil;
import com.mkyong.user.DBUser;

public class TestHibernate {
	@Test
    public void testPasses() {
        // The worlds most obvious bug:
        assertTrue(true);
    }
	@Test
	public void testSave(){
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();
		DBUser user = new DBUser();
 
		user.setUserId(100);
		user.setUsername("superman");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());
 
		session.save(user);
		session.getTransaction().commit();
		assertTrue(true);
	}

}
