package pub.ants.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootDubboConsumerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringbootDubboConsumerApplication.class, args);
        HelloService helloService = (HelloService)run.getBean("helloService");
        String hello = helloService.hello("hello world");
        System.out.println(hello);


    }

}
