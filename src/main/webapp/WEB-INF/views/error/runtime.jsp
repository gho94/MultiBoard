<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" isErrorPage="true" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	response.setStatus(200);
%>
   
<!DOCTYPE html>
<html>
	<jsp:include page="/WEB-INF/views/include/staticFiles.jsp"></jsp:include>
<body>
	<jsp:include page="/WEB-INF/views/include/bodyHeader.jsp"></jsp:include>
	<div class="container">
		<h2 style="color:red;">${exception.message}</h2>
		<p>
			Failed URL: ${url}
			Exception: ${exception.message}
			<c:forEach items="${exception.stackTrace}" var="ste">	${ste}</c:forEach>
		</p>
		<p><a class="btn btn-primary" href="<c:url value='/'/>"></a></p>	
	</div>
	<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
</body>
</html>