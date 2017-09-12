package org.apache.rocketmq.client.biz.handler;

import org.apache.rocketmq.client.biz.event.RocketmqEvent;

public abstract class AbstractNameableMessageHandler<T extends RocketmqEvent> implements EventHandler<T>, Nameable {

	/**
	 * 过滤器名称
	 */
	protected String name;

	protected String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
