package io.robusta.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.jsoup.nodes.Element;

/**
 * Created by Nicolas on 22/11/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Slow {
	
	long expectdeTime() default 200;
}
