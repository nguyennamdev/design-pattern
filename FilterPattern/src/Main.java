import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Nguyen Nam", "female", MaritalStatus.single));
        personList.add(new Person("Nguyen Tuan", "female", MaritalStatus.single));
        personList.add(new Person("Le Giang", "male", MaritalStatus.single));
        personList.add(new Person("Tran Trung Kien", "female", MaritalStatus.marrired));
        personList.add(new Person("Cao Minh Lam", "female", MaritalStatus.single));

        CriteriaMale criteriaMale = new CriteriaMale();
        printPersons(criteriaMale.meetCriteria(personList));

        AndCriterial andCriterial = new AndCriterial(new CriterialFemale(), new CriterialSingle());
        System.out.println("-------- And criterial -----------");
        printPersons(andCriterial.meetCriteria(personList));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
