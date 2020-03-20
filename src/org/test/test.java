/**
 * Copyright ©  青岛学海教育. All rights reserved.
 * TODO:这里添加file描述
 *
 * @author jiaxiaofei
 * @date
 * @Modify
 */
package org.test;

import org.jxf.entity.Student;
import org.jxf.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.applet.Main;

/**
 * @author jiaxiaofei
 * @date 2020/3/2 23:38
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        testAop();
    }

    public static void testAop(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //根据id获取bean
        //Spring就是一个大工厂（容器）专门生成bean bean就是对象
        IStudentService studentService = (IStudentService) applicationContext.getBean("studentService");
        Student student = new Student();
        student.setAge(22);
        student.setName("张三");
        studentService.addStudent(student);
    }
}
