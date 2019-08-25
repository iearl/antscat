package pub.ants.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author magw
 * @version 1.0
 * @date 2019/8/25 上午8:27
 * @description: No Description
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        Service service = (Service)context.getBean("service"); // 获取远程服务代理
        String hello = service.sendMsg("hello world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
