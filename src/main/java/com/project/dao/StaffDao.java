package com.project.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.entity.Staff;

@Repository
public class StaffDao {

	@Autowired
	SessionFactory sf;
	
	public List<Staff> getStaffData() {
		Session session =sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		List<Staff> staff = criteria.list();
		session.close();
		return staff;
	}
	
	public List<Staff> getStaffId(int id) {
		Session session = sf.openSession();
		Criteria criteria =session.createCriteria(Staff.class);
		criteria.add(Restrictions.eq("id",3));
		List<Staff> list= criteria.list();
		System.out.println(list);
		session.close();
		return list;
		
	}

	public boolean getInsertData(Staff staff) {
		Session session = sf.openSession();
		Transaction tr =session.beginTransaction();
		System.out.println(staff);
		session.save(staff);
		tr.commit();
		session.close();
		return true;
	}
	
	//4
	
	public List<Staff> getMaxSal() {
		Session session=  sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.gt("salary",20000.0));
		List<Staff> list = criteria.list();
		System.out.println(list);
		session.close();
		return list;
	}

// 5

	public List<Staff> getExp() {
		Session session=  sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.between("exp",10,20));
		List<Staff> list = criteria.list();
		System.out.println(list);
		session.close();
		return list;
	}
	
	// 6
	public List<Staff> getMax() {
	Session session = sf.openSession();
	Criteria criteria = session.createCriteria(Staff.class);
	criteria.addOrder(Order.desc("salary"));
	criteria.setMaxResults(1);
	List<Staff> l1st = criteria.list();
	session.close();
	return l1st;
	}

	public Staff getUpdSal(Staff staff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(staff);
		tr.commit();
		session.close();
		return staff;
		
	}    
	
	// 8
	
	
	public String minExp() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.addOrder(Order.asc("exp"));
		criteria.setMaxResults(1);
		List<Staff> l1 = criteria.list();
		String s1 = null;
		for (Staff staff : l1) {
		s1 = staff.getName();
		}
		session.close();
		return s1;

	}
	
	
	// 9
	
	public List<Staff> getProTrai() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.like("profile", "Trainer"));
		List<Staff> l1 = criteria.list();
		session.close();
		return l1;
		}
	
	//  10
	
	public List<Staff> getNotTrai() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.ne("profile", "Trainer"));
		List<Staff> l1st = criteria.list();
		session.close();
		return l1st;
		}

	public void deleteStaffId(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Staff iddata = session.get(Staff.class,id);
		session.delete(iddata);
		tr.commit();
		session.close();
		
	}
}