<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="header"/>
    <title>게시판</title>
</head>

<body>
<div class="content">
    게시물들
    <ol>
    <% boardItemList.each { %>
        <li> ${it.title} | 쓴날 : ${it.create_date} </li>
   <%  } %>
    </ol>
</div>

</body>
</html>