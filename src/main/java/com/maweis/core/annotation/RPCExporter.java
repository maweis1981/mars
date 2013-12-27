package com.maweis.core.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by peter on 12/20/13.
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface RPCExporter {

    public String methodName();

    public int time() default 0;
}
