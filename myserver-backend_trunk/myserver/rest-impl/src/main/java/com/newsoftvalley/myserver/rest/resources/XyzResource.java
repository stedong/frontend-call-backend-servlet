package com.newsoftvalley.myserver.rest.resources;

import com.linkedin.restli.common.ComplexResourceKey;
import com.linkedin.restli.common.EmptyRecord;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.ComplexKeyResourceTemplate;
import com.newsoftvalley.myserver.rest.services.XyzService;
import com.newsoftvalley.myserver.rest.services.XyzServiceFactory;
import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;

@RestLiCollection(name = "xyz", namespace = "nam.e.spa.ce")
public class XyzResource extends ComplexKeyResourceTemplate<XyzKey, EmptyRecord, Xyz> {
    private XyzService _xyzService = XyzServiceFactory.createInstance();

    @Override
    public Xyz get(ComplexResourceKey<XyzKey, EmptyRecord> complexKey) {
        // code goes here
        //complexKey.g
        return _xyzService.get(complexKey.getKey());
    }

    @Override
    public CreateResponse create(Xyz xyz) {
        return _xyzService.create(xyz);
    }

    @Override
    public UpdateResponse update(final ComplexResourceKey<XyzKey, EmptyRecord> complexKey,
                                 final Xyz xyz) {
        return _xyzService.update(complexKey.getKey(), xyz);
    }

    @Override
    public UpdateResponse delete(final ComplexResourceKey<XyzKey, EmptyRecord> complexKey) {
        return _xyzService.delete(complexKey.getKey());
    }
}