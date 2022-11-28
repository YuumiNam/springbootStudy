package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * 	@SpringBootApplication	메타 어노테이션
 * 
 * 		+ @SpringBootConfiguration	비교) @Configuration -> ex01, ex02
 * 		+ @ComponentScan			비교) ex04	패키지의 하부 패키지 스캐닝을 한다
 * 		+ @EnableAutoConfiguration : 1. MVC, AOP, Security, JPA 등을 자동 "디폴트" 설정 (But, 미세설정은 필수!!)
 * 									 2. 발견된 Starter Dependency(Library) 기반으로 설정을 한다
 * 
 */

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac =  SpringApplication.run(MyApplication.class, args)){}
	}
}
