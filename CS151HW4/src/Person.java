/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Person class
 * <p>
 * 
 * This is the person class which has a first and last name as well as an age. It uses a comparator to compare ages. 
 * 
 * </p>
 * 
 */
public class Person implements Comparable<Person> {

	String firstname;
	String lastname;
	int age;
	
	public Person(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

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

	   @Override
	   public String toString() {
	        return ("firstname:"+this.getFirstname()+
	                    " lastname:"+ this.getLastname() +
	                    " age: "+ this.getAge());
	                    
	   }


	public int compareTo(Person person) {
		if(this.age > person.getAge()) {
			return -1;
		}
		else if(this.age < person.getAge()) {
			return 1;
		}
		else
		return 0;
	}
}
