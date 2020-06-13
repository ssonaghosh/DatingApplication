package java.src;
import java.util.HashSet;
import java.util.logging.Logger;

/**
 * 
 */

/**
 * @author sumanta
 *
 */
public class RankProcessorImpl implements RankProcessor {
	
	@Override
	public int getGenderRank(Person a, Person b) {
		int rank = 0;
		if(a.getGender().equals("Male") || a.getGender().equals("Female")
				|| b.getGender().equals("Male") || b.getGender().equals("Female")) {
			if (a.getGender().equalsIgnoreCase(b.getGender())) {
				rank = 1;
			} else {
				rank = 0;
			}
		} else {
			Logger.getLogger("Invalid gender for person:" + a.getName() + " or person:" + b.getGender());
		}
		return rank;
	}
		
	@Override
	public int getAgeRank(Person a, Person b) {
		int rankAge = 0;
		if (a.getAge() > 0 && b.getAge() > 0) {
			rankAge = -Math.abs(a.getAge() - b.getAge());
		} else {
			Logger.getLogger("Invalid age for person:" + a.getName() + " or person:" + b.getName());
		}
		return rankAge;
	}
	
	@Override
	public int getInterestsRank(Person a, Person b) {
		//Use a temporary set to copy a's interests and preserve a's interests
		HashSet<String> a1 = new HashSet<String>(a.getInterests());
		a1.retainAll(b.getInterests()); //to be fixed
		return a1.size();
	}
}
