<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
	<title>Book List</title>
</head>
<body>
<div id="global">
	<h1>Book List</h1>
	<a href="<c:url value="/book_input"/>">Add Book</a>
	<table>
		<tr>
			<th>Category</th>
			<th>Title</th>
			<th>ISBN</th>
			<th>Author</th>
			<th>&nbsp;</th>
		</tr>

		<c:forEach items="${books}" var="book">
		<tr style="text-align: center">
			<td width="200px">${book.category.name}</td>
			<td width="200px">${book.title}</td>
			<td width="200px">${book.isbn}</td>
			<td width="200px">${book.author}</td>
			<td width="200px"><a href="book_edit/${book.id}">Edit</a></td>
		</tr>
		</c:forEach>

	</table>
</div>
</body>
</html>