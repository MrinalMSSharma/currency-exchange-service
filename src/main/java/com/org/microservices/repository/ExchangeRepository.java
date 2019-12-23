package com.org.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.microservices.bean.Exchange;

public interface ExchangeRepository extends JpaRepository<Exchange, Long> {

	Exchange findByFromAndTo(String from, String to);
}
