package org.example;

import com.lmax.disruptor.EventHandler;

public class OrderValidator implements EventHandler<OrderEvent> {

    @Override
    public void onEvent(OrderEvent event, long sequence, boolean endOfBatch) throws Exception {
        event.setValid(event.getId() != null && !event.getId().isBlank());

        System.out.println("Validating OrderEvent: " + event );
    }
}
