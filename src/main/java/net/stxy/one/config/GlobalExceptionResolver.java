package net.stxy.one.config;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA
 * User: Litongxue
 * Time: 2018/4/6
 * Description: 全局异常处理器
 */
public class GlobalExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object, Exception exception) {
        System.out.println("GlobalExceptionResolver.resolveException()");
        CustomException customException = null;
        //判断是否是系统自定义异常,若不是,则构造一个
        if (exception instanceof CustomException)
            customException = (CustomException) exception;
        else
            customException = new CustomException("系统发生未知错误,请与管理员联系");

        //设置返回
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", customException.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
