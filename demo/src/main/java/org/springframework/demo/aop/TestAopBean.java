package org.springframework.demo.aop;

/**
 * Description:
 * Datetime:    2020/10/22   10:28 下午
 * Author:   王震
 */
public class TestAopBean {
	private String testStr = "testStr";

	//@Pointcut("execution(* *.testAop(..))")
	public void testAop() {
		//System.in;
		// 被拦截的方法，简单打印
		System.out.println("I am the true aop bean");
	}

	public static void main(String[] args) {
		String s1 = "fsdfadsf";
		String substr = s1.substring(0,3);
	}
}
