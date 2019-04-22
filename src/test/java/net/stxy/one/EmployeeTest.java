package net.stxy.one;

import net.stxy.one.mapper.EmployeeMapper;
import net.stxy.one.model.Employee;
import net.stxy.one.model.EmployeeResult;
import net.stxy.one.model.PageResult;
import net.stxy.one.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 员工业务逻辑测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
//spring配置文件
//"classpath:spring-mvc.xml",不该出现在这里
@ContextConfiguration({"classpath:applicationContext.xml"})
public class EmployeeTest {

    @Autowired
   private EmployeeService employeeService;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void testgetAllDemo () throws Exception{
      List<EmployeeResult> list= employeeMapper.getAll(0,2);
        System.out.println(list);
    }

    @Test
    public void testGetAll () throws Exception{
        List<EmployeeResult> list=employeeService.getList(0,2);
        System.out.println(list);
    }
    @Test
    public void testGetCount () throws Exception{
        Integer count=employeeMapper.countNum();
        System.out.println(count);
    }

    @Test
    public void testGetByOne () throws Exception{
        Employee employee=employeeMapper.getById(1);
        System.out.println(employee);
    }
}
