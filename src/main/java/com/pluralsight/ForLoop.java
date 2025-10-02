package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        for (int i = 10; i > -1; i--) {
            System.out.println("Countdown: " +i);
            Thread.sleep(1000);
        }
        //After loop ends
        System.out.println("Launch!!");
    }
}
