package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.api.user.UserAPI;
import org.springframework.stereotype.Component;

/**
 * @author magw
 * @version 1.0
 * @date 2019/8/25 下午9:38
 * @description: No Description
 */
@Component
@Service(interfaceClass = UserAPI.class)
public class UserAPIImpl implements UserAPI {
    @Override
    public boolean login(String username, String password) {
        System.out.println("this is userservice,username="+username+", password="+password);
        return false;
    }
}
