import java.util.ArrayList;
import java.util.List;

public class OrCriterial implements Criteria {

    private Criteria firstCriterial;
    private Criteria otherCriterial;

    public OrCriterial(Criteria firstCriterial, Criteria otherCriterial) {
        this.firstCriterial = firstCriterial;
        this.otherCriterial = otherCriterial;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstListPerson = firstCriterial.meetCriteria(personList);
        List<Person> otherListPerson = otherCriterial.meetCriteria(personList);

        for (Person person: otherListPerson) {
            if (!firstListPerson.contains(person)) {
                firstListPerson.add(person);
            }
        }
        return firstListPerson;
    }

}
