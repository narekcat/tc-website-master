<%@ page import="com.topcoder.shared.util.ApplicationServer" %>
<%@ page import="com.topcoder.web.reg.Constants" %>
<%@ taglib uri="tc-webtags.tld" prefix="tc-webtag" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
		<c:if test="${sessionInfo.loggedIn}">
			<title>Edit Profile</title>
		</c:if>
		<c:if test="${!sessionInfo.loggedIn}">
			<title>Registration Signup: Registration Areas</title>
		</c:if>
        <script type="text/javascript" src="/js/regReskin20080904.js"></script>
        <link type="image/x-icon" rel="shortcut icon" href="/i/favicon.ico"/>
        <jsp:include page="style.jsp">
            <jsp:param name="key" value="tc_reg"/>
        </jsp:include>
    </head>
    
    <body>
		<jsp:include page="header.jsp" />
		<div id="heading" class="registrationSuccessfulHedading">	
			<div class="inner">
				<c:if test="${sessionInfo.loggedIn}">
					<h1>Edit Profile</h1>
				</c:if>
				<c:if test="${!sessionInfo.loggedIn}">
					<h1>Registration Signup</h1>
				</c:if>
			</div><!-- END .inner -->
		</div>
		<div id="content" class="registrationSuccessful">
			<p class="messageTitle">Thank you for activating your account.</p>
			<p>You are now a TopCoder member.</p>
			<form method="get" action="/tc" name="toHomeForm">
				<tc-webtag:hiddenInput name="<%=Constants.MODULE_KEY%>" value="MyHome"/>
				<a class="redBtn" href="JavaScript:document.toHomeForm.submit();">
					<span class="buttonMask"><span class="text">Continue to My Home</span></span>
				</a>
			</form>
        </div><!-- End #content -->
		<jsp:include page="footer.jsp" />
    </body>
</html>