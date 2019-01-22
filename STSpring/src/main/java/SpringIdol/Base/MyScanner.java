package SpringIdol;

import java.util.Scanner;

public class MyScanner {
    private Scanner scan;

    private MyScanner(){
        scan = new Scanner(System.in);
    }

    private static class MyScannerInstance {
        static MyScanner instance = new MyScanner();
    }

    public static MyScanner getInstance(){
        return MyScannerInstance.instance;
    }

    public Scanner getScan() {
        System.out.println("Please enter number city: ");
        return scan;
    }
}