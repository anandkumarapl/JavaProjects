
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    boolean isPostback = (request.getParameter("check") == null) ? false : true;
    out.print(isPostback);
    int qno = 0;
    if (isPostback) {
        qno = Integer.parseInt(request.getParameter("qno"));
        qno++;
    }
    System.out.println(qno);

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post">
            <input type="hidden" name="check">
            <input type="text" name="qno" value="<%=qno%>">
            <button type="submit">Next</button>
        </form>

    </body>
</html>
