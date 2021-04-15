package com.fate.wiki.config;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
//ComponentScan({"com.fate","com.test"})//scan multiple packages
@ComponentScan("com.fate")
@SpringBootApplication
public class WikiApplication {

	//private static final Logger LOG = (Logger) LoggerFactory.getLogger(WikiApplication.class);
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(WikiApplication.class);
		Environment env = app.run(args).getEnvironment();
//		SpringApplication app = new SpringApplication(WikiApplication.class);
//		Environment env = app.run(args).getEnvironment();
//		LOG.info("start successfully!");
//		LOG.info("address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
