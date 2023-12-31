package ch03.sub3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("log")
public class LogAdvice {

	@Pointcut("execution(void ch03.sub3.Service.insert(..))")
	public void insertPointcut() {} // 내용이 없는 참조 메서드
	
	
	@Pointcut("execution(void ch03.sub3.Service.insert(..))")
	public void selectPointcut() {} // 내용이 없는 참조 메서드
	
	
	@Pointcut("execution(void ch03.sub3.Service.insert(..))")
	public void updatePointcut() {} // 내용이 없는 참조 메서드
	
	
	@Pointcut("execution(void ch03.sub3.Service.insert(..))")
	public void deletePointcut() {} // 내용이 없는 참조 메서드
	
	@Before("insertPointcut() || selectPointcut() || updatePointcut() || ")
	public void beforeLog() {
		System.out.println("----------------------------");
		System.out.println("cross-cutting - beforeLog...");
	}
	
	@After("insertPointcut() || selectPointcut()")
	public void afterLog() {
		System.out.println("cross-cutting - afterLog...");
		System.out.println("----------------------------");
	}
}