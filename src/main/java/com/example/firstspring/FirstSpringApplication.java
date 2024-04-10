package com.example.firstspring;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class ThreadTrial extends Thread {
	public void run() {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable yourRunnable = () -> {
            // Your task logic here
            System.out.println("Task executed at " + System.currentTimeMillis());
        };
        scheduler.scheduleAtFixedRate(yourRunnable, 0, 10, TimeUnit.SECONDS);
	}
}

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
		ThreadTrial thr = new ThreadTrial();
		thr.start();
	}

}
