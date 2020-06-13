package java.src;
import java.util.List;
import java.util.logging.Logger;

public class MatchingAlgo extends RankProcessorImpl {
	
	public Person closestRank(Person a, List<Person> plist) {
		
		Logger log = Logger.getLogger("MatchingAlgo");
		
		boolean removed = plist.remove(a);
		
		int closestRank = 0;
		int currRank = 0;
		Person closestPerson = null;
		for (Person b : plist) {
			if (a.equals(b)) {
				//do nothing; doesn't need a self matching
			}
			currRank += getGenderRank(a, b);
			currRank += getAgeRank(a, b);
			currRank += getInterestsRank(a, b);
			if (currRank < closestRank) {
				closestRank = currRank;
				closestPerson = b;
			}
		}
		return closestPerson;
	}
}
