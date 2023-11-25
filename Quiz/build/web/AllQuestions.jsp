de<%@page import="database.alltask"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <center>
    <title>show</title>
            <style>
            div {
                margin-bottom: 10px;
            }
            label {
                display: inline-block;
                width: 150px;
                text-align: right;
                color: black;
            }
        </style>
        </head>
    <body>
        <h1>Quiz</h1>
          <%
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String QNO = "", QUESTION = "", OPTION1 = "", OPTION2 = "", OPTION3="",OPTION4="",CORRECTOPTION="",Result = "";
            System.out.println(ispostback);
            PreparedStatement Ps=database.DbConnect.connect().prepareStatement("select*from quiz order by qno");
            %>
            <form method="post">
            <%=Result%>
            <input type="hidden"  name="check" value="1"><br>
            <br>
            
             <div class="container">
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6">

                <div class="form-floating mb-3">
                 
                </div>
             <div class="form-floating mb-3">
                
                </div>
             <div class="form-floating mb-3">
                    
                </div>
              <div class="form-floating mb-3">
                  
                </div>
                 <%=alltask.getQuiz()%>
            </body>
        </form>
</center>
        </html>
<br>
<br>
<br>
<br>
