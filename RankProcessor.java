package java.src;
/**
 * @author sumanta
 *
 */
public interface RankProcessor {
	
	public int getGenderRank(Person a, Person b);
	
	public int getAgeRank(Person a, Person b);
	
	public int getInterestsRank(Person a, Person b);

}
