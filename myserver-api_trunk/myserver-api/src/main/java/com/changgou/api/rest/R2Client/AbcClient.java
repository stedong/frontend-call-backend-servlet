package com.changgou.api.rest.R2Client;

import com.linkedin.r2.RemoteInvocationException;
import com.linkedin.r2.transport.common.bridge.client.TransportClientAdapter;
import com.linkedin.r2.transport.http.client.HttpClientFactory;
import com.linkedin.restli.client.GetRequest;
import com.linkedin.restli.client.RestClient;
import nam.e.spa.ce.Abc;
import nam.e.spa.ce.AbcRequestBuilders;

import java.util.Collections;

public class AbcClient {
    HttpClientFactory http;
    TransportClientAdapter r2Client;
    RestClient _restClient;
    public AbcClient() {
        http = new HttpClientFactory();
        r2Client = new TransportClientAdapter(
                http.getClient(Collections.<String, String>emptyMap()));
        _restClient = new RestClient(r2Client, "http://localhost:7077/myserver-backend/");

    }


    public Abc get(String longUrl) throws RemoteInvocationException {
        GetRequest<Abc> request = new AbcRequestBuilders()
                .get()
                .id(longUrl)
                .build();
        Abc abc = _restClient.sendRequest(request).getResponse().getEntity();
        return abc;
    }
}
