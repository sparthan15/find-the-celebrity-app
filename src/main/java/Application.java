

import java.util.HashSet;
import java.util.Set;
import java.util.logging.LogManager;

import org.apache.log4j.Logger;

import com.celebrity.domain.FootballCelebrity;
import com.celebrity.domain.ICelebrity;
import com.celebrity.domain.Person;
import com.celebrity.domain.Team;

public class Application {

   static Logger logger = Logger.getLogger(Application.class.getName());  

	public static void main(String[] args) { 
		//findTheCelebrity(setupPeopleOne(), new BasketballCelebrity());
		findTheCelebrity(setupPeopleWhoKnowAboutFootball(), new FootballCelebrity());
	}

	private static void findTheCelebrity(Set<Person> people, ICelebrity whoIsTheCelebrity) {
		Team basketballPeople = new Team(people, whoIsTheCelebrity);
		logger.info(basketballPeople.findTheCelebrities());		
		
		
	}
	
	
	private static Set<Person> setupPeopleOne() {
		Person carlos = new Person("Carlos");
		Person juan = new Person("Juan");
		Person kevin = new Person("Kenvin");
		Person laura = new Person("laura");

		laura.addObserved(kevin);
		carlos.addObserved(kevin);
		juan.addObserved(kevin);
		
		Set<Person> people = new HashSet<>();
		
		people.add(carlos);
		people.add(kevin);
		people.add(juan);
		return people;
	}
	
	private static Set<Person> setupPeopleWhoKnowAboutFootball() {
		Person carlos = new Person("Carlos");
		Person juan = new Person("Juan");
		Person kevin = new Person("Kenvin");
		Person laura = new Person("laura");
		Person lioMessi = new Person("Lio messi");
		Person michaelJordan = new Person("Mike");
		laura.addObserved(lioMessi);
		carlos.addObserved(lioMessi);
		juan.addObserved(lioMessi);
		laura.addObserved(michaelJordan);
		
		Set<Person> people = new HashSet<>();
		people.add(carlos);
		people.add(juan);
		people.add(kevin);
		people.add(laura);		
		people.add(lioMessi);	
		return people;
	}
}
