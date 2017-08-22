package com.newsoftvalley.myserver.rest.services;

import com.linkedin.restli.common.HttpStatus;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;
import com.newsoftvalley.myserver.rest.db.XyzDao;
import com.newsoftvalley.myserver.rest.db.fake.XyzDaoImpl;
import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;

public class XyzService {
    private XyzDao _xyzDao;
    public XyzService(XyzDao xyzDao) {
        _xyzDao = xyzDao;
    }

    public Xyz get(XyzKey xyzKey) {
        Xyz xyz = _xyzDao.get(xyzKey);
        if (xyz == null) {
            xyz = calculateXyz(xyzKey);
        }
        return xyz;
    }

    private Xyz calculateXyz(XyzKey xyzKey) {
        Xyz xyz = new Xyz()
                .setNumA(xyzKey.getNumA())
                .setNumB(xyzKey.getNumB())
                .setSum(xyzKey.getNumA() + xyzKey.getNumB());
        return xyz;
    }

    public CreateResponse create(Xyz xyz) {
        _xyzDao.insert(xyz);
        return new CreateResponse(HttpStatus.S_201_CREATED);
    }

    public UpdateResponse update(XyzKey key, Xyz xyz) {
        _xyzDao.update(key, xyz);
        return new UpdateResponse(HttpStatus.S_200_OK);
    }

    public UpdateResponse delete(XyzKey key) {
        _xyzDao.delete(key);
        return new UpdateResponse(HttpStatus.S_200_OK);
    }
}
