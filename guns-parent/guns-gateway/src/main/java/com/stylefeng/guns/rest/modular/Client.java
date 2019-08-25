package com.stylefeng.guns.rest.modular;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.api.user.UserAPI;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author magw
 * @version 1.0
 * @date 2019/8/25 下午10:08
 * @description: No Description
 */
@RestController
public class Client {
    @Reference
    private UserAPI userAPI;

    public boolean login(String username,String password){
        return  userAPI.login(username,password);

    }
}
