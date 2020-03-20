/**
 * Copyright ©  青岛学海教育. All rights reserved.
 * TODO:这里添加file描述
 *
 * @author jiaxiaofei
 * @date
 * @Modify
 */
package org.jxf.impl;

import org.jxf.dao.IStudentDao;
import org.jxf.entity.Student;
import org.springframework.stereotype.Component;

/**
 * @author jiaxiaofei
 * @date 2020/3/7 23:15
 * @version 1.0
 */
@Component("testDao")
public class StudentDaoImpl implements IStudentDao {

    @Override
    public void addStudent(Student student) {
        System.out.println("增加学生.....");
    }

}
