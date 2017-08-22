package com.changgou.api.rest.services;

import com.changgou.api.rest.R2Client.AbcClient;
import com.linkedin.r2.RemoteInvocationException;
import nam.e.spa.ce.Abc;

/**
 * Created by hanyuandong on 2017/8/21.
 */
public class AbcService {
    private AbcClient abcClient = new AbcClient();
    public Abc get(String longUrl) throws RemoteInvocationException {
        return abcClient.get(longUrl);
    }
}
