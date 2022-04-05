import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;


public class Student {

	private String firstname;
	private String lastname;
	private int age;
	private String major;
	private float gpa;
	private String department;
	private LinkedList<Course> courses;
	
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public float getGpa() {
		return gpa;
	}


	public void setGpa(float gpa) {
		this.gpa = gpa;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public LinkedList<Course> getCourses() {
		return courses;
	}


	public void setCourses(LinkedList<Course> courses) {
		this.courses = courses;
	}
	
	
	public Student() {
		
		courses = new LinkedList<Course>();
	}
	
	public Student(String firstname, String lastname, String major, String department, int age, float gpa) {
		this();
		this.gpa = gpa;
		this.department = department;
		this.age = age;
		this.major = major;
		this.lastname = lastname;
		this.firstname = firstname;
		// TODO Auto-generated constructor stub
	}

	public void addCourse(Course c) {
		
		if(!courses.contains(c)) {
		courses.add(c);
		}
	}
	
	public void removeCourse(Course c) {
		if(courses.contains(c)) {
		courses.remove(c);
		}
	}
	
	public void sort(String attribute, Boolean descending)
	{
		
		HashMap<String, Integer> weekDays = new HashMap<String, Integer>();
			weekDays.put("Monday", 0);
			weekDays.put("Tuesday", 1);
			weekDays.put("Wednesday", 2);
			weekDays.put("Thursday", 3);
			weekDays.put("Friday", 4);
			weekDays.put("Saturday", 5);
			weekDays.put("Sunday", 6);
			
		
		 Comparator<Course> test1 = new Comparator<Course>(){
	            @Override
	            public int compare(Course first, Course second)
	            {
	            	if(attribute.equals("name")) {
	            		return first.getName().compareTo(second.getName());
	            	}
	            	
	            	else if(attribute.equals("description")) {
	            		return first.getDescription().length() - second.getDescription().length();
	            	}
	            	
	            	else if(attribute.equals("department")) {
	            		 return first.getDepartment().compareTo(second.getDepartment());
	            	}
	            	
	            	else if(attribute.equals("time")) {
	            		 return first.getTime().compareTo(second.getTime());
	            	}
	            
	            	else {
	            		 return weekDays.get(first.getWeekday()) - weekDays.get(second.getWeekday());
	            	}
	            };
	         
		 };
		 
		 Collections.sort(courses,test1);
		 
		 if (descending) {
			 Collections.reverse(courses);
		 }
	           
		 for(Course c : courses)
		 {
			 System.out.println(c);
		 }
	}
	
}
