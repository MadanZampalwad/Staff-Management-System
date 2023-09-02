package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Staff;
import com.project.services.StaffServices;

@RestController
public class StaffController {
	@Autowired
	StaffServices ss;
	
	//  Show the all data of The Staff Api
	@GetMapping("/show")
	public List<Staff> getStaffData() {
		return ss.getStaffData();
	}
	
	// show the data of using id
	
	@GetMapping("staff/{id}")
	public List<Staff> getStaffId(@PathVariable int id) {
		
		return	ss.getStaffId(id);
	}
	
	// inserting data in the staff table
	
	@PostMapping("/insert1")
	public boolean getInsertData(@RequestBody Staff staff) {
		boolean inserted = ss.getInsertData(staff);
		return inserted;
	}
	
	// getting information of the maximum salary of the staff 
	@GetMapping("/maxsal")
	public List<Staff> getMaxSal() {
		return ss.getMaxSal();
	}
	
	
	// getting the information of exprienses staff
	
	@GetMapping("/exp")
	public List<Staff> getExp() {
		return ss.getExp();
	}
	
	
	
	@GetMapping("/max")
	public List<Staff> getMax() {
		return ss.getMax();
	}
	
	// Update the staff information  
	
	@PutMapping("/update")
	public Staff getUpdSal(@RequestBody Staff staff) {
			return ss.getUpdSal(staff);
	}    
	
	
	// getting the information of the minimum expriences
	@GetMapping("/min")
	public String minExp() {
		return ss.minExp();
	}
	
	//  
	
	@GetMapping("/profile")
	public List<Staff> getProTrai() {
		return ss.getProTrai();
	}
	
	// getting the information of the staff data without trainer profile
	
	@GetMapping("/nottrainer")
	public List<Staff> getNotTrai() {
		return ss.getNotTrai();
	}
	
	// delete the information of the staff using id
	
	@DeleteMapping("/deleteid/{id}")
	public String  deleteStaffId(@PathVariable int id) {
		 ss.deleteStaffId(id);
		System.out.println("Data is deleted id : " );
		return "Data Is Deleted ....";
	}

}
