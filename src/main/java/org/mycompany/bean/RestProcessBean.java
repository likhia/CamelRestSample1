package org.mycompany.bean;

import org.apache.camel.Exchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;


@Configuration
@RefreshScope
public class RestProcessBean {
	
	@Value("${app.header.message}")
	private String header = "header";

	@Autowired
	QuickConfiguration config;

	public OutputBean process(Exchange exchange) throws Exception {
    	
    	OutputBean out = new OutputBean();
    	
        //Get input from exchange
    	InputBean inputParam = (InputBean) exchange.getIn().getBody(InputBean.class);
        
        out.setResult(header + " " + inputParam.getField1() + " " + inputParam.getField2() );
        
        
       return out;
    }

}
