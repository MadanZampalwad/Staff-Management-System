package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.StaffDao;
import com.project.entity.Staff;

@Service
public class StaffServices {

	@Autowired
	StaffDao sd;
	public List<Staff> getStaffData() {
		
		return sd.getStaffData();
	}
	
	public List<Staff> getStaffId(int id) {
		List<Staff> list = sd.getStaffId(id);
		return list;
		
	}

	
	public boolean getInsertData(Staff staff) {
		boolean inserted = sd.getInsertData(staff);
		return inserted;
		
	}
	//4
	
	public List<Staff> getMaxSal() {
		return sd.getMaxSal();
		
	}

	//5

	public List<Staff> getExp() {
		return sd.getExp();
		
	}
	// 6
	public List<Staff> getMax() {
		return sd.getMax();
	}
	
	// 7

	public Staff getUpdSal(Staff staff) {
		return sd.getUpdSal(staff);
		
	}  
	
	// 8
	
	public String minExp() {
		
		return sd.minExp();
	}
	
	// 9
	
	public List<Staff> getProTrai() {
		return sd.getProTrai();
	}

	// 10
	
	public List<Staff> getNotTrai() {
		return sd.getNotTrai();
	}

	public void deleteStaffId(int id) {
		
		 sd.deleteStaffId(id);
	}
	
}
