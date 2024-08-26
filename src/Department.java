import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Book> books;

    public Department(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int getBookCount() {
        return books.size();
    }

    public List<Book> searchBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }
}

