<html>
<head>
    <title>This is spring application</title>
</head>
<body>
<h2>This is home page...</h2>

<%
    String name = (String) request.getAttribute("name");
    Integer id = (Integer) request.getAttribute("id");
%>
<h1>Name is: <%=name%></h1>
<h1>Id is: <%=id%></h1>
</body>
</html>
