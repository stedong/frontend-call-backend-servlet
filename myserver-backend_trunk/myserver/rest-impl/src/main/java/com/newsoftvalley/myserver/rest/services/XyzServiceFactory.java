package com.newsoftvalley.myserver.rest.services;

import com.newsoftvalley.myserver.rest.db.fake.XyzDaoImpl;

public class XyzServiceFactory {
    private static XyzService _xyzService;
    private static Object _lock = new Object();

    private XyzServiceFactory() {}

    public static XyzService createInstance() {
        if (_xyzService == null) {
            synchronized (_lock) {        // 只能有一个线程执行下面的代码
                if (_xyzService == null) {  // 我是不是被排队线程
                    _xyzService = new XyzService(new XyzDaoImpl());
                }
            }
        }
        return _xyzService;
    }
}
