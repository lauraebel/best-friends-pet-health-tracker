<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content"  class="centeredPanel">


<c:url var="createAccountUrl" value="/createAccount" />

<form:form action="${createAccountUrl}" method="POST" modelAttribute="registration">


<div>
	<form:errors path="*" cssClass="error"/>
</div>

<div>
<label for="firstName">Your First Name:</label>
<form:input path="firstName" />
<form:errors path="firstName" cssClass="error"/>
</div>

<div>
<label for="lastName"> Your Last Name:</label>
<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
</div>

<div>
<label for="email">Your Email Address:</label>
<form:input path="email" />
<form:errors path="email" cssClass="error" />
</div>

<div>
<label for="password">Choose a Password:</label>
<form:input path="password"/>
<form:errors path="password" cssClass="error" />
</div>

<div>
<label for="confirmPassword">Please Confirm Your Password:</label>
<form:input path="confirmPassword" />
<form:errors path="confirmPassword" cssClass="error" />
</div>

<div>
<input type="submit" name="Submit"/>
</div>

</form:form>
</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />
