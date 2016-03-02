<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>글쓰기 페이지</title>
</head>

<body>
    <p>대충 써</p>
    <form action="/board/write" method="post">
        <div class="title">
            title: <input type="text" name="title" />
        </div>
        <div class="contents">
            content: <textarea name="content"></textarea>
        </div>
        <button type="submit">입력</button>
    </form>
</body>
</html>