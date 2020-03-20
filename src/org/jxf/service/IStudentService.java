package org.jxf.service;

import org.jxf.dao.IStudentDao;
import org.jxf.entity.Student;
import org.jxf.impl.StudentDaoImpl;

/**
 * @author jiaxiaofei
 * @version 1.0
 * @date 2020/3/8 1:06
 */
public interface IStudentService {
    void addStudent(Student student);
}
