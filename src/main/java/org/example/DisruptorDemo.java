package org.example;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import com.lmax.disruptor.util.DaemonThreadFactory;

import java.util.UUID;

public class DisruptorDemo
{

    public static void translate(OrderEvent orderEvent, long sequence) {
        if(sequence % 2 == 0){
            orderEvent.setId(UUID.randomUUID().toString());
        }
        orderEvent.setEventType(OrderEvent.EventType.NEW);
    }
    
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "** Disruptor Demo **" );

        int ringBufferSize = 1024;
        Disruptor<OrderEvent> disruptor = new Disruptor<>(OrderEvent::new,
                ringBufferSize, DaemonThreadFactory.INSTANCE,
        ProducerType.SINGLE, new BlockingWaitStrategy());
        disruptor.handleEventsWith(new OrderValidator(), new OrderJournal()).then(new OrderExecutor());
        disruptor.start();

        RingBuffer<OrderEvent> ringBuffer = disruptor.getRingBuffer();

        for (int i = 0; i < 10; i++) {
            ringBuffer.publishEvent(DisruptorDemo::translate);
        }

        Thread.sleep(1000);
    }
}
