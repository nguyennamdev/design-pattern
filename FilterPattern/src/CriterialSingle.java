import java.util.ArrayList;
import java.util.List;

public class CriterialSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> filterList = new ArrayList<>();
        for (Person person: personList) {
            if (person.getMaritalStatus() == MaritalStatus.single) {
                filterList.add(person);
            }
        }
        return filterList;
    }

}
