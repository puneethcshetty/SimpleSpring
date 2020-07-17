package simple.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Before Context Initialization");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("After Context Initialization");
        HelloWorld hello1 = context.getBean(HelloWorld.class);
        hello1.sayHello();

        HelloWorld hello2 = context.getBean(HelloWorld.class);
        hello2.sayHello();

        //Both should be same bcz of singleton
        System.out.println(hello1==hello2);

        context.close();
    }

}
