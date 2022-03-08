package pojoeg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
public class ViewRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s = sf.openSession();
		Criteria ct = s.createCriteria(School.class);
		//Criterion rt = Restrictions.gt("rn",102);
		//Criterion rt = Restrictions.between("rn", 105,110);
		ArrayList<Integer> aa = new ArrayList<Integer>();
		aa.add(101);
		aa.add(102);
		Criterion rt = Restrictions.in("rn",aa);
		ct.add(rt);
		
		List lst = ct.list();
		Iterator it = lst.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			School stu = (School)o;
	System.out.println(stu.getRn() + " "+stu.getName());
			
		}
		s.close();
		sf.close();
	}

}
