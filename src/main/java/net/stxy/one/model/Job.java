package net.stxy.one.model;

import java.io.Serializable;

public class Job implements Serializable {
    private Integer id;//职务id
    private String name;//职务名称

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
