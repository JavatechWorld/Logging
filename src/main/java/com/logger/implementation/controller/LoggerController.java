package com.logger.implementation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {
	
	Logger logger = LoggerFactory.getLogger(LoggerController.class);
	
	@RequestMapping("/log")
	public String logStatements() {
		
		logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
		
		return "Loggers printed above";
	}

}
