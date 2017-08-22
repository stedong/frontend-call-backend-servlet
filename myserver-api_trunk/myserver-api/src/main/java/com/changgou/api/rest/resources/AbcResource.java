package com.changgou.api.rest.resources;

import com.linkedin.r2.RemoteInvocationException;
import nam.e.spa.ce.Abc;

/**
 * Created by hanyuandong on 2017/8/21.
 */
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import com.changgou.api.rest.R2Client.AbcClient;
import com.changgou.api.rest.services.AbcService;
import com.changgou.api.rest.services.AbcServiceFactory;
import nam.e.spa.ce.Abc;

@RestLiCollection(name = "abc", namespace = "nam.e.spa.ce")
public class AbcResource extends CollectionResourceTemplate<String, Abc> {

    //private AbcService _abcService = new AbcService(new AbcDaoImpl());
    private AbcService _abcService = AbcServiceFactory.createInstance();

    @Override
    public Abc get(String longUrl) {
        Abc res = new Abc();
        try {
            res =  _abcService.get(longUrl);
        } catch (RemoteInvocationException e) {
            e.printStackTrace();
        }
        return res;
    }
}

