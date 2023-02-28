package design_patterns.builder;

public class Client {

    private PersonBuilder personBuilder;

    public Client(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void basicDetails() {
        personBuilder.addFirstName("Mark");
        personBuilder.addLastName("Twain");
        personBuilder.addGender(Gender.MALE);
    }

    public void allDetails() {
        personBuilder.addFirstName("Sansa");
        personBuilder.addLastName("Stark");
        personBuilder.addGender(Gender.FEMALE);
        personBuilder.addAge(20);
        personBuilder.addDOB("21-02-2000");
        personBuilder.addAddress("Hyderabad");
        personBuilder.addPanNumber("AFJ787FG");
        personBuilder.addAadharNumber("6765 9098 6543");
    }

    public static void main(String[] args) {
        Client client = new Client(new PersonBuilder());
        client.basicDetails();
        client.allDetails();

    }
}
