package org.springframework.demo.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Description:
 * Datetime:    2020/11/3   9:40 下午
 * Author:   王震
 */
@Aspect
public class NotVeryUsefulAspect {
	@Pointcut("execution(* transfer(..))") // the pointcut expression
	private void anyOldTransfer() {}
}
