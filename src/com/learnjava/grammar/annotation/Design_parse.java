/*
 * 参考地址：https://www.cnblogs.com/flypie/p/5134752.html
 */
/*
 * 该文件解析了注解
 */
package com.learnjava.grammar.annotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.learnjava.grammar.annotation.Design;

public class Design_parse {

    public static void main(String[] args) throws ClassNotFoundException {
        
        Class c=Class.forName("com.learnjava.grammar.annotation.Design_use");        //使用类加载器加载类
        
        //1、找到类上的注解
        if(c.isAnnotationPresent(Design.class)){    //判断类是否被指定注解注解
            Design d=(Design) c.getAnnotation(Design.class);    //拿到类上的指定注解实例
            System.out.println(d.data());
        }
        
        //2、找到方法上的注解
        Method[] ms=c.getMethods();
        for(Method m:ms){
            if(m.isAnnotationPresent(Design.class)){    //判断方法是否被指定注解注解
                Design d=m.getAnnotation(Design.class);        //拿到类上的指定注解实例
                System.out.println(d.data());
            }
        }
        
        //3、另外一种方法
        for(Method m:ms){
            Annotation[] as=m.getAnnotations();        //拿到类上的注解集合
            for(Annotation a:as){
                if(a instanceof Design){        //判断指定注解
                    Design d=(Design) a;
                    System.out.println(d.data());
                }
            }
        }
    }
 
}