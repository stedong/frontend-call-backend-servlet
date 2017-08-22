package com.newsoftvalley.myserver.rest.db;

import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;

public interface XyzDao {
    Xyz get(XyzKey xyzKey);

    void insert(Xyz xyz);

    void update(XyzKey key, Xyz xyz);

    void delete(XyzKey key);
}
