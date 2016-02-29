<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="header"/>
    <title>Welcome GreeBoard</title>
</head>

<body>
    Login</br>
    <form method="POST" action="/auth/login">
        <input type="text" name="username" placeholder="username or email" value="testjays" />
        <input type="password" name="password" value="1234" />
        <input type="submit"  value="Login" />
    </form>
    <form method="POST" action="/users">
        <form method="POST">
            <input type="text" name="username" />
            <input type="text" name="email" />
            <input type="password" name="password" />
            <input type="submit"  value="SignUp" />
        </form>
    </form>
</body>
</html>