//package com.code;

//Creating annotation  
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
	int value();
}

//Using annotation  
class Hello {
	@MyAnnotation(value = 50)
	public void sayHello() {
		System.out.println("Hello java annotations");
	}
}

//Accessing annotation 
public class CustomAnnotation {
	public static void main(String args[]) throws Exception {
		Hello hello = new Hello();
		Method method = hello.getClass().getMethod("sayHello");

		MyAnnotation manno = method.getAnnotation(MyAnnotation.class);
		System.out.println("Value is: " + manno.value());
	}
}
