package org.example;

import java.io.Serializable;

public class ProgressBar implements Serializable {
    private int maxInternal;
    private int maxBarLength;
    private StringBuilder sb;
    public ProgressBar(int maxInternal, int maxBarLength) {
        this.maxInternal = maxInternal;
        this.maxBarLength = maxBarLength;
        this.sb = new StringBuilder();
        sb.append("[");
        for (int i = 1; i <= maxBarLength; i++) {
            sb.append("-");
        }
        sb.append("]");
    }
    public void makeProgress(int current) throws InterruptedException {
        StringBuilder tempSb = new StringBuilder(sb);
        int completed = (current * maxBarLength) / maxInternal;
        for (int j = 1; j <= completed; j++){
            tempSb.setCharAt(j, '=');
        }
        System.out.print("\r" + tempSb + " " + current + "/" + maxInternal);
        Thread.sleep(10);
    }
}
