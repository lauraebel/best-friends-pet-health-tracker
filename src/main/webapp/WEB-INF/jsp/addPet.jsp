<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div id="main_content_pet">

<h3>Enter Your Pet's Information Below:</h3>

<form action="<c:url value="/petInput" />" method="POST">


<h4>What is Your Pet's Name?</h4>
<input type="text" name="petName" id="petName" />

<h4>What Kind of Animal Is Your Pet?</h4>
	<select id="petType" name="petType">
			<option value="">Choose One</option>
			<option value="Dog">Dog</option>
			<option value="Cat">Cat</option>
			<option value="Horse">Horse</option>
			<option value="Rabbit">Rabbit</option>
			<option value="Small Rodent">Small Rodent</option>
			<option value="Bird">Bird</option>
			<option value="Snake">Snake</option>
			<option value="Lizard">Lizard</option>
			<option value="Turtle">Turtle</option>
			<option value="Pig">Pig</option>
			<option value="Goat">Goat</option>
			<option value="Other">Other (Enter Type in "Breed" Section)</option>	
	</select>

<h4>What Breed is Your Pet?</h4>
<input type="text" name="petBreed" id="petBreed" />

<h4>How Old is Your Pet?</h4>
<input type="text" name="petAge" id="petAge" />

<h4>When Was Your Pet Born? (dd/mm/yyyy)</h4>
<input type="text" name="petDateOfBirth" id="petDateOfBirth"/>

<h4>Is Your Pet Male or Female?</h4>
<input type="radio" id="male" name="petGender" value="male">
<label for="male">Male</label><br>
<input type="radio" id="female" name="petGender" value="female">
<label for="female">Female</label><br>

<h4>Is Your Pet Fixed? (spay/neuter)</h4>
<input type="radio" id="yes" name="petFixed" value="yes">
<label for="yes">Yes</label><br>
<input type="radio" id="no" name="petFixed" value="no">
<label for="no">No</label><br>

<br>
<input type="submit" value="Add This Pet to My Profile" />

</div>









<c:import url="/WEB-INF/jsp/common/footer.jsp" />
