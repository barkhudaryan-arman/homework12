public class Book {
    private String name;
    private Author Author;
    private int year;

    public Book(String name, Author Author, int year) {
        this.name = name;
        this.Author = Author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.Author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int age) {
        this.year = age;
    }
}
