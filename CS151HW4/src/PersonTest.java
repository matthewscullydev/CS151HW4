import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class PersonTest extends ListManipulator{

	public PersonTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		ArrayList<Person> personlist = new ArrayList<Person>();
		
	//test begins here	
		ArrayList<Integer> personlist2 = new ArrayList<Integer>();
		
		personlist2.add(2);
		personlist2.add(438);
		personlist2.add(438);
		personlist2.add(23);
		personlist2.add(23);
		personlist2.add(23);
		personlist2.add(81234);
		
		//sort(personlist2,false);
		//swapLargestSmallest(personlist2);
		
		table(personlist2);
		
		Iterator testIterate7 = personlist2.iterator();
		while(testIterate7.hasNext()) {
			System.out.println(testIterate7.next());
		}	
		
		System.out.println();
	//test ends here
		
		Person a = new Person("Joe", "Smith", 40);
		Person b = new Person("Amy", "Gold", 32);
		Person c = new Person("Tony", "Stork", 21);
		Person d = new Person("Sean", "Irish", 24);
		Person e = new Person("Tim", "Brock", 28);
		Person f = new Person("Lenny", "Hep", 18);
		
		personlist.add(a);
		personlist.add(b);
		personlist.add(c);
		personlist.add(d);
		personlist.add(e);
		personlist.add(f);
		
		//ascending age
		
		Collections.sort(personlist);
	
			Iterator testIterate = personlist.iterator();
			while(testIterate.hasNext()) {
				System.out.println(testIterate.next().toString());
			}

			System.out.println();
			
		Collections.sort(personlist, Collections.reverseOrder());
		
		//descending age
		
		Iterator testIterate2 = personlist.iterator();
		while(testIterate2.hasNext()) {
			System.out.println(testIterate2.next().toString());
		}
		
		System.out.println();
		
		//alphabetical ascending
		Collections.sort(personlist,
				new Comparator<Person>()
				{
					public int compare(Person p1, Person p2)
					{
						return p1.firstname.compareTo(p2.firstname);
					}
				});
						
		Iterator testIterate3= personlist.iterator();
		while(testIterate3.hasNext()) {
			System.out.println(testIterate3.next().toString());
		}	
		
		System.out.println();
		
		//alphabetical descending
		Collections.sort(personlist,
					 Collections.reverseOrder(new Comparator<Person>()
						{
							public int compare(Person p1, Person p2)
							{
								return p1.firstname.compareTo(p2.firstname);
							}
						}));
							
		Iterator testIterate4 = personlist.iterator();
		while(testIterate4.hasNext()) {
			System.out.println(testIterate4.next().toString());
		}	
			
		System.out.println();
		
		//last name length ascending
		
		Collections.sort(personlist,
				new Comparator<Person>()
				{
				public int compare(Person p1, Person p2)
				{
					return p1.lastname.length() - p2.lastname.length();
				}
				});
						
		Iterator testIterate5= personlist.iterator();
		while(testIterate5.hasNext()) {
			System.out.println(testIterate5.next().toString());
		}	
		
		System.out.println();
		
		//last name length descending
		
		Collections.sort(personlist,
				 Collections.reverseOrder(new Comparator<Person>()
					{
						public int compare(Person p1, Person p2)
						{
							return p1.lastname.length() - p2.lastname.length();
						}
					}));
						
		Iterator testIterate6 = personlist.iterator();
		while(testIterate6.hasNext()) {
			System.out.println(testIterate6.next().toString());
		}	
		
		System.out.println();
		
	}
	
	


}
