package mineffortdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class MyLogger {

    @Before("execution(public void describe())")
    public void log(){
        System.out.println("Person object description begins");
    }

    @After("execution(public void describe())")
    public void logAfter() {
        System.out.println("end of description");
    }
}
