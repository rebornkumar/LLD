package model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ParallelSubscriber implements Subscriber{

    private ExecutorService executorService;

    public ParallelSubscriber() {
        this.executorService = Executors.newFixedThreadPool(1);
    }
    @Override
    public void consume(String message) {
        executorService.submit(() -> {
            System.out.println("Processing Message: "+message);
            // Implement message processing logic here
        });
    }
}
