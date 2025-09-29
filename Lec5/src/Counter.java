public class Counter {
    int myCount = 0;
    static int ourCount = 0;
    void increment() {
        myCount++;
        ourCount++;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.increment();
        counter1.increment();
        counter2.increment();

        System.out.println("Counter 1: " + counter1.myCount + " " + counter1.ourCount); // static，应该是Counter.ourCount
    }
}
