package com.stylefeng.guns.api.user;

/**
 * @author magw
 * @version 1.0
 * @date 2019/8/25 下午9:47
 * @description: No Description
 */
public interface UserAPI {
    //登录
    int login(String username, String password);
    //注册
    boolean register(UserModel userModel);
    //查询用户名
    boolean checkUsername(String username);
    //查询用户信息
    UserInfoModel getUserInfo(String uuid);
    //修改用户信息
    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);

}
