package com.in28minutes.microservices.api_gateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
@Component
public class LoggingFilter implements GlobalFilter {

	private Logger logger = LoggerFactory.getLogger(LoggingFilter.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

		// PRE-FILTER LOGIC: Executes before the request is routed
		logger.info("Path of the request received -> {}", exchange.getRequest().getPath());
		
		// Let the request continue through the chain
		return chain.filter(exchange);
	}
}
