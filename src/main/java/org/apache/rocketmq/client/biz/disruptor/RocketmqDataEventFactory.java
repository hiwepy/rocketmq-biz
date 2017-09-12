package org.apache.rocketmq.client.biz.disruptor;

import com.lmax.disruptor.EventFactory;
import org.apache.rocketmq.client.biz.event.RocketmqDisruptorEvent;

public class RocketmqDataEventFactory implements EventFactory<RocketmqDisruptorEvent> {

	@Override
	public RocketmqDisruptorEvent newInstance() {
		return new RocketmqDisruptorEvent(this);
	}
	
}
