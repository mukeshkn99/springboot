<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<Html>
<head>
<title>welcome</title>
</head>
<body>
<h1>Book view details</h1>
<table>
<thead>
<tr>
<th>bookid</th>
<th>bookname</th>
<th>authorname</th>
<th>price</th>
<th>action</th>
</tr>
</thead>

<tbody>
<tr>
<td>${book.bookid}</td>
<td>${book.bookname}</td>
<td>${book.authorname}</td>
<td>${book.price}</td>
<td><a href="edit/${book.bookid}">Edit</a></td>
<td><a href="delete/${book.bookid}">delete</a></td>
</tr>

</tbody>

</table>
</body>
</html>