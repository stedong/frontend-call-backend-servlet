package com.newsoftvalley.myserver.rest.resources;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import com.newsoftvalley.myserver.rest.db.fake.AbcDaoImpl;
import com.newsoftvalley.myserver.rest.services.AbcService;
import com.newsoftvalley.myserver.rest.services.AbcServiceFactory;
import nam.e.spa.ce.Abc;
//在backend 定义，curl command 时候用到的／abc就是这
@RestLiCollection(name = "abc", namespace = "nam.e.spa.ce")
public class AbcResource extends CollectionResourceTemplate<String, Abc> {

    //private AbcService _abcService = new AbcService(new AbcDaoImpl());
    private AbcService _abcService = AbcServiceFactory.createInstance();

    @Override
    public Abc get(String longUrl) {
        return _abcService.get(longUrl);
    }

    @Override
    public CreateResponse create(Abc abc) {
        return _abcService.create(abc);
    }

    @Override
    public UpdateResponse delete(String longUrl) {
        return _abcService.delete(longUrl);
    }

    @Override
    public UpdateResponse update(String longUrl, Abc abc) {
        return _abcService.update(longUrl, abc);
    }
}
