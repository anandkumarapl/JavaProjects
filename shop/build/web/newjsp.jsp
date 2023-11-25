
<%@page import="components.Utilities"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
        <title>Content Page</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        <div class="container">
            <%=Utilities.getProductList()%>
            
        </div>
       
        
        <%@include file="footer.jsp" %>
