package net.stxy.one.service;

import net.stxy.one.config.CustomException;
import net.stxy.one.model.Employee;
import net.stxy.one.model.EmployeeResult;
import net.stxy.one.model.PageResult;

import java.util.List;

/**
 * 员工业务逻辑层
 */
public interface EmployeeService {

    /**
     * 获取所有员工信息
     * @return
     */
    List<EmployeeResult> getList(Integer currentPage, Integer pageSize) throws CustomException;

    /**
     * 获取员工总数
     * @return
     */
    Integer countNum()throws CustomException;
    /**
     * 根据ID获取相应的员工信息
     * @param id
     * @return
     */
    Employee getById(Integer id) throws CustomException;


     }
