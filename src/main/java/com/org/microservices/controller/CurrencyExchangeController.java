package com.org.microservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.org.microservices.bean.Exchange;
import com.org.microservices.repository.ExchangeRepository;

@RestController
public class CurrencyExchangeController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ExchangeRepository exchangeRepository; 

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public Exchange retreiveExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		Exchange exchangeValue = exchangeRepository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		logger.info("{}" + exchangeValue);
		return exchangeValue;
	}
}