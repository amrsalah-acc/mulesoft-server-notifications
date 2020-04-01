package com.mule.runetime.interceptors.demo;

import org.mule.runtime.api.notification.MessageProcessorNotification;
import org.mule.runtime.api.notification.MessageProcessorNotificationListener;
import org.mule.runtime.core.api.context.notification.MuleContextNotification;

public class MuleMessageListener implements MessageProcessorNotificationListener<MessageProcessorNotification> {
	@Override
	public void onNotification(MessageProcessorNotification notification) {
			System.out.println("Message Listener :" + notification);
	}
}