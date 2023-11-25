<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Insert</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

    </head>
    <style>
        div{

        }
        body{
            text-align: center;
        }
    </style>
    <body>
        <%
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String QUESTION = "", OPTION1 = "", OPTION2 = "", OPTION3 = "", OPTION4 = "", CORRECTOPTION = "", Result = "";
            int QNO=1;
            int count=0;
            System.out.println(ispostback);
            if (ispostback) {
                try {
//                    QNO = request.getParameter("QNO");
                    QNO = Integer.parseInt(request.getParameter("QNO"));     
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("SELECT * FROM quiz WHERE QNO = ?");
                   ps.setInt(1, QNO);
                   QNO++;
                    ResultSet rs = ps.executeQuery();                  
                    if (rs.next()) {
                        QUESTION = "" + rs.getObject("QUESTION");
                        OPTION1 = "" + rs.getObject("OPTION1");
                        OPTION2 = "" + rs.getObject("OPTION2");
                        OPTION3 = "" + rs.getObject("OPTION3");
                        OPTION4 = "" + rs.getObject("OPTION4");
                        CORRECTOPTION = "" + rs.getObject("CORRECTOPTION");
                        
                        int n = ps.executeUpdate();
                        Result = "records" + "Founded";
                        
                          
                    } else {
                        Result = "Not Founded";
                    }
                    
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
                    <div class="col-2"></div>
                    <div class="col-8"><input  name="QNO"  value="<%=QNO%>"  type="text" class="form-control" id="floatingInput" placeholder="QNO"</input>                        
                    </div>
                    <div class="col-2"></div>                    
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-2"></div>
                        <div class="col-8"><h1> <%=QUESTION%></h1>                        
                        </div>
                        <div class="col-2"></div>                    
                    </div>
                    <div class="row">
                        <div class="col-12">
                            <table width='100%' border='1'>
                                <tr><td class="form-control"><label class="form-control form-check-label"><%=OPTION1%><input class="form-check-input" type="radio" name="option" value="a"></label></td><td class="form-control"><label class="form-control form-check-label"><%=OPTION2%><input type="radio" name="option" value="b"></label></td></tr>
                                <tr><td class="form-control"><label class="form-control form-check-label"><%=OPTION3%><input type="radio" name="option" value="c"></label></td><td class="form-control"><label class="form-control for"><%=OPTION4%><input type="radio" name="option" value="d"></label></td></tr>

                            </table>

                        </div>


                    </div>




                </div>
            </div>
                                <button class="btn btn-primary" type="submit">Lock </button></form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

    </body>
</html>
