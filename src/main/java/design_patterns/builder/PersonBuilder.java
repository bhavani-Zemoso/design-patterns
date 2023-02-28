package design_patterns.builder;

public class PersonBuilder {

    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public void addFirstName(String firstName) {
        this.person.setFirstName(firstName);
    }

    public void addLastName(String lastName) {
        this.person.setLastName(lastName);
    }

    public void addAge(int age) {
        this.person.setAge(age);
    }

    public void addAddress(String address) {
        this.person.setAddress(address);
    }

    public void addAadharNumber(String aadharNumber) {
        this.person.setAadharNumber(aadharNumber);
    }

    public void addPanNumber(String panNumber) {
        this.person.setPanNumber(panNumber);
    }

    public void addDOB(String dob) {
        this.person.setDob(dob);
    }

    public void addGender(Gender gender) {
        this.person.setGender(gender);
    }
}
