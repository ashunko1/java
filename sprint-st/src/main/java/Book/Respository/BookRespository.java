package Book.Respository;

import Book.Model.Book;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class BookRespository {
    private static Long idInc = 0L;
    private final Map<Long, Book> cache = new HashMap<>();

    public Book save(Book book){
        idInc++;

        book.setId(idInc);
        cache.put(book.getId(), book);

        return  book;
    }

    public Book delete(Book book){
        Book delBook = cache.remove(book.getId());
        if(delBook != null) idInc--;

        return delBook;
    }

    public Collection<Book> getBooks(){
        return cache.values();
    }
}