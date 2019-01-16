package SpringIdol;

public class Instrumentalist implements Perfomer{

    private Instruments instruments;
    private  String song;

    public Instrumentalist() {
    }

    @Override
    public void perfom() {
        System.out.println("Playing " + song + " : ");
        instruments.play();
    }

    public void setInstruments(Instruments instruments) {
        this.instruments = instruments;
    }

    public Instruments getInstruments() {
        return instruments;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
