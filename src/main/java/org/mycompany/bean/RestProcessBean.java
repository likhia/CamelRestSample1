package org.mycompany.bean;

import org.apache.camel.Exchange;

import org.springframework.beans.factory.annotation.Autowired;

public class RestProcessBean {
	
	
	@Autowired
	QuickConfiguration config;

	public OutputBean process(Exchange exchange) throws Exception {
    	
    	OutputBean out = new OutputBean();
    	
        //Get input from exchange
    	InputBean inputParam = (InputBean) exchange.getIn().getBody(InputBean.class);
        
        out.setResult(config.getHeader() + " " + inputParam.getField1() + " " + inputParam.getField2() );
   
        
       return out;
    }

}
