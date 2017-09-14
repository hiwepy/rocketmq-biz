package org.apache.rocketmq.client.biz.event.handler.chain;

import org.apache.rocketmq.client.biz.event.RocketmqEvent;

public interface HandlerChainResolver<T extends RocketmqEvent> {

	HandlerChain<T> getChain(T event , HandlerChain<T> originalChain);
	
}
