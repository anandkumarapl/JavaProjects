<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <center>
        <title>Insert</title>
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
            if (ispostback) {
                try{
                    QNO = request.getParameter("QNO");             
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("SELECT * FROM quiz WHERE QNO = ?");
                    ps.setString(1, QNO);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        QUESTION  = "" + rs.getObject("QUESTION");
                        OPTION1 = "" + rs.getObject("OPTION1");
                        OPTION2 = "" + rs.getObject("OPTION2");
                         OPTION3 = "" + rs.getObject("OPTION3");
                          OPTION4 = "" + rs.getObject("OPTION4");
                          CORRECTOPTION = "" + rs.getObject("CORRECTOPTION");
                           int n = ps.executeUpdate();
                             Result ="records"+"Founded";
                    }
                             else{
                                  Result="Not Founded";   
                                     }
//                    response.sendRedirect("InsertQuestion.jsp");
                
            }catch(Exception ex){
                System.out.println(ex);
                    Result = ex.getMessage();
                    }
            }
        %>
<h1>Quiz</h1>
        <form method="post">
           <%=Result%>
            <input type="hidden"  name="check" value="1"><br>
            <br>

            <div class="container">
                <div class="row">
                    <div class="col-md-3"></div>

                        <div class="form-floating mb-3">
                            <label for="floatingInput">QNO</label>
                            <input  name="QNO" value="<%=QNO%>" type="number" class="form-control" id="floatingInput" placeholder="QNO"
                            
                            <div class="valid-feedback">
                            </div>
                        </div>
                        <div class="form-floating mb-3">
                            <label for="floatingInput">QUESTION</label>
                            <input  name="QUESTION"  value="<%=QUESTION%>"  type="text" class="form-control" id="floatingInput" placeholder="QUESTION"
                            
                            <div class="valid-feedback">
                            </div>
                        </div>
                        <div class="form-floating mb-3">
                            <label for="floatingInput">OPTION1</label>
                            <input  name="OPTION1" type="text"  value="<%=OPTION1%>"  class="form-control" id="floatingInput" placeholder="OPTION1"
                            
                            <div class="valid-feedback">
                            </div>
                             <div class="form-floating mb-3">
                                 <label for="floatingInput">OPTION2</label>
                            <input  name="OPTION2"   value="<%=OPTION2%>"   type="text" class="form-control" id="floatingInput" placeholder="OPTION2"
                            
                            <div class="valid-feedback">
                            </div>
                        </div>
                             <div class="form-floating mb-3">
                                 <label for="floatingInput">OPTION3</label>
                            <input  name="OPTION3" type="text"  value="<%=OPTION3%>"   class="form-control" id="floatingInput" placeholder="OPTION3"
                            
                            <div class="valid-feedback">
                            </div>
                        </div>
                             <div class="form-floating mb-3">
                                 <label for="floatingInput">OPTION4</label>
                            <input  name="OPTION4" type="text"   value="<%=OPTION4%>"  class="form-control" id="floatingInput" placeholder="OPTION4"
                            
                            <div class="valid-feedback">
                            </div>
                        </div>
                        <div class="form-floating mb-3">
                             <label for="floatingInput">CORRECT OPTION</label>
                             <input  name="CORRECTOPTION"   value="<%=CORRECTOPTION%>"   type="number" class="form-control" id="floatingInput" placeholder="CORRECTOPTION"
                           
                            <div class="valid-feedback">
                            </div>
                        </div>
                        <br>
                            <button class="btn btn-primary" type="submit">submit</button>
                        <br>       
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        </form>
                        </body>
                        </html>
                        </center>