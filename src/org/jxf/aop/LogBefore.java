/**
 * Copyright ©  青岛学海教育. All rights reserved.
 * TODO:这里添加file描述
 *
 * @author jiaxiaofei
 * @date
 * @Modify
 */
package org.jxf.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author jiaxiaofei
 * @date 2020/3/8 22:39
 * @version 1.0
 */
public class LogBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知");
    }
}
