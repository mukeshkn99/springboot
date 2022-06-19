<Html>
<head>
<title>welcome</title>
</head>
<body>
<h1>Student registration details</h1>
<form action="register" method="post">
<table>
 <tr>
 <td>Enter name</td>
 <td><input type="text" name="name"></td>
 </tr>

<tr>
 <td>Enter email</td>
 <td><input type="text" name="email"></td>
 </tr>

<tr>
 <td>Enter gender</td>
 <td><input type="radio" name="gender" value="M">Male
 <input type="radio" name="gender" value="F">Female</td>
 </tr>
 
 <tr>
 <td>Enter course</td>
 <td><select type="course" name="course">
 <option value="select">select
 <option value="java">java
 <option value=".Net">.Net
 <option value="android">android</select></td>
 </tr>
 
 
 <tr>
 <td>Enter timings</td>
 <td><input type="checkbox" name="timings" value="morning">Morning
 <input type="checkbox" name="timings" value="afternoon">Afternoon
 <input type="checkbox" name="timings" value="evening">evening
 </tr>
<tr>
<td><input type="submit" value="register"></td>
</tr>
</table>
</form>
</body
</Html>