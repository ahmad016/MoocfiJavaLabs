
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter counter = new Counter();

        System.out.println("Before any modification, value of counter: " + counter.value());

        counter.increase();
        counter.increase();
        System.out.println("Increase counter x2: " + counter.value());

        counter.decrease();
        System.out.println("Decrease counter: " + counter.value());

        counter.increase(10);
        System.out.println("Increase by 10: " + counter.value());

        counter.decrease(5);
        System.out.println("Decrease by 5: " + counter.value());


    }
}
