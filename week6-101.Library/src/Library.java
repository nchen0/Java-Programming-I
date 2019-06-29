import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searchedBook = new ArrayList<Book>();
        for (Book b : books) {
            if (StringUtils.included(b.title(), title)) {
                searchedBook.add(b);
            }
//            if (b.title().contains(title)) {
//                searchedBook.add(b);
//            }
        }
        return searchedBook;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> searchedBook = new ArrayList<Book>();
        for (Book b : books) {
            if (StringUtils.included(b.publisher(), publisher)) {
                searchedBook.add(b);
            }
        }
        return searchedBook;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> searchedBook = new ArrayList<Book>();
        for (Book b : books) {
            if (year == b.year()) {
                searchedBook.add(b);
            }
        }
        return searchedBook;
    }
}
