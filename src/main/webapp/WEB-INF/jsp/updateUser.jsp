<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 锦锦小仙女
  Date: 2019/7/21
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="UpdateController" method="post"  >
    <input type="hidden" name="id" value="${stu.id}"/>
    姓名：<input type="text"  name="name" value="${stu.name}"/><br>
    年龄：<input type="text"  name="age"  value="${stu.age}"/><br>
    性别：<input type="radio"  name="gender"  value="男"  <c:if test="${stu.gender eq '男' }">checked</c:if> />男
          <input type="radio"  name="gender"  value="女 " <c:if test="${stu.gender eq '女' }">checked</c:if> />女
    <br>
    地址：<input type="text"  name="address"  value="${stu.address}"/><br>

    班级：
    <select name="classId" >
        <c:forEach var="c" items="${classes}" >
            <option value="${c.classId}" <c:if test="${c.classId eq stu.classId }">selected</c:if>>${c.className}</option>
        </c:forEach>
    </select>
    <br>

    课程：
    <select name="subjectId">
        <c:forEach var="s" items="${subjects}" >
            <option value='${s.subjectId}'  <c:if test="${s.subjectId eq stu.subjectId }" >selected</c:if>>${s.subjectName}</option>
        </c:forEach>
    </select>
    <br>
    <input type="submit" value="确认"/><br>
    <a href="MainServlet"><input type="button" value="返回"/></a><br>

</form>
</body>
</html>
