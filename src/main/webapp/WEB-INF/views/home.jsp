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
<body id="main">

	
	<div id="contentRight">
		<div id="dashboardSection">
<%-- 		<P>  The time on the server is ${style}. </P>
 --%>
			<section class="upperSection">
				<div class="statBox">
					<p class="statTitle custom-underline">Your Credits</p>
					<i class="fas fa-graduation-cap"></i>
					<p class="statNumber">72</p>
				</div>
				<div class="statBox">
					<p class="statTitle custom-underline">Remaining Credits</p>
					<i class="fas fa-chalkboard"></i>
					<p class="statNumber">24</p>
				</div>
				<div class="statBox statBoxRight">
					<p class="statTitle">
						FIND<br>COURSE
					</p>
					<img src="resources/images/search-icon.png" /> <img class="arrow"
						src="resources/images/arrow-pointing-to-right.png" />
					<p class="statNumber"></p>
				</div>
			</section>


			<section class="lowerSection">
				<div class="tableBox">
					<h4 class="custom-underline h4-underline">COMPLETED COURSES</h4>

					<table id="completed-course-table">
						<thead>
							<tr>
								<th>Code</th>
								<th>Name</th>
								<th>Occurrence</th>
								<th>Year</th>
								<th>Session</th>
								<th>Credits</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>COMP5206</td>
								<td>Information Technologies and Systems</td>
								<td>ND-CC</td>
								<td>2018</td>
								<td>S2C</td>
								<td>6</td>
							</tr>
							<tr>
								<td>COMP5427</td>
								<td>Usability Engineering</td>
								<td>ND-CC</td>
								<td>2018</td>
								<td>S2C</td>
								<td>6</td>
							</tr>
							<tr>
								<td>COMP5206</td>
								<td>Information Technologies and Systems</td>
								<td>ND-CC</td>
								<td>2018</td>
								<td>S2C</td>
								<td>6</td>
							</tr>
							<tr>
								<td>COMP5427</td>
								<td>Usability Engineering</td>
								<td>ND-CC</td>
								<td>2018</td>
								<td>S2C</td>
								<td>6</td>
							</tr>
						</tbody>

					</table>
				</div>
			</section>
		</div>
	</div>
	</div>

</body>
</html>
