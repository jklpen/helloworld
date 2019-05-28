package ming.cloud.helloworld.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import ming.cloud.helloworld.service.cloud.HelloFeign;

@Slf4j
@RestController
public class HelloworldController {
    
    @Value("${spring.application.name}")
    private String applicationName;
    
    private final HelloFeign helloFeign;
    
    @Autowired
    public HelloworldController(HelloFeign helloFeign) {
        this.helloFeign = helloFeign;
    }
    
    @RequestMapping("/")
    public String index() {
        return "welcome to " + applicationName;
    }
    
    @RequestMapping("/cloud")
    public String hello() {
        
        ;
log.info(helloFeign.roll(10).toString());
        
log.info(helloFeign.hello().toString());

        
        return "hello anonymize";
    }
    
    
    
}