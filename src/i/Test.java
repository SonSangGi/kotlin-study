package i;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.run();
    }

    static class MyThread implements Runnable {

        @Override
        public void run() {
        }
    }
}
