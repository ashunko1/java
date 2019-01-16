import Book.Controller.BookController;
import Book.Respository.BookRespository;
import Book.Service.BookSetvice;
import Book.View.BookView;
import config.MyJavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext contex = new AnnotationConfigApplicationContext(MyJavaConfig.class);

        BookController bookController = contex.getBean(BookController.class);
        bookController.start();
    }
}
