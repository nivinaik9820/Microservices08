package com.org.act.advice;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect 
@Configuration


public class BeforeAdvice {
	@Before("execution(* com.org.act.*.add(..))")
	
	public void allDaoAddMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted method: "+ joinPoint);
		System.out.println("Arfguments :"+joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());

		
	}
@Before("execution(* com.org.act.*.*(..))")
	
	public void allDaoAnyMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted method: "+ joinPoint);
		System.out.println("Arguments: "+ joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
		
	}

	private Object getTarget() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
