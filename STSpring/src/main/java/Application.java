import SpringIdol.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//        Juggler jug = (Juggler)context.getBean("duke");
//        jug.perfom();
//
//        PoeticJuggle poeticJuggle = (PoeticJuggle)context.getBean("superDuke");
//        poeticJuggle.perfom();
//
//        StageSingleton stageSingleton = (StageSingleton)context.getBean("beanFromFactory");
//
//        Instrumentalist instrumentalist = (Instrumentalist)context.getBean("JaryInstrumentalist");
//        instrumentalist.perfom();
//
//        MultiInstrumentalist multiInstrumentalist = (MultiInstrumentalist)context.getBean("BobMultiBand");
//        multiInstrumentalist.perfom();

        CityInfo cityInfo = (CityInfo)context.getBean("finderCity");
        cityInfo.showInfo();

        //тест в develop
    }
}
