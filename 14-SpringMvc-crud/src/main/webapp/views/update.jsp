<Html>
<head>
<title>welcome</title>
</head>
<body>
<h1>Book details</h1>
<form action="editbook" method="post" modelAttribute="b">
<br/>
<table>

<tr>
 <td>Enter book id:</td>
 <td><input type="text" name="bookid"></td>
 </tr>

 <tr>
 <td>Enter book name:</td>
 <td><input type="text" name="bookname"></td>
 </tr>

 <tr>
 <td>Author Name:</td>
 <td><input type="text" name="authorname"></td>
 </tr>
 
 <tr>
 <td>Book Price:</td>
 <td><input type="text" name="price"></td>
 </tr>
 <tr>
 <td>
 <input type="submit" name="submit"></td>
 </tr>
 </table>
 </form>
 </body>
 </html>