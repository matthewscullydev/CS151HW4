
public class studentTest {

	public studentTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Student s = new Student("John", "Doe", "CS", "CSED", 21, 3.5f);
		Course c1 = new Course("DSA-101", "Introduction to Algorithms", "CSED", "2020-10-19", "Monday");
		Course c2 = new Course("OOM-101", "Object Oriented Modelling", "CSED", "2020-10-21", "Wednesday");
		Course c3 = new Course("ST-101", "Statistics", "CSED", "2020-10-16", "Friday");
		s.addCourse(c1);
		s.addCourse(c2);
		s.addCourse(c3);

	    s.sort("time", false);
        System.out.println("\n");
        s.sort("weekday", true);
		
	}
	
}
