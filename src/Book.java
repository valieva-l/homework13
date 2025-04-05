import java.util.Objects;

public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;

    }

    public String getTitle() {
        return this.title;

    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public String toString() {
        return "Название книги " + this.title + " " + this.author;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, author);
    }

}
