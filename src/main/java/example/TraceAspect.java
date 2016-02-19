package example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TraceAspect {
    @Around("execution( * example.Greeter.sayHello(..) )")
    public Object trace(ProceedingJoinPoint jp) throws Throwable {
        System.out.println(jp);
        return jp.proceed();
    }
}
