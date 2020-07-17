package simple.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HelloWorld {

    public HelloWorld(){
        System.out.println("Hello world Constructor");
    }

    public void sayHello(){
        System.out.println("Hello world from Spring Application");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Inside postConstruct");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Inside cleanUp!!");
    }
}
