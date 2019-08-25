package pub.ants.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import pub.ants.api.Service;

/**
 * @author magw
 * @version 1.0
 * @date 2019/8/25 下午4:07
 * @description: No Description
 */
@Component
public class HelloService {
    @Reference(url = "dubbo://localhost:20880")
    Service service;

    public String hello(String msg){
        return service.sendMsg(msg);
    }


}
