package net.stxy.one.mapper;

import net.stxy.one.model.Jurisdiction;

import java.util.List;

/**
 * 角色权限处理层
 */
public interface RoleMapper {

    /**
     * 根据员工角色ID获取员工权限
     * @param id 员工角色ID
     * @return
     */
    List getRoleJurisdiction(Integer id);
}
