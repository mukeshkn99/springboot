<Html>
<head>
<title>welcome</title>
</head>
<body>
<h1>User details</h1>
<form action="adduser" method="post">
<p>${success}</p>
<br/>
<table>

<tr>
 <td>Enter user id:</td>
 <td><input type="text" name="userid"></td>
 </tr>

 <tr>
 <td>Enter user name:</td>
 <td><input type="text" name="name"></td>
 </tr>

 <tr>
 <td>Email:</td>
 <td><input type="text" name="email"></td>
 </tr>
 
 <tr>
 <td>Password:</td>
 <td><input type="text" name="password"></td>
 </tr>
 
 <tr>
 <td>Gender:</td>
 <td><input type="text" name="gender"></td>
 </tr>
 <tr>
 <td>
 <input type="submit" name="register"></td>
 </tr>
 </table>
 <a href="login">Login</a>
 </form>
 </body>
 </html>