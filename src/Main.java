import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем библиотеку
        Library library = new Library();

        // Создаем отделы
        Department fiction = new Department("Fiction");
        Department law = new Department("Law");
        Department tech = new Department("Tech");

        // Добавляем отделы в библиотеку
        library.addDepartment(fiction);
        library.addDepartment(law);
        library.addDepartment(tech);

        // Создаем книги
        Book book1 = new Book("001", "George Orwell", "1984", 1949);
        Book book2 = new Book("002", "Fyodor Dostoevsky", "Crime and Punishment", 1866);
        Book book3 = new Book("003", "Isaac Asimov", "Foundation", 1951);
        Book book4 = new Book("004", "John Grisham", "The Firm", 1991);
        Book book5 = new Book("005", "Albert Einstein", "Relativity: The Special and the General Theory", 1916);

        // Добавляем книги в отделы
        fiction.addBook(book1);
        fiction.addBook(book2);
        tech.addBook(book3);
        law.addBook(book4);
        tech.addBook(book5);

        // Подсчитываем количество книг в каждом отделе
        System.out.println("Number of books in Fiction: " + fiction.getBookCount());
        System.out.println("Number of books in Law: " + law.getBookCount());
        System.out.println("Number of books in Tech: " + tech.getBookCount());

        // Поиск книг по автору в отделе
        System.out.println("Books by Fyodor Dostoevsky in Fiction:");
        List<Book> foundBooks = fiction.searchBooksByAuthor("Fyodor Dostoevsky");
        for (Book book : foundBooks) {
            System.out.println(book);
        }

        System.out.println("Books by Isaac Asimov in Tech:");
        foundBooks = tech.searchBooksByAuthor("Isaac Asimov");
        for (Book book : foundBooks) {
            System.out.println(book);
        }
    }
}