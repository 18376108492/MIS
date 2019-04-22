package net.stxy.one.model;

import java.io.Serializable;

public class Role implements Serializable {
    private Integer id;//角色id
    private String name;//角色名称


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
