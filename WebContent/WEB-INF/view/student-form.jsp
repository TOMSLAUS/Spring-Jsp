<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<title>User registration form!</title>
<h2> User registration form</h2>
<hr>


<style>
.error {color:red}
</style>

<form:form action="processForm" modelAttribute="student" >
Email:
<form:input path="email" />
<form:errors path="email" cssClass="error"/>

<br>
First name:
<form:input path="firstName" />
<form:errors path="firstName" cssClass="error"/>

<br>
Last name:
<form:input path="lastName" />
<form:errors path="lastName" cssClass="error"/>
<br>
number of passes:
<form:input path="passes" />
<form:errors path="passes" cssClass="error"/>
<br>

code:
<form:input path="code" />
<form:errors path="code" cssClass="error"/>
<br>


<input type="submit" value="Submit" />
</form:form>
</body>
</html>