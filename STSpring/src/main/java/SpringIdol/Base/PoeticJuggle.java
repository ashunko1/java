package SpringIdol;

public class PoeticJuggle extends Juggler{
    private Poem poem;

    public PoeticJuggle(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggle(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perfom() {
        super.perfom();

        System.out.println("While reciting...");
        poem.recite();
    }
}
