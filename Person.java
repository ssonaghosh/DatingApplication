package java.src;
import java.util.HashSet;

/**
 * 
 */

/**
 * @author sumanta
 *
 */
public class Person {
	
	private String name;
	
	private String gender;
	
	private int age;
	
	private HashSet<String> interests;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the interests
	 */
	public HashSet<String> getInterests() {
		return interests;
	}

	/**
	 * @param interests the interests to set
	 */
	public void setInterests(HashSet<String> interests) {
		this.interests = interests;
	}

}
