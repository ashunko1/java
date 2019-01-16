package SpringIdol;

public class StageSingleton {
    private StageSingleton(){
        System.out.println("Testing create bean from factory method");
    }

    private static class StageSingletonInstance {
        static StageSingleton instance = new StageSingleton();
    }

    public static StageSingleton getInstance(){
        return StageSingletonInstance.instance;
    }
}
