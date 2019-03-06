package com.pipibing.handson;

import com.pipibing.handson.impl.StudentServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class HandsonApplication {
	@Autowired(required = true)
	private Bus bus;

	public static void main(String[] args) {
		SpringApplication.run(HandsonApplication.class, args);
	}


	@Bean
	public Server rsServer() {
		JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
		endpoint.setBus(bus);
		endpoint.setServiceBeans(Arrays.<Object>asList(new StudentServiceImpl()));
		endpoint.setAddress("/");
//		endpoint.setFeatures(Arrays.asList(createOpenApiFeature(), new LoggingFeature()));
		return endpoint.create();
	}
}
