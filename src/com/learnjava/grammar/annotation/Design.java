/*
 * 参考地址：https://www.cnblogs.com/flypie/p/5134752.html
 */

/*
 * 该文件定义了一个注解
 */
package com.learnjava.grammar.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*    @Target,@Retention,@Inherited,@Documented
 *     这四个是对注解进行注解的元注解，负责自定义的注解的属性
 */
@Target({ElementType.TYPE,ElementType.METHOD})    //表示注解的作用对象，ElementType.TYPE表示类，ElementType.METHOD表示方法
@Retention(RetentionPolicy.RUNTIME)        //表示注解的保留机制，RetentionPolicy.RUNTIME表示运行时注解
@Inherited            //表示该注解可继承
@Documented            //表示该注解可生成文档
public @interface Design {
    String author();        //注解成员，如果注解只有一个成员，则成员名必须为value()，成员类型只能为原始类型
    int data() default 0;    //注解成员，默认值为0
}
