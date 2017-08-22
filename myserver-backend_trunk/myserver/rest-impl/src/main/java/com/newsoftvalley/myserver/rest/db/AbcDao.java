package com.newsoftvalley.myserver.rest.db;

import nam.e.spa.ce.Abc;

public interface AbcDao {
    Abc get(String longUrl);
    void insert(Abc abc);
    //void delete(Abc abc)

    void delete(String longUrl);

    void update(String longUrl, Abc abc);
}
