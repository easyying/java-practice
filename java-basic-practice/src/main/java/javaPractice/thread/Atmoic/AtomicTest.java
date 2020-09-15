package javaPractice.thread.Atmoic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger();
        count.incrementAndGet();
    }

}
