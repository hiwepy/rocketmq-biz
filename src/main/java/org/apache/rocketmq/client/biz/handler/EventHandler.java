package org.apache.rocketmq.client.biz.handler;

import org.apache.rocketmq.client.biz.event.RocketmqEvent;
import org.apache.rocketmq.client.biz.handler.chain.HandlerChain;

/**
 */
public interface EventHandler<T extends RocketmqEvent> {

	public void doHandler(T event, HandlerChain<T> handlerChain) throws Exception;
	
}
