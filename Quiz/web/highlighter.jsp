<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Highlighter</title>
        <style>
            .prize{
                background-color: lightgreen;
            }
            .noprize{
                background-color: lightblue;
            }
        </style>
    </head>
    <body>
        <% int qno = 8;
        int[] prizes={1000,2000,3000};
        
        
        %>
        <h1>Highlighter</h1>  
        <% for (int i = 15; i >= 1; i--) {

                if (i == qno) {
        %>

        <h1  class="prize">Prize <%=i%></h1>
        <%
        } else {
        %>
        <h1 class="noprize">Prize <%=i%></h1>

        <%
                }
            }
        %>
    </body>
</html>
