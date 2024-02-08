package com.spring.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
//currency-service.url
//currency-service.username
//currency-service.key


@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {
	public String url;
	public String username;
	public String key;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
}
