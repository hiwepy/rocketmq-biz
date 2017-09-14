package org.apache.rocketmq.client.biz.event.handler;

import org.apache.rocketmq.client.biz.event.RocketmqEvent;

/**
 * 给Handler设置路径
 */
public interface PathProcessor<T extends RocketmqEvent> {
	
	EventHandler<T> processPath(String path);

}
