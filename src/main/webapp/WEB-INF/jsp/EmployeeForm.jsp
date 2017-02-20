<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Employee Form</title>
</head>
<body>
	<div id="global">
		<form:form commandName="employee" action="/employee_save" method="post">
			<fieldset>
				<legend>Add an employee</legend>
				<p>
					<label for="firstName">First Name:</label>
					<form:input path="firstName" tabindex="1" />
				</p>
				<p>
					<label for="lastName">Last Name:</label>
					<form:input path="lastName" tabindex="2" />
				</p>
				<p>
					<form:errors path="birthDate" />
				</p>
				<p>
					<label for="birthDate">Date Of Birth:</label>
					<form:input path="birthDate" tabindex="3" />
				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4" value="Reset">
					<input id="submit" type="submit" tabindex="5" value="Add Employee">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>