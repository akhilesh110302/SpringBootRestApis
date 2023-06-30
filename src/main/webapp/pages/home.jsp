<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>

<body>
<div>
	
 <form action="addAlien">
 <label for="lname">Alein Id</label><br>
  <input type="text" id="lname" name="ano" value=""><br><br>
  <label for="fname">Alein Name</label><br>
  <input type="text" id="fname" name="aname" value=""><br>
  
  <input type="submit" value="Submit">
</form> 

</div>
<br>
<div>
	
 <form action="getAlien">
 
 <input type="text" id="lname" name="ano" value=""><br><br>
  <label for="fname">Alein id</label><br>
  
  <input type="submit">
	</form> 

</div>
</body>
</html>