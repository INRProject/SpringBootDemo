package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.model.Employee;
import com.example.pojoVM.EmployeeVM;
 
//java -jar target/demo-0.1.0.jar

@RestController
public class EmployeeController
{
   
    
    @RequestMapping(value = "/createEmp", method = RequestMethod.POST)
    public String createEmp(@RequestBody EmployeeVM emp) {
    	String msg = "";
    	Employee findEmail = Employee.findEmpByEmail(emp.getId());
    	if(findEmail != null){
    		if(findEmail.getIsActive() == false){
    			msg = "User not active";
    		}
    	}else{
    		Employee emps = new Employee();
            emps.setFirstName(emp.getFirstName());
            emps.setLastName(emp.getLastName());
            emps.setBirthDate(emp.getBirthDate());
            emps.setPinCode(emp.getPinCode());
            emps.setEmail(emp.getEmail());
            String empId = Employee.saveFunction(emps);
            msg = "Scuccessful with empId"+empId;
        
    	}
        	return msg;
    	
    }
    
    @RequestMapping(value = "/updateEmp", method = RequestMethod.POST)
    public String updateEmp(@RequestBody EmployeeVM emp) {
    	
    	
        Employee emps = Employee.findEmpById(emp.getId());
        emps.setBirthDate(emp.getBirthDate());
        emps.setPinCode(emp.getPinCode());
        emps.updateFunction(emps);
    	return "Scuccessful";
    	
    }
    
    @RequestMapping(value = "/deleteEmp", method = RequestMethod.GET)
    public String deleteEmp(@RequestBody String empId) {
    	
        Employee emps = Employee.findEmpById(empId);
        emps.setIsActive(false);
        emps.updateFunction(emps);
    	return "Scuccessful";
    	
    }
    
    
    
}