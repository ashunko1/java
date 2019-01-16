import SpringIdol.Juggler;
import SpringIdol.PoeticJuggle;
import SpringIdol.StageSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Juggler jug = (Juggler)context.getBean("duke");
        jug.perfom();

        PoeticJuggle poeticJuggle = (PoeticJuggle)context.getBean("superDuke");
        poeticJuggle.perfom();

        StageSingleton stageSingleton = (StageSingleton)context.getBean("beanFromFactory");
    }
}
