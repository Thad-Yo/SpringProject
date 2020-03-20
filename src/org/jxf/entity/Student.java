/**
 * Copyright ©  青岛学海教育. All rights reserved.
 * TODO:这里添加file描述
 *
 * @author jiaxiaofei
 * @date
 * @Modify
 */
package org.jxf.entity;

/**
 * @author jiaxiaofei
 * @date 2020/3/2 23:34
 * @version 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
