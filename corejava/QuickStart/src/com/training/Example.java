package com.training;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)

public @interface Example {
	          public String show() default  "Hello India";
	    }

