package design_patterns.builder;

public class Person {

    public String firstName;
    public String lastName;
    public int age;
    public String address;
    public String dob;
    public String aadharNumber;
    public String panNumber;
    public Gender gender;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
