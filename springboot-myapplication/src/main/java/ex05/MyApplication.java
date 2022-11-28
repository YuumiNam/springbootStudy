package ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 *	Application Context가 구성된 이후(3번과정 이후),
 *	실행할 코드(Application Context 환경에 의존)가 있는 경우
 *	ApplicationRunner 인터페이스의 구현 클래스(HelloWorldRunner) Bean 사용하기
 * 
 */

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac =  SpringApplication.run(MyApplication.class, args)){}
		// ac.getBean(MyComponent.class).printHelloWorld(); 이런 방법도있지만, ApplicationRunner의 인터페이스를 구현한 Bean 사용가능
	}
}
