/*
 * 参考地址：https://www.cnblogs.com/flypie/p/5134752.html
 */

/*
 * 该文件使用了一个注解
 */
package com.learnjava.grammar.annotation;


import com.learnjava.grammar.annotation.Design;

@Design(author="flypie",data=100)    //使用自定义注解，有默认值的成员可以不用赋值，其余成员都要复值
public class Design_use {
    @Design(author="flypie",data=90)
    public void live(){
        
    }
}