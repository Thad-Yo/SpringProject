/**
 * Copyright ©  青岛学海教育. All rights reserved.
 * TODO:这里添加file描述
 *
 * @author jiaxiaofei
 * @date
 * @Modify
 */
package org.jxf.service;

import org.jxf.dao.IStudentDao;
import org.jxf.entity.Student;
import org.jxf.impl.StudentDaoImpl;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

/**
 * @author jiaxiaofei
 * @date 2020/3/8 1:06
 * @version 1.0
 */
public class StudentServiceImpl implements IStudentService {
    IStudentDao studentDao ;

    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
