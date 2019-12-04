import java.util.ArrayList;
import java.util.List;

public class CriterialFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> filterList = new ArrayList<Person>();
        for (Person person: personList) {
            if (person.getGender().equalsIgnoreCase("female")) {
                filterList.add(person);
            }
        }
        return filterList;
    }

}
