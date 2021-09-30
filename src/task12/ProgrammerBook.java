package task12;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammerBook programmerBook = (ProgrammerBook) o;
        return level == programmerBook.level && Objects.equals(language, programmerBook.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    public String toString() {
        return "_________________________________________\n"
                + "isbn: " + this.getIsbn() + "\nAuthor: " + this.getAuthor() +
                "\nTitle: " + this.getTitle() + "\nPrice: " + this.getPrice() +
                "\nLanguage: " + this.getLanguage() + "\nLevel: " + this.getLevel();
    }

}
