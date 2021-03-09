package Task5;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Runner runner = new Runner();

        try {
            runner.halt();
        }
        catch (RuntimeException exception) {
            System.out.println("halt");
        }
    }
}
