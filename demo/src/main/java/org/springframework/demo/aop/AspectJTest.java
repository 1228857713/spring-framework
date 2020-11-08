package org.springframework.demo.aop;

/**
 * Description:
 * Datetime:    2020/10/22   10:29 下午
 * Author:   王震
 */
public class AspectJTest implements Runnable{


	public static void main(String[] args) {
		AspectJTest aspectJTest = new AspectJTest();
		Thread thread = new Thread(new AspectJTest());
		thread.start();
	}
	public void test() {

	}

	@Override
	public void run() {
		System.out.println("hello world");
	}
}
