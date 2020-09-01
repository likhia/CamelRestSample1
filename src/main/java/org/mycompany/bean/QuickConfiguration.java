package org.mycompany.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")  
@RefreshScope
public class QuickConfiguration {

	private String header = "Prefix";

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	

	
}
