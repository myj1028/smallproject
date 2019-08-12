<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 锦锦小仙女
  Date: 2019/7/21
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #app{
            margin-left:40%;
            padding:40px;
        }
        #head{
            margin-bottom: 50px;
        }

    </style>

</head>
<body>

<script src="../../js/jquery.js"></script>
<script src="../../js/jqPaginator.js"></script>
<script src="../../js/bootstrap-table.js"></script>
<link rel="stylesheet" href="../../css/bootstrap.css">
<link rel="stylesheet" href="../../css/bootstrap-table.css">
<div id="app">
    <div >
        <form action="MainController" method="get">
            <div id="head">
                姓名：<input type="text"  name="select" placeholder="根据姓名搜索"/>
                <button>搜索</button>
                <a href="toAdd"><input type="button" value="新增"/></a>
            </div>

            <table border="1px" cellspacing="0" >
                <thead>
                    <tr>
                        <th>id</th>
                        <th>姓名</th>
                        <th>年龄</th>
                        <th>性别</th>
                        <th>地址</th>
                        <th>班级</th>
                        <th>课程</th>
                        <th>操作</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${pageInfo.list}"  var="stu">
                        <tr>
                            <td>${stu.id}</td><td>${stu.name}</td><td>${stu.age}</td><td>${stu.gender}</td><td>${stu.address}</td><td>${stu.className}</td><td>${stu.subjectName}</td>
                            <td>
                                <a href="toUpdate?id=${stu.id}" ><input type="button" value="编辑"></a>
                                <a href="DeleteController?id=${stu.id}" ><input type="button" value="删除"></a>
                            </td>
                        </tr>

                    </c:forEach>
                </tbody>
            </table>


        </form>
    </div>


</div>

<div class="pagination-layout" >
    <div class="pagination" style="padding-left: 40%">
        <ul class="pagination" total-items="pageInfo.totalRows"  max-size="10" boundary-links="true">

        </ul>
    </div>
</div>

<script type="text/javascript">
    var if_firstime = true;


    window.onload = function () {
        $('.pagination').jqPaginator({
            totalPages: ${pageInfo.pages},
            visiblePages: 5,
            currentPage: ${pageInfo.pageNum},

            first: '<li class="first"><a href="javascript:void(0);">第一页</a></li>',
            prev: '<li class="prev"><a href="javascript:void(0);">上一页</a></li>',
            next: '<li class="next"><a href="javascript:void(0);">下一页</a></li>',
            last: '<li class="last"><a href="javascript:void(0);">最末页 </a></li>',
            page: '<li class="page"><a href="javascript:void(0);">{{page}}</a></li>',

            onPageChange: function (num) {
                if (if_firstime) {
                    if_firstime = false;
                } else if (!if_firstime) {
                    changePage(num);
                }

            }
        });
    }

    function changePage(num) {

        location.href = "/MainController?pageNum=" + num;

    }
</script>
</body>
</html>
