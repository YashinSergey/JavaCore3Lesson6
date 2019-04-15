package lesson.testing;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a / b;
    }
}
