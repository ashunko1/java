package Book.Controller;

import Book.Example.ConditionSimple;
import Book.Model.Book;
import Book.Service.BookSetvice;
import Book.View.BookView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@Component
@Conditional(ConditionSimple.class)
public class BookController {
    public static Scanner in = new Scanner(System.in);
    private final BookSetvice bookSetvice;
    private final BookView bookView;

    @Autowired
    public BookController(BookSetvice bookSetvice, BookView bookView){
        this.bookSetvice = bookSetvice;
        this.bookView = bookView;
    }

    @PostConstruct
    public void init(){
        bookSetvice.addBook(new Book("C++ Qt developer", "Shunko A.G."));
        bookSetvice.addBook(new Book("Java Spring Framework developer", "Jhon T. Miller"));
        bookSetvice.addBook(new Book("This is magic", "David Copperfield"));
    }

    public void start(){
        while (true) {

            bookView.UpdateActions();

            Integer action = 0;

            try {
                action = Integer.parseInt(in.nextLine());
            }
            catch (Throwable e) {
                action = 0;
            }

            switch (action) {
                case 1:
                    bookView.UpdateContent("name: ");
                    String name = in.nextLine();
                    bookView.UpdateContent("author: ");
                    String author = in.nextLine();

                    Book book = new Book(name, author);
                    bookView.UpdateAddBook(bookSetvice.addBook(book));

                    break;
                case 2: {
                    Book book1 = new Book();
                    bookView.UpdateContent("id: ");
                    book1.setId(Long.parseLong(in.nextLine()));

                    bookView.UpdateDeleteBook(bookSetvice.deleteBook(book1));
                }
                break;
                case 3: {
                    bookView.UpdateShowBooks(bookSetvice.getBooks());
                }
                break;
                case 4: {
                    bookView.UpdateContent("quit this app? y/n");
                    if (in.nextLine().compareToIgnoreCase("y") == 0){
                        bookView.UpdateContent("BYE BYE ...");
                        System.exit(0);
                    }

                }
                    break;
                default:
                    break;
            }
        }
    }

}
