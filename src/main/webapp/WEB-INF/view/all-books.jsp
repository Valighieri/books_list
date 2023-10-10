<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<h2> All Books </h2>
<br>


<table>

    <tr>
        <th>Book title</th>
        <th>Author</th>
        <th>Publication date</th>
    </tr>

    <c:forEach var="book" items="${allBooks}">
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.publicationDate}</td>
        </tr>
    </c:forEach>

</table>


<br>

</body>
</html>