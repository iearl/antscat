package pub.ants.provider;

import org.springframework.stereotype.Component;
import pub.ants.api.Service;

/**
 * @author magw
 * @version 1.0
 * @date 2019/8/25 下午4:01
 * @description: No Description
 */
@Component
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = Service.class)
public class ServiceAPI implements Service {
    @Override
    public String sendMsg(String msg) {
        return "springboot dubbo "+msg;
    }
}
