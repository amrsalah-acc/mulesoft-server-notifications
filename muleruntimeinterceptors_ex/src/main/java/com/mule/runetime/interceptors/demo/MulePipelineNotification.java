package com.mule.runetime.interceptors.demo;

import org.mule.runtime.api.metadata.TypedValue;
import org.mule.runtime.api.notification.PipelineMessageNotification;
import org.mule.runtime.api.notification.PipelineMessageNotificationListener;

public class MulePipelineNotification implements PipelineMessageNotificationListener<PipelineMessageNotification> {

	@Override
	public void onNotification(PipelineMessageNotification notification) {
		
		String transactionId = ((org.mule.extension.http.api.HttpRequestAttributes) notification.getEvent().getMessage().getAttributes().getValue()).getHeaders().get("x-transaction-id").toString();

		System.out.println("MulePipelineNotification :: Step :: ==> " + notification );
		System.out.println("MulePipelineNotification :: Header - Transaction-Id :: ==> " + transactionId );
	}
}
