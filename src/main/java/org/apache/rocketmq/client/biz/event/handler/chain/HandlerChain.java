package org.apache.rocketmq.client.biz.event.handler.chain;

import org.apache.rocketmq.client.biz.event.RocketmqEvent;

public interface HandlerChain<T extends RocketmqEvent>{

	void doHandler(T event) throws Exception;
	
}
