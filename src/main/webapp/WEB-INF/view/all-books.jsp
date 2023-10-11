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
        <th>Operations</th>
    </tr>

    <c:forEach var="book" items="${allBooks}">

        <c:url var="updateButton" value="/updateBook">
            <c:param name="bookId" value="${book.id}"/>
        </c:url>

        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.publicationDate}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href = '${updateButton}'">
            </td>
        </tr>
    </c:forEach>

</table>


<br>

<input type="button" value="Add"
       onclick="window.location.href = 'addNewBook'"/>

</body>
</html>