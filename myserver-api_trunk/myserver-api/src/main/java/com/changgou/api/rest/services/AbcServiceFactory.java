package com.changgou.api.rest.services;

/**
 * Created by hanyuandong on 2017/8/21.
 */
import com.changgou.api.rest.R2Client.AbcClient;


public class AbcServiceFactory {
    private static AbcService _abcService;
    private static Object _lock = new Object();

    private AbcServiceFactory() {}

    public static AbcService createInstance() {
        if (_abcService == null) {
            synchronized (_lock) {        // 只能有一个线程执行下面的代码
                if (_abcService == null) {  // 我是不是被排队线程
                    _abcService = new AbcService();
                }
            }
        }
        return _abcService;
    }
}
