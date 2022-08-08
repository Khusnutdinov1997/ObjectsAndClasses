public class Book {

    private final String title;
    private int publishDate;
    private final Author author;

    public Book (String title, int publishDate, Author author) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
    } // Метод Book

    public String getTitle() {
        return title;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public String toString() {
        return "Book: " + title + ", год публикации: " + publishDate + ", " + author;
    } // Метод toString
} // Конец класса Book

