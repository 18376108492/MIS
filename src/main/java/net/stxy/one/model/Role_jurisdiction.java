package net.stxy.one.model;

import java.io.Serializable;

public class Role_jurisdiction implements Serializable {
    private Integer id;//角色关联权限表id
    private Integer role_id;//对应角色表id
    private Integer jurisdiction_id;//对应权限表id

    private Jurisdiction jurisdiction;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Jurisdiction getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Jurisdiction jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getJurisdiction_id() {
        return jurisdiction_id;
    }

    public void setJurisdiction_id(Integer jurisdiction_id) {
        this.jurisdiction_id = jurisdiction_id;
    }
}
