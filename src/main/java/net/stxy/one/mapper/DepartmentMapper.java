package net.stxy.one.mapper;

import net.stxy.one.model.Department;
import net.stxy.one.model.Department_second;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 部门业务持久层
 */
@Repository
public interface DepartmentMapper {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getDepartment();

    /**
     * 根据部门id获取其子部门
     * @param parentID
     * @return
     */
    List<Department_second> getDepartmentSecond(Integer parentID);

}
