<Html>
<head>
<title>welcome</title>
</head>
<body>
<h1>Book details</h1>
<form action="loginuser" method="post" modelAttribute="b">
<p>${success}</p>
<br/>
<table>
 <tr>
 <td>Email:</td>
 <td><input type="text" name="email"></td>
 </tr>
 
 <tr>
 <td>Password:</td>
 <td><input type="text" name="password"></td>
 </tr>
 
 <tr>
 <td>
 <input type="submit" name="login"></td>
 </tr>
 </table>
 </form>
 </body>
 </html>