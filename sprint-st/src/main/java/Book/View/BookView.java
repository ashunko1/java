package Book.View;

import Book.Model.Book;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookView {
    private final String actions = "1 - add book\n2 - delete book\n3 - show books list\n4 - exit\n\n";

    public void UpdateAddBook(Book book){
        String content = book != null ? String.format("The book \"%s\" added", book.getName()) : String.format("The book not added");
        UpdateContent(content);
        System.out.println();
    }

    public void UpdateDeleteBook(Book book){
        String content = book != null ? String.format("The book \"%s\" deleted", book.getName()): String.format("The book not deleted");
        UpdateContent(content);
        System.out.println();
    }

    public void UpdateShowBooks(Collection<Book> bookCollection){
        String content = "";

        if(bookCollection.isEmpty())
            content = "THE LIBRARY IS EMPTY";
        else
            for (Book book2 : bookCollection) {
                content = content + "id: " + book2.getId().toString() + " name: " + book2.getName() + " author: " + book2.getAuthor() + "\n";
            }

        UpdateContent(content);
        System.out.println();
    }

    public void UpdateContent(String content){
        System.out.println(content);
    }

    public void UpdateActions(){
        System.out.println(actions);
    }
}
