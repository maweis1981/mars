package com.maweis.core.remoting;

import com.maweis.core.annotation.RPCExporter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by peter on 12/22/13.
 */
public class RPCExporterUtil {

    public static void getRpcMethodInfo(Class<?> clazz) {
        System.out.println(clazz.getName());

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(RPCExporter.class)){
                System.out.println("Bingo " + method);


            }else{
                System.out.println(method);
            }
//            Annotation[] annotations = method.getDeclaredAnnotations();
//            for (Annotation annotation : annotations) {
//                System.out.println(annotation);
//            }
        }
    }
}
