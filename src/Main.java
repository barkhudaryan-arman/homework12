public class Main {
    public static void main(String[] args) {
        Author author = new Author("Alexander", "Pushkin");
        System.out.println("Имя автора " + author.getName());
        System.out.println("Фамилия автора " + author.getLastName());
        Author author1 = new Author("Lev", "Tolstoy");
        System.out.println("Имя автора " + author1.getName());
        System.out.println("Фамилия автора " + author1.getLastName());
        Book book = new Book("Captain's daughter", "Alexander Pushkin", 1836);
        System.out.println("Название книги " + book.getName() + " автор " + book.getAuthor() + " год выпуска: " + book.getAge());
        Book book1 = new Book("War and Peace","Lev Tolstoy",1867 );
        System.out.println("Название книги " + book1.getName() + " автор " + book1.getAuthor() + " год выпуска: " + book1.getAge());
        book.setAge(2024);
        System.out.println("Название книги " + book.getName() + " автор " + book.getAuthor() + " год выпуска: " + book.getAge());
    }
}