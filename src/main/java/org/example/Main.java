package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int maxInternal = 1000;
        int lengthOfBar = 50;
        ProgressBar pb = new ProgressBar(maxInternal, lengthOfBar);
        for (int i = 1; i <= maxInternal; i++) {
            pb.makeProgress(i);
        }
    }
}