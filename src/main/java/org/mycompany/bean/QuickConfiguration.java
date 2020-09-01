package org.mycompany.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class QuickConfiguration {

	@Value("${app.header.message}")
	private String prefix = "Prefix";

	public String getPrefix() {
		return prefix;
	}

	public  void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	
}
