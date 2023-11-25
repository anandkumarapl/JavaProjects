<%@page import="database.alltask"%>
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
                try {
                    QNO = request.getParameter("QNO");
                    QUESTION = request.getParameter("QUESTION");
                    OPTION1 = request.getParameter("OPTION1");
                    OPTION2 = request.getParameter("OPTION2");
                    OPTION3 = request.getParameter("OPTION3");
                    OPTION4 = request.getParameter("OPTION4");
                    CORRECTOPTION = request.getParameter("CORRECTOPTION");               
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("insert into quiz values(?,?,?,?,?,?,?)");
                    ps.setString(1, QNO);
                    ps.setString(2, QUESTION);
                    ps.setString(3, OPTION1);
                    ps.setString(4, OPTION2);
                    ps.setString(5, OPTION3);
                    ps.setString(6, OPTION4);
                     ps.setString(7, CORRECTOPTION);
                    int n = ps.executeUpdate();
                    Result = "Inserted " + " records";
//                    response.sendRedirect("InsertQuestion.jsp");
                } catch (Exception ex) {
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
                            <input required name="QNO" value="<%=QNO%>" type="number" class="form-control" id="floatingInput" placeholder="QNO"<%=QNO%>
                            
                            <div class="valid-feedback">
                            </div>
                        </div>
                        <div class="form-floating mb-3">
                            <label for="floatingInput">QUESTION</label>
                            <input required name="QUESTION"  value="<%=QUESTION%>"  type="text" class="form-control" id="floatingInput" placeholder="QUESTION"<%=QUESTION%>
                            
                            <div class="valid-feedback">
                            </div>
                        </div>
                        <div class="form-floating mb-3">
                            <label for="floatingInput">OPTION1</label>
                            <input required name="OPTION1" type="text"  value="<%=OPTION1%>"  class="form-control" id="floatingInput" placeholder="OPTION1"<%=OPTION1%>
                            
                            <div class="valid-feedback">
                            </div>
                             <div class="form-floating mb-3">
                                 <label for="floatingInput">OPTION2</label>
                            <input required name="OPTION2"   value="<%=OPTION2%>"   type="text" class="form-control" id="floatingInput" placeholder="OPTION2"<%=OPTION2%>
                            
                            <div class="valid-feedback">
                            </div>
                        </div>
                             <div class="form-floating mb-3">
                                 <label for="floatingInput">OPTION3</label>
                            <input required name="OPTION3" type="text"  value="<%=OPTION3%>"   class="form-control" id="floatingInput" placeholder="OPTION3"<%=OPTION3%>
                            
                            <div class="valid-feedback">
                            </div>
                        </div>
                             <div class="form-floating mb-3">
                                 <label for="floatingInput">OPTION4</label>
                            <input required name="OPTION4" type="text"   value="<%=OPTION4%>"  class="form-control" id="floatingInput" placeholder="OPTION4"<%=OPTION4%>
                            
                            <div class="valid-feedback">
                            </div>
                        </div>
                        <div class="form-floating mb-3">
                             <label for="floatingInput">CORRECT OPTION</label>
                             <input required name="CORRECTOPTION"   value="<%=CORRECTOPTION%>"   type="number" class="form-control" id="floatingInput" placeholder="CORRECTOPTION"<%=CORRECTOPTION%>
                           
                            <div class="valid-feedback">
                            </div>
                        </div>
                        <br>
                        <input class="btn btn-primary" type="submit">
                        <br>       
                        <br>
                        <%=alltask.getQuiz()%>
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