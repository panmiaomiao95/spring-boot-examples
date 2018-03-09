package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActuatorApplication implements HealthIndicator {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
	}

	/**
	 * 自定义配置
	 * @return
	 */
	@Override
	public Health health() {
		return Health.up().withDetail("hello", "world").build();
	}
}
