<%@page session="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
      <meta http-equiv="content-type" content="text/html; charset=UTF-8">
      <%--<link rel="stylesheet" href="<c:url value='/static/css/tutorial.css'/>" type="text/css" />--%>
      <title>Session Timeout</title>
  </head>
<body>
<div id="content">
<h2>Invalid Session</h2>

<p>
Your session appears to have timed out. Please <a href="/manage/login">start again</a>.

</p>
</div>
<c:import url="../util/google-analytics.jsp"/>
</body>
</html>
