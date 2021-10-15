package com.guoliang.test.service;

import com.guoliang.test.service.Impl.UserServiceImpl;

/**
 * @program:
 * @description:
 * @author: guoliang
 * @create: 2021/10/15 13:28
 */


public class UserService implements UserServiceImpl {

    @Override
    public String get1() {
        return "new1";
    }

    @Override
    public String get2() {
        return UserServiceImpl.super.get2();
    }
}
