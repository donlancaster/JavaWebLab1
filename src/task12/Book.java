package task12;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "_________________________________________\n"
                + "isbn: " + this.getIsbn() + "\nAuthor: " + this.getAuthor() +
                "\nTitle: " + this.getTitle() + "\nPrice: " + this.getPrice();
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    public static Comparator<Book> byName = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    };

    public static Comparator<Book> byAuthor = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    };

    public static Comparator<Book> byPrice = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };


    public static Comparator<Book> byNameAndAuthor = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int res = o1.getTitle().compareTo(o2.getTitle());
            if (res == 0) res = o1.getAuthor().compareTo(o2.getAuthor());
            return res;
        }
    };


    public static Comparator<Book> byAuthorAndName = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int res = o1.getAuthor().compareTo(o2.getAuthor());
            if (res == 0) res = o1.getTitle().compareTo(o2.getTitle());
            return res;
        }
    };


    public static Comparator<Book> byAuthorAndNameAndPrice = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int res = o1.getAuthor().compareTo(o2.getAuthor());
            if (res == 0) res = o1.getTitle().compareTo(o2.getTitle());
            if (res == 0) res = o1.getPrice() - o2.getPrice();
            return res;
        }
    };


    @Override
    public int compareTo(Book o) {
        return this.isbn.compareTo(o.isbn);
    }
}
