package com.example.model;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@Entity
@Table(name = "EMPLOYEE")
public class Employee {
 
    public Employee() {
         
    }
    public Employee(String id, String firstName, String lastName, String email,Integer pinCode,Date birthDate,Boolean isActive) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pinCode = pinCode;
        this.birthDate = birthDate;
        this.isActive = isActive;
    }
     
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
    private String id;
    
    @Column(name = "firstName")
    private String firstName;
    
    private String lastName;
    private String email;
    private Integer pinCode;
    private Date birthDate;
    private Boolean isActive;
     
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
 
    public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	@Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + "]";
    }
	
	
	public static Employee findEmpByEmail(String email){
		//find by Id query
		Employee em = new Employee();
		return em;
		
		
	}
	
	public static Employee findEmpById(String empId){
		//find by Id query
		
		Employee em = new Employee();
		return em;
		
		
	}
	
	public String updateFunction(Employee emps){
		/*SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		long id = (Long) session.save(emps);
		return id;*/
		return "update";
		
	}
	
	public static String saveFunction(Employee emps){
		/*SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		long id = (Long) session.save(emps);
		return id;*/
		return "save";
	}
	
}