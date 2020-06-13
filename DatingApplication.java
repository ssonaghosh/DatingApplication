package java.src;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author sumanta
 *
 */
public class DatingApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();

		Person a = new Person();
		a.setName("UserA");
		a.setGender("Female");
		a.setAge(25);
		HashSet<String> interestsA = new HashSet<String>();
		interestsA.add("Cricket");
		a.setInterests(interestsA);
		list.add(a);
		
		Person b = new Person();
		b.setName("UserB");
		b.setGender("Male");
		b.setAge(27);
		HashSet<String> interestsB = new HashSet<String>();
		interestsB.add("Cricket");
		interestsB.add("Football");
		interestsB.add("Movies");
		b.setInterests(interestsB);
		list.add(b);

		Person c = new Person();
		c.setName("UserC");
		c.setGender("Male");
		c.setAge(26);
		HashSet<String> interestsC = new HashSet<String>();
		interestsC.add("Movies");
		interestsC.add("Tennis");
		interestsC.add("Football");
		interestsC.add("Cricket");
		c.setInterests(interestsC);
		list.add(c);

		Person d = new Person();
		d.setName("UserD");
		d.setGender("Female");
		d.setAge(24);
		HashSet<String> interestsD = new HashSet<String>();
		interestsD.add("Tennis");
		interestsD.add("Football");
		interestsD.add("Badminton");
		b.setInterests(interestsD);
		list.add(d);

		Person e = new Person();
		e.setName("UserE");
		e.setGender("Female");
		e.setAge(32);
		HashSet<String> interestsE = new HashSet<String>();
		interestsE.add("Movies");
		interestsE.add("Tennis");
		interestsE.add("Football");
		interestsE.add("Cricket");
		e.setInterests(interestsE);
		list.add(e);
		
		//Get closest match
		MatchingAlgo match = new MatchingAlgo();
		Person closestMatch = match.closestRank(b, list);
		System.out.println("================Closest match of person B=====================");
		System.out.println("Name: " + closestMatch.getName());
		System.out.println("Gender: " + closestMatch.getGender());
		System.out.println("Age: " + closestMatch.getAge());
		Iterator<String> i = closestMatch.getInterests().iterator();
		System.out.println("Interests: ");
        while (i.hasNext()) 
            System.out.println(i.next());
	}

}
