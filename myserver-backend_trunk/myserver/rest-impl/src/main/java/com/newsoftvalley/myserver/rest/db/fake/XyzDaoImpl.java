package com.newsoftvalley.myserver.rest.db.fake;

import com.newsoftvalley.myserver.rest.db.XyzDao;
import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;

import java.util.HashMap;
import java.util.Map;

public class XyzDaoImpl implements XyzDao {
    private Map<String, Xyz> _dataBase;
    public XyzDaoImpl() {
        _dataBase = new HashMap<>();
    }

    @Override
    public Xyz get(XyzKey xyzKey) {
        String stringKey = xyzKey.getNumA() + "_" + xyzKey.getNumB();
        return _dataBase.get(stringKey);
    }

    @Override
    public void insert(Xyz xyz) {
        String stringKey = xyz.getNumA() + "_" + xyz.getNumB();
        _dataBase.put(stringKey, xyz);
    }

    @Override
    public void update(XyzKey key, Xyz xyz) {
        String stringKey = key.getNumA() + "_" + key.getNumB();
        _dataBase.put(stringKey, xyz);
    }

    @Override
    public void delete(XyzKey key) {
        String stringKey = key.getNumA() + "_" + key.getNumB();
        _dataBase.remove(stringKey);
    }
}

