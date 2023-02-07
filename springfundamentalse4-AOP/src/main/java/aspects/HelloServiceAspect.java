package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

//    @Before("execution(* services.HelloService.hello(..))")
//    public void before(){
//        System.out.println("A running with @Before");
//    }
//
//    @After("execution(* services.HelloService.hello(..))")
//    public void after() {
//        System.out.println("A running with @After");
//    }
//
//    @AfterReturning("execution(* services.HelloService.hello(..))")
//    public void afterReturning() {
//        System.out.println("A running with @AfterRunning");
//    }
//
//    @AfterThrowing("execution(* services.HelloService.hello(..))")
//    public void afterThrowing() {
//        System.out.println("A running with @AfterThrowing");
//    }

    @Around("execution(* services.HelloService.hello(..))")
    public Object around(ProceedingJoinPoint joinPoint){
//        System.out.println("Something else!!!");
//        return "Something else :)";
        System.out.println("A");
        Object result = null;
        try {
            result = joinPoint.proceed(new Object[]{"Bill"});
            System.out.println("After joint point");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }

}
