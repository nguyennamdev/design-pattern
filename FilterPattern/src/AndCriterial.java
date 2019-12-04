import java.util.List;

public class AndCriterial implements Criteria {

    private Criteria firstCriterial;
    private Criteria secondCriterial;

    public AndCriterial(Criteria firstCriterial, Criteria secondCriterial) {
        this.firstCriterial = firstCriterial;
        this.secondCriterial = secondCriterial;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstListPerson = firstCriterial.meetCriteria(personList);
        return secondCriterial.meetCriteria(firstListPerson);
    }
}
