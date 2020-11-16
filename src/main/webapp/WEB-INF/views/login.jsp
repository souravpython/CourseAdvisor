 	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>ELEC5619 Group Project 11 - Course Advisor</title>
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:400,400i,600&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/solid.css"
	integrity="sha384-ioUrHig76ITq4aEJ67dHzTvqjsAP/7IzgwE7lgJcg2r7BRNGYSK0LwSmROzYtgzs"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/fontawesome.css"
	integrity="sha384-sri+NftO+0hcisDKgr287Y/1LVnInHJ1l+XC7+FOabmTTIK0HnE2ID+xxvJ21c5J"
	crossorigin="anonymous">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/main.js" />"></script>
	

</head>
<body id="initialPage">

	<div class="wrapper">
		<div id="contentLeftInitial">
			<img id="homepagePic" class="picture" alt="home page pic"
				src="resources/images/Sydney-University-2.jpg">
		</div>


		<div id="contentRightInitial">
			<div id="tbHomepage" class="tableBox">
				<p id="welcome1" class="welcompage-custom1">WELCOME TO</p>
				<p class="welcompage-custom2">COURSE ADVISOR</p>

				<form:form id="loginform"  commandName="loginform" action="/course-advisor/initiallogin" modelAttribute="loginInfo">
				<div class="wrap-input100 validate-input username-input" data-validate = "Enter username">
						<form:input path="username" id="unikey" class="input100 loginrequired" type="text" name="username"/>
						<span class="focus-input100" data-placeholder="Unikey"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate="Enter password">
						<form:input path="password" id="password" class="input100 loginrequired" type="password" name="pass"/>
						<span class="focus-input100" data-placeholder="Password"></span>
					</div>
					
					<p id="loginerrorresult"></p>

				</form:form>
				
				<button id="loginform-btn" class="saveBtn" type="submit" form="loginform"
					value="Submit">
					<div>LOGIN</div>
					<img src="resources/images/login.png" />
				</button>

				


			</div>
		</div>
	</div>

</body>
</html>