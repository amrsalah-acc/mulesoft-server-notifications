package com.mule.runetime.interceptors.demo;

import org.mule.runtime.api.notification.FlowConstructNotification;
import org.mule.runtime.api.notification.FlowConstructNotificationListener;
import org.mule.runtime.api.notification.Notification;

public class FlowConstructionListener implements FlowConstructNotificationListener<FlowConstructNotification> {

	@Override
	public void onNotification(FlowConstructNotification notification) {
		System.out.println("FlowConstructNotification  :: Step :: ==> " +  notification)	;
		
	}

	

}
