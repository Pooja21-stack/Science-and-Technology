package com.sci.technology.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.google.common.net.HttpHeaders;

@Configuration
@ConfigurationProperties(prefix = "application.jwt")
public class JwtConfig {
	 private String secretKey;
	    private String tokenPrefix;
	    private Integer tokenExpirationAfterHours;

	    public void JwtConfig() {
	    }

	    public String getSecretKey() {
	        return secretKey;
	    }

	    public void setSecretKey(String secretKey) {
	        this.secretKey = secretKey;
	    }

	    public String getTokenPrefix() {
	        return tokenPrefix;
	    }

	    public void setTokenPrefix(String tokenPrefix) {
	        this.tokenPrefix = tokenPrefix;
	    }

	    public Integer getTokenExpirationAfterHours() {
	        return tokenExpirationAfterHours;
	    }

	    public void setTokenExpirationAfterHours(Integer tokenExpirationAfterHours) {
	        this.tokenExpirationAfterHours = tokenExpirationAfterHours;
	    }


	    public String getAuthorizationHeader() {
	        return HttpHeaders.AUTHORIZATION;
	    }
}
