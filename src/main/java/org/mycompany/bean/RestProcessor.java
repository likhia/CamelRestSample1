package org.mycompany.bean;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;

public class RestProcessor implements Processor {
	
	@Autowired
	QuickConfiguration config;

    public void process(Exchange exchange) throws Exception {
    	
    	OutputBean out = new OutputBean();
    	
        //Get input from exchange
    	InputBean inputParam = (InputBean) exchange.getIn().getBody(InputBean.class);
        
        out.setResult(config.getHeader() + " " + inputParam.getField1() + " " + inputParam.getField2() + " updated v1" );
        //set output in exchange
        exchange.getOut().setBody(out);
    }

}
