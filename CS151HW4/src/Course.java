/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Course class
 * <p>
 * 
 * This is the course class which has the attributes of name description department time and weekday. Students will have courses.
 * They may add courses, remove them, and sort them using their attributes.
 * 
 * </p>
 * 
 */
public class Course {

	private String name;
	private String description;
	private String department;
	private String time;
	private String weekday;

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public String getWeekday() {
		return weekday;
	}



	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}



	public Course(String name, String description, String department, String time, String weekday) {
		this.name = name;
		this.description = description;
		this.department = department;
		this.time = time;
		this.weekday = weekday;
	}

	
	@Override
    public String toString() {
    // print the course object as defined below 
            return "{{\"Course\": " + name + "}, {\"Description\": " + description + "}, {\"Department\": " + 
            department + "}, {\"Start Time\": " + time + "}, {\"Day\": " + weekday + "}}"; 
    }
	
}
