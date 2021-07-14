<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/7/8
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery-3.2.1.min.js"></script><%--    引入jq--%>
</head>
<body>
<form >
    <input type="text" name="acc" id="acc">
    <input type="text" name="pass" id="pass">
    <button onclick="golo()">登录</button>
</form>
</body>
</html>
<script type="text/javascript">
    function golo() {
        $.ajax({
            url:"userController/log",//路径跟servlet
            data:{"acc":$("#acc").val(),"pass":$("#pass").val()},//取值发送过去
            method:"post",
            dataType:"json",//返回的格式为text
            success:function (data,status) {//成功返回
                console.log(data)//返回的内容
                console.log(status)//返回的属性

            },error:function (data) {//失败返回
                console.log(data)//返回的内容

            }

        })
    }
</script>
