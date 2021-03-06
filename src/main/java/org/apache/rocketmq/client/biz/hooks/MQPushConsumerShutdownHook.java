package org.apache.rocketmq.client.biz.hooks;

import org.apache.rocketmq.client.consumer.MQPushConsumer;

public class MQPushConsumerShutdownHook extends Thread{
	
	private MQPushConsumer consumer;
	
	public MQPushConsumerShutdownHook(MQPushConsumer consumer) {
		this.consumer = consumer;
	}
	
	@Override
	public void run() {
		consumer.shutdown();
	}
	
}
