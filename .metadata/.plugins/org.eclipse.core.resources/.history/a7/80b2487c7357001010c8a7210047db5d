package org.hospital.configuration;

import org.apache.activemq.artemis.jms.client.ActiveMQConnection;
import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import jakarta.jms.ConnectionFactory;

@Configuration
public class ArtemisConfig {

	@Value("${spring.artemis.broker-url}")
	private String url;
	
//	app:
//		  patientQueue: patientQueue
//		  notificationQueue: notificationQueue
	@Value("${spring.artemis.password}")
	private String password;
	@Value("{spring.artemis.user}")
	private String user;
	
	@Bean
	ConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(url, user, password);
		
		return factory;
	}
	
	@Bean
	DefaultJmsListenerContainerFactory jmsContainerListenerFactory() {
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setConcurrency("3-5");
		factory.setConnectionFactory(connectionFactory());
		return factory;
	}
	
	@Bean
	MessageConverter messageConverter() {
		MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
		converter.setTargetType(MessageType.TEXT);
		converter.setTypeIdPropertyName("_myId");
		return converter;
	}
}
