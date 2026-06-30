import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task = () -> "Task Completed";

        Future<String> result1 = executor.submit(task);
        Future<String> result2 = executor.submit(task);

        System.out.println(result1.get());
        System.out.println(result2.get());

        executor.shutdown();
    }
}
