package net.stxy.one.mapper;

import net.stxy.one.model.Employee;
import net.stxy.one.model.EmployeeResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 员工持久层接口
 */
@Repository
public interface EmployeeMapper {

    /**
     * 获取所有员工信息
     * @return
     */
    List<EmployeeResult> getAll(@Param("currentPage") Integer currentPage,
                                @Param("pageSize") Integer pageSize);

    /**
     * 查询所有员工数量
     * @return
     */
    Integer countNum();

    /**
     * 根据员工ID获取员工信息
     * @param id 员工ID
     * @return
     */
    Employee getById(Integer id);

    /**
     * 根据员工ID更新员工信息
     * @param id 员工ID
     */
    void updateEmployee(Integer id);

    /**
     * 根据员工ID删除员工
     * @param id 员工ID
     */
    void deleteEmployee(Integer id);

    /**
     * 根据员工姓名查询
     * @param keyword 员工姓名
     * @return
     */
    List<Employee> getByName(String keyword);
}
