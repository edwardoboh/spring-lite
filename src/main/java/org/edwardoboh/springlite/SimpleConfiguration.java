package org.edwardoboh.springlite;

import org.apache.catalina.LifecycleException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@Conditional(RunServerCondition.class)
public class SimpleConfiguration {
    @Bean
    @PostConstruct
    public SimpleServer simpleServer() throws LifecycleException {
        SimpleServer ss = new SimpleServer();
        ss.run();
        return ss;
    }
}
