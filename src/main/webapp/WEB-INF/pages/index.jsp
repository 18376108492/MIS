<%--
  Created by IntelliJ IDEA.
  User: WIN8
  Date: 2019/1/22
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户管理系统</title>
    <link rel="stylesheet" type="text/css" href="../../public/js/jquery-easyui-1.4.1/themes/gray/easyui.css" />
    <link rel="stylesheet" type="text/css" href="../../public/js/jquery-easyui-1.4.1/themes/icon.css" />
    <link rel="stylesheet" type="text/css" href="../../public/css/e3.css" />
    <link rel="stylesheet" type="text/css" href="../../public/css/default.css" />
    <script type="text/javascript" src="../../public/js/jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../public/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../public/js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="../../public/js/common.js"></script>
    <style type="text/css">
        .content {
            padding: 10px 10px 10px 10px;
        }
    </style>
</head>
<body class="easyui-layout">
<!-- 头部标题 -->
<div data-options="region:'north',border:false" style="height:60px; padding:5px; background:#F3F3F3">
    <span class="northTitle">用户管理系统</span>
    <span class="loginInfo">登录用户：admin&nbsp;&nbsp;姓名：管理员&nbsp;&nbsp;角色：系统管理员</span>
</div>
<div data-options="region:'west',title:'菜单',split:true" style="width:180px;">
    <ul id="menu" class="easyui-tree" style="margin-top: 10px;margin-left: 5px;">
        <li>
            <span>有限公司</span>
            <ul>
                </li>
                <li>
                 <c:forEach items="${departmentList}" var="department">
                     <span>${department.name}</span>
                         <%--判断部门是否有子类--%>
                     <c:if test="${departmentSecond!=null}">
                     <li data-options="attributes:{'url':'employee_list?${departmentSecond.name}'}">${departmentSecond.name}</li>
                     </c:if>
                 </c:forEach>


                    <span>研发部</span>
                    <ul>
                        <li data-options="attributes:{'url':'content-category'}">研发一组</li>
                        <li data-options="attributes:{'url':'content'}">研发二组</li>
                    </ul>
                <li data-options="attributes:{'url':'item-add'}">产品部</li>
                <li data-options="attributes:{'url':'item-list'}">财务部</li>

                </li>

            </ul>
</div>
<div data-options="region:'center',title:''">
    <div id="tabs" class="easyui-tabs">
        <div title="首页" style="padding:20px;">

        </div>
    </div>
</div>
<!-- 页脚信息 -->
<div data-options="region:'south',border:false" style="height:20px; background:#F3F3F3; padding:2px; vertical-align:middle;">
    <span id="sysVersion">系统版本：V1.0</span>
    <span id="nowTime"></span>
</div>
<script type="text/javascript">
    $(function(){
        $('#menu').tree({
            onClick: function(node){
                if($('#menu').tree("isLeaf",node.target)){
                    var tabs = $("#tabs");
                    var tab = tabs.tabs("getTab",node.text);
                    if(tab){
                        tabs.tabs("select",node.text);
                    }else{
                        tabs.tabs('add',{
                            title:node.text,
                            href: node.attributes.url,
                            closable:true,
                            bodyCls:"content"
                        });
                    }
                }
            }
        });
    });
    setInterval("document.getElementById('nowTime').innerHTML=new Date().toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());",1000);
</script>
</body>
</html>