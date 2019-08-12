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
<form action="AddController" method="post" >
        姓名：<input type="text"  name="name"/><br>
        年龄：<input type="text"  name="age"/><br>
        性别：<input type="radio"  name="gender" value="男"/>男
              <input type="radio"  name="gender" value="女"/>女
        <br>
        地址：<input type="text"  name="address"/><br>
        班级：
        <select name="classId">
                        <c:forEach items="${classes}" var="c">
                                <option  value="${c.classId}">${c.className}</option>
                        </c:forEach>

                </select><br>
        课程：
        <select name="subjectId" multiple>
                <c:forEach items="${subjects}" var="sub">
                        <option  value="${sub.subjectId}">${sub.subjectName}</option>
                </c:forEach>

        </select><br>
        <input type="submit"  name="add" value="添加"/><br>

</form>
</body>
</html>
