package com.maweis;

import com.maweis.core.annotation.RPCExporter;
import com.maweis.core.remoting.RPCExporterUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by peter on 12/22/13.
 */
public class AnnotationTest {

    @RPCExporter(methodName = "sayHalo")
    public String sayHalo(String name){
        return "Halo " + name;
    }

    public static void main(String[] args) {

        AnnotationTest test = new AnnotationTest();
        test.sayHalo("Maven");

        RPCExporterUtil.getRpcMethodInfo(AnnotationTest.class);
    }
}
