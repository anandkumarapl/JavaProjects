<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
  </head>
  <Style>
      div{
          
      }
      body{
          background-color: blueviolet;
          text-align:center;
          
      }
      button{
          background-color: red;
      }
      </Style>
      
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
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("SELECT * FROM quiz WHERE QNO = 1");
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
      
      
    <h1>Quiz App</h1>
    <div class="container">
        <div class="row">
            <div class="col-1"><img src="Images/logo1.jpg"></div>
            <div class="col-1"><img src="Images/logo4.jpg"></div>
            <div class="col-8"></div>
            <div class="col-1"><img src="Images/logo2.jpg"></div>
            <div class="col-1"><img src="Images/logo3.jpg"></div>
        </div> 
         <div class="row">
            <div class="col-4"></div>
            <div class="col-4"><img src="Images/logo.jpg"></div>
            <div class="col-4"></div>
        </div> 
        <div class="row">
            <div class="col-3"></div>
            <div class="col-6">What Is Your Name</div>
            <div class="col-3"></div>
        </div> 
       <div class="row">
            <div class="col-2"></div>
            <div class="col-4"><input type="radio">Amit</div>
            <div class="col-4"><input type="radio">  <input  name="OPTION1" type="text"  value="<%=OPTION1%>"  class="form-control" id="floatingInput" placeholder="OPTION1"</div>
            <div class="col-2"></div>
        </div> 
        <div class="row">
            <div class="col-2"></div>
            <div class="col-4"><input type="radio">Sachin</div>
            <div class="col-4"><input type="radio">Karan</div>
            <div class="col-2"></div>
        </div> 
         <div class="row">
            <div class="col-5"></div>
            <div class="col-2"><button type="button">Submit</button></div>
            <div class="col-5"></div>
        </div> 
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  </body>
</html>
