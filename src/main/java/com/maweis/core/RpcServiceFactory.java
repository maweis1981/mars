package com.maweis.core;

import org.springframework.stereotype.Service;

/**
 * Created by peter on 12/19/13.
 */
public class RpcServiceFactory {

    private static RpcServiceFactory factory;

    public static final String RPC_SERVICE_PROPERTY = "";


    protected RpcServiceFactory(){

    }

    public static synchronized RpcServiceFactory newInstance(){
        if (factory == null){
            factory = new RpcServiceFactory();
        }
        return factory;
    }

    public Service loadService(){
        return null;
    }



}
