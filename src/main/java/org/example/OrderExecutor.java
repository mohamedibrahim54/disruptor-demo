package org.example;

import com.lmax.disruptor.EventHandler;

public class OrderExecutor implements EventHandler<OrderEvent> {

    @Override
    public void onEvent(OrderEvent event, long sequence, boolean endOfBatch) throws Exception {
        if (event.isValid()){
            System.out.println("Executing OrderEvent: " + event);
        }
    }
}
