package net.stxy.one.model;

import java.io.Serializable;

public class Department implements Serializable {
    private Integer id;//部门id
    private String name;//部门名称

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
}
