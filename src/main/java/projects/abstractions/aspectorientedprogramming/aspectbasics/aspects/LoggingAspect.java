package projects.abstractions.aspectorientedprogramming.aspectbasics.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class.getName());

    /***
     * Let’s take them one by one. The peculiar expression used as a parameter to the @Around annotation tells Spring which method calls to intercept.
     * Don’t be intimidated by this expression! This expression language is called AspectJ pointcut language, and you won’t need to learn it by heart to use it.
     * @param joinPoint
     * @throws Throwable
     */
    @Around("execution(* projects.abstractions.aspectorientedprogramming.service.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("method will execut");
        joinPoint.proceed();
        logger.info("Method executed");

    }
}
