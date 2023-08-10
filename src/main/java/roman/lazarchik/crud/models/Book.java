package roman.lazarchik.crud.models;

import javax.validation.constraints.*;

public class Book {
    private int id;
    @NotBlank(message = "Поле не должно быть пустым")
    @Size(min = 2, message = "Поле должно содержать минимум 2 символа")
    private String title;
    @NotBlank(message = "Поле не должно быть пустым")
    @Size(min = 2, message = "Поле должно содержать минимум 2 символа")
    private String author;
    @Min(value = 1500, message = "Год должен быть больше, чем 1500")
    private int year;

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
