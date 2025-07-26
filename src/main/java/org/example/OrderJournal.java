package org.example;

import com.lmax.disruptor.EventHandler;

public class OrderJournal implements EventHandler<OrderEvent> {
    @Override
    public void onEvent(OrderEvent event, long sequence, boolean endOfBatch) throws Exception {
        System.out.println("Journal: " + event);
    }
}
