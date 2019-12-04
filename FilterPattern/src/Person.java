public class Person {

    private String name;
    private String gender;
    private MaritalStatus maritalStatus;

    public Person() {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public Person(String name, String gender, MaritalStatus maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

}
