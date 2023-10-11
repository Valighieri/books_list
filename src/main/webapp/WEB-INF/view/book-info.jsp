<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h2> Book Info </h2>

<form:form action="saveBook" modelAttribute="book">

    <form:hidden path="id"/>

    Book title <form:input path="title"/>
    <br><br>
    Author <form:input path="author"/>
    <br><br>
    Publication date <form:input path="publicationDate"/>
    <br><br>

    <input type = "submit" value="OK">

</form:form>

</body>
</html>
