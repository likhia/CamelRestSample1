package org.mycompany.bean;

import java.util.List;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;


@Component(value = "processor")
@Configuration
@RefreshScope
public class RestProcessor implements Processor {
	
	@Value("${app.header.message}")
	private String header = "Hello";

    public void process(Exchange exchange) throws Exception {
    	
    	OutputBean out = new OutputBean();
    	
        //Get input from exchange
    	InputBean inputParam = (InputBean) exchange.getIn().getBody(InputBean.class);
        
        out.setResult(header + " " + inputParam.getField1() + " " + inputParam.getField2() );
        //set output in exchange
        exchange.getOut().setBody(out);
    }

}
