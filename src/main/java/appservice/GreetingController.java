package appservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingHandler handler;
    
    @Autowired
    public GreetingController(GreetingHandler handler) {
    	this.handler = handler;
	}
    
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
            return handler.getGreeting(name);
    }
}