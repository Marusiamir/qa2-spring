package model;

public class Book {
    private String bookAuthor;
    private String nameBook;
    private String format;
    private String bookCover;
    private double paper;
    private double circulation;
    private double letterSize;

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    public double getPaper() {
        return paper;
    }

    public void setPaper(double paper) {
        this.paper = paper;
    }

    public double getCirculation() {
        return circulation;
    }

    public void setCirculation(double circulation) {
        this.circulation = circulation;
    }

    public double getLetterSize() {
        return letterSize;
    }

    public void setLetterSize(double letterSize) {
        this.letterSize = letterSize;
    }

    public void printFullBook() {
        System.out.println(bookAuthor + " " + nameBook);
    }
}


