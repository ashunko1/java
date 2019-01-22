package SpringIdol;

import java.util.Collections;
import java.util.Map;

public class MultiInstrumentalist implements Perfomer{

    private Map<String, Instruments> instrumentsMap;

    public void setInstrumentsMap(Map<String, Instruments> instrumentsMap) {
        this.instrumentsMap = instrumentsMap;
    }

    public Map<String, Instruments> getInstrumentsMap() {
        return instrumentsMap;
    }

    public MultiInstrumentalist() {
    }

    @Override
    public void perfom() {
        instrumentsMap.forEach((key, value)->{
            System.out.println("Played instrument " + key + " : ");
            value.play();
        });

    }
}

