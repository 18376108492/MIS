package net.stxy.one.service.impl;

import net.stxy.one.config.CustomException;
import net.stxy.one.mapper.EmployeeMapper;
import net.stxy.one.model.Employee;
import net.stxy.one.model.EmployeeResult;
import net.stxy.one.model.PageResult;
import net.stxy.one.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 员工业务逻辑层
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private  Logger logger=LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeResult> getList(Integer currentPage,Integer pageSize) throws CustomException {
        //判断参数是否为空
        if(currentPage==null){
            throw  new  CustomException("传入的currentPage值为空");
        }
        if(pageSize==null){
            throw  new  CustomException("传入的pageSize值为空");
        }
        //打印日志
       logger.info("传入的currentPage值为:",currentPage);
        logger.info("传入的pageSize值为:",pageSize);
        //查询员工列表
        List<EmployeeResult>employeeList=employeeMapper.getAll(currentPage,pageSize);
        //查询员工总数
        //打印结果
        logger.info("输出的结果为：",employeeList);
        return employeeList;
    }

    @Override
    public Integer countNum() throws CustomException {
        Integer count=employeeMapper.countNum();
        return count;
    }


    @Override
    public Employee getById(Integer id) throws CustomException{
        if (id==null){
            throw new  CustomException("传入的id值为空");
        }
        logger.info("传入的id值为:",id);
        Employee employee= employeeMapper.getById(id);
        logger.info("查询的结果为：",employee);
        return employee;
    }




}
