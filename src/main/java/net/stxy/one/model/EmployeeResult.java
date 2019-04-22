package net.stxy.one.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工查询结果表
 */
public class EmployeeResult implements Serializable {
    private Integer id;//用户id
    private String name;//用户名字
    private String sex;//性别
    private Integer age;//年龄
    private String dept_name;//部门名称
    private String job_name;//职位名称
    private String role_name;//角色

    @Override
    public String toString() {
        return "EmployeeResult{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dept_name='" + dept_name + '\'' +
                ", job_name='" + job_name + '\'' +
                ", role_name='" + role_name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
