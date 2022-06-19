<Html>
<head>
<title>welcome</title>
</head>
<body>
<h1>Student registration successfully</h1>
<table>
<tr>
<td>name</td>
<td>${student.name}</td>
</tr>

<tr>
<td>email</td>
<td>${student.email}</td>
</tr>

<tr>
<td>gender</td>
<td>${student.gender}</td>
</tr>

<tr>
<td>course</td>
<td>${student.course}</td>
</tr>

<tr>
<td>timings</td>
<td>${student.timings[0]} ${student.timings[1]} ${student.timings[2]}</td>
</tr>

</table>
</body>
</html>