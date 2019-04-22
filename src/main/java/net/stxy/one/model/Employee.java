package net.stxy.one.model;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private Integer id;//用户id
    private String name;//用户名字
    private String sex;//性别
    private Integer age;//年龄
    private Date birthday;//出生日期
    private Integer dept_id;//所属二级部门id
    private Integer job_id;//职务
    private Date createdate;//创建时间
    private Integer role_id;//角色
    private Date modifydate;//跟新时间
    private Integer status;//状态 0.为启用 1.为停用


    private Role role;
    private Job job;
    private Department_second department_second;
    private Role_jurisdiction role_jurisdiction;

    public Role_jurisdiction getRole_jurisdiction() {
        return role_jurisdiction;
    }

    public void setRole_jurisdiction(Role_jurisdiction role_jurisdiction) {
        this.role_jurisdiction = role_jurisdiction;
    }

    public Department_second getDepartment_second() {
        return department_second;
    }

    public void setDepartment_second(Department_second department_second) {
        this.department_second = department_second;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
