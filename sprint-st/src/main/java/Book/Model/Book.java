package Book.Model;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private Long id;
    private String name;
    private String author;

    public Book() {
        setBook(0L, "", "");
    }

    public Book(String name, String author) {
        setBook(0L, name, author);
    }

    public void setBook(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public  Long getId(){return id;}
    public String getName(){return name;}
    public String getAuthor(){return author;}

    public void setId(Long id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setAuthor(String author){this.author = author;}
}
