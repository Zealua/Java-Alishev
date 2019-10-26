<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action = "addUser" method= "POST">
        <input type="text" name = "newUserName" />
        <input type = "submit" value = "Add" />
    </form>
<c:choose><c:when test="${!empty users}">
    <ul>
        <c:forEach var="user" items="${users}">
           <!-- c:if test = "${user.status == 0}" -->
                <li>id: ${user.id}, name: ${user.name}, status ${user.status}
                    <a href="removeUser?userId=${user.id}">
                        <button>x</button>
                    </a>
                </li>
            <!-- /c:if -->
        </c:forEach>
    </ul>
</c:when><c:otherwise>
    No users
</c:otherwise></c:choose>


</body>
</html>