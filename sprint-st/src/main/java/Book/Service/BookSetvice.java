package Book.Service;

import Book.Model.Book;
import Book.Respository.BookRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookSetvice {
    private final BookRespository bookRespository;

    @Autowired
    public  BookSetvice(BookRespository bookRespository){
        this.bookRespository = bookRespository;
    }

    public Book addBook(Book book){
        return bookRespository.save(book);
    }

    public Book deleteBook(Book book){
        return bookRespository.delete(book);
    }

    public Collection<Book> getBooks(){
       return bookRespository.getBooks();
    }
}