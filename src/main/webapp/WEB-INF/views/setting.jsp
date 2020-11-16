<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
<%@ include file="/WEB-INF/views/components/framework.jsp"%>
<html>
<head>
<title>ELEC5619 Group Project 11 - Course Advisor</title>

</head>
<body>

	<div id="contentRight">
		<section class="lowerSection">
			<div class="tableBox">
				<h4 class="custom-underline h4-underline">YOUR PROFILE</h4>

				<form:form method="post" commandName="changeSetting"
					id="userSetting">
					<div class="row">
						<div class="column left">
							<p>Name</p>
						</div>
						<div class="column middle">
							<p>:</p>
						</div>
						<div class="column right">
							<p>Jinvara Vesvijak</p>
						</div>
					</div>
					<div class="row">
						<div class="column left">
							<p>Display Name</p>
						</div>
						<div class="column middle">
							<p>:</p>
						</div>
						<div class="column right">
							<p>Fai Vesvijak</p>
						</div>
					</div>
					<div class="row">
						<div class="column left">
							<p>Faculty</p>
						</div>
						<div class="column middle">
							<p>:</p>
						</div>
						<div class="column right">
							<p>Master of IT</p>
						</div>
					</div>
					<div class="row">
						<div class="column left">
							<p>Specialisation</p>
						</div>
						<div class="column middle">
							<p>:</p>
						</div>
						<div class="column right">
							<p>Software Engineering</p>
						</div>
					</div>
					<div class="row">
						<div class="column left">
							<p>E-mail</p>
						</div>
						<div class="column middle">
							<p>:</p>
						</div>
						<div class="column right">
							<p>jves-423@uni.sydney.edu.au</p>
						</div>
					</div>

					<div class="profileForm">
						<p>INTEREST</p>
						<select name="userInterest">
							<option value="cloud-computing">Cloud Computing</option>
							<option value="mobile-development">Mobile Developmemt</option>
							<option value="web-development">Web Development</option>
							<option value="machine-learning">Machine Learning</option>
						</select>

						<p>CAREER OBJECTIVE</p>
						<select name="careerObjective">
							<option value="cloud-computing">Cloud Computing</option>
							<option value="mobile-development">Mobile Developmemt</option>
							<option value="web-development">Web Development</option>
							<option value="machine-learning">Machine Learning</option>
						</select>
					</div>

				</form:form>

				<button class="saveBtn" type="submit" form="userSetting"
					value="Submit">
					<div>SAVE</div>
					<img src="resources/images/login.png" />
				</button>


			</div>
		</section>
	</div>

</body>
</html>
