package com.guoliang.test.service.Impl;

/**
 * @program:
 * @description:
 * @author: guoliang
 * @create: 2021/10/15 13:30
 */


public interface UserServiceImpl {

    default String get1() {
        return "default1";
    }

    default String get2() {
        return "default2";
    }
}
