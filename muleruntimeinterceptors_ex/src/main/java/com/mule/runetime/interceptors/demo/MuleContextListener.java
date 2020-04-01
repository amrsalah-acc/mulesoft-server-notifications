package com.mule.runetime.interceptors.demo;

import org.mule.runtime.core.api.context.notification.MuleContextNotification;
import org.mule.runtime.core.api.context.notification.MuleContextNotificationListener;

public class MuleContextListener implements MuleContextNotificationListener<MuleContextNotification> {

	

	
	@Override
	public void onNotification(MuleContextNotification muleContext) {
		System.out.println("Mule Context :" + muleContext);
		
	}
	

}
