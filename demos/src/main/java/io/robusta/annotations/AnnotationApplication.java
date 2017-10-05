package io.robusta.annotations;

import java.lang.reflect.Method;

import io.robusta.files.DespacitoApp;

/**
 * Created by Nicolas on 22/11/2016.
 */
public class AnnotationApplication {

	public static void main(String[] args) {
    	
    	Class<DespacitoApp> myClass  = DespacitoApp.class;
    	
    	Method[] methods = myClass.getDeclaredMethods();
    	
    	for(Method method : methods){
    		System.out.println(method.getName() +":"+method.getDeclaredAnnotations().length);
    	}
    	
    	int count = 0;
    	
    	for (Method method : methods){
    		Slow slow = method.getDeclaredAnnotation(Slow.class);
    		if(slow!=null){
    			count++;
    		}
    	}
    	System.out.println("count : "+count);
    	
    	long totalTime = 0;
    	
    	for (Method method : methods){
    	    Slow slow = method.getDeclaredAnnotation(Slow.class);
    	    if(slow!=null){
    	    	totalTime = totalTime + slow.expectdeTime();
    	    		}
    	}
    	System.out.println();
    }
}
