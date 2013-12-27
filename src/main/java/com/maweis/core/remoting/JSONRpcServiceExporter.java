package com.maweis.core.remoting;

import org.springframework.remoting.support.RemoteExporter;

/**
 * Created by peter on 12/20/13.
 */
public class JSONRpcServiceExporter extends RemoteExporter {

    @Override
    public void setInterceptors(Object[] interceptors) {
        super.setInterceptors(interceptors);
    }

    @Override
    public void setRegisterTraceInterceptor(boolean registerTraceInterceptor) {
        super.setRegisterTraceInterceptor(registerTraceInterceptor);
    }

    @Override
    public Class<?> getServiceInterface() {
        return super.getServiceInterface();
    }

    @Override
    public void setServiceInterface(Class<?> serviceInterface) {
        super.setServiceInterface(serviceInterface);
    }

    @Override
    public Object getService() {
        return super.getService();
    }

    @Override
    public void setService(Object service) {
        super.setService(service);
    }

    public JSONRpcServiceExporter() {
        super();
    }



}

