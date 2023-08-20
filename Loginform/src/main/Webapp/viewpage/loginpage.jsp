<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <h2> This is Login Page </h2>
     <form action="", method="post">

       <div class="form-group">
         <label for="exampleInputEmail1">Email address</label>
         <input type="email" class="form-control" id="exampleInputEmail1" name="loginemail" placeholder="Enter email">
       </div>
       <div class="form-group">
         <label for="exampleInputPassword1">Password</label>
         <input type="password" class="form-control" id="exampleInputPassword1" name="loginpassword" placeholder="Password">
       </div>

       <button type="submit" class="btn btn-primary">Submit</button>

       <div>
        <p> Create New Account <a href="/Register" >Register for new account</a></p>
       </div>
     </form>

</body>
</html>