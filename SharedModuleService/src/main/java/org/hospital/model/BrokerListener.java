package org.hospital.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import lombok.Data;

//spring:
//	  artemis:
//	    broker-url: tcp://0.0.0.0:61616 
//	    mode: native
//	    password: admin
//	    user: admin 
//	#app mode
//
//	app:
//	  patient-Queue: patientQueue
//	  notification-Queue: notificationQueue

public class BrokerListener {

	
	public static final String patientQueue = "patientQueue"; 
	
	public static final String notificationQueue = "notificationQueue";
	
	
	
//	public static String getPatientQueue() {
//		return patientQueue;
//	}
//	
//	public static String getnotificationQueue() {
//		return notificationQueue;
//	}
}
