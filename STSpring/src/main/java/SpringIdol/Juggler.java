package SpringIdol;

public class Juggler implements Perfomer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perfom()  {
        System.out.println("Juggleng " + beanBags + " beanBags");
    }
}
