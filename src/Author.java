public class Author {
    private final String name;
    private final String lastName;

    public Author(String name, String lastname) {
        this.name = name;
        this.lastName = lastname;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }
}
