<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>KBC </title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    </head>

    <style>
        body{
            background-image: url('Images/1.jpg');
        }
        div{
        }
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;


        }
        td{
            border: 1px solid #dddddd;
            text-align: left;
            text-align: center;
            padding: 17px;
        }
        th {
            border: 1px solid #dddddd;
            text-align: left;
            text-align: center;
            padding: 15px;
        }
        tr:nth-child(even) {
            background-color: gray;
        }
        tr:nth-child(odd) {
            background-color: goldenrod;
        }
        .trs {
            background-color: mistyrose;
            border-radius: 5px;
            padding: 10px;
        }

        .Question{
            background-color: blueviolet;
            text-align: center;
            border-radius: 10px;
            border: solid black;
        }
        .Question:hover{
            Question-radius: 100px;
            box-shadow: 2px 2px 2px 2px red;
            transition: 5ms;


        }
        .option{
            background-color: lightcyan;
            text-align: center;
            padding: 20px;
            border-radius: 10px; 
            border: solid black;

        }
        .button{
            background-color: lightgray;
            padding: 10px;
            border-radius: 10px; 
            border: solid black;
        }
        .button:hover{

        }
        .KaunBanegaCrorepati{
            text-align: center;
            background-color: red;
            border-radius: 40px;
            height:  110%;
            border: solid black;
        }
        .KaunBanegaCrorepati:hover{
            KaunBanegaCrorepati-radius: 100px;
            box-shadow: 2px 2px 2px 2px blue;
            transition: 5ms;

        }
        .rightwrong{
            text-align: center;
            background-color: yellow;
            border-radius: 4000px;
            border: solid black;
        }
        .timer{
            text-align: center;
            background-color: yellowgreen;
            border-radius: 100px;
        }

    </style>
    <body>

        <%
            String style = "style='display:none;'";
            int QNO = 1;
            String prize[] = {"You Won = 0", "You Won = 0", "You Won =00", "You Won = 1000", "You Won = 5000", "You Won = 6000", "You Won = 7000"};
            int count = 0;

            if (session.getAttribute("count") != null) {
                count = Integer.parseInt("" + session.getAttribute("count"));
            }

            String result = "";
            String prizes = "";
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
                
                response.sendRedirect("Quiz2.jsp");
            }

            String QUESTION = "", OPTION1 = "", OPTION2 = "", OPTION3 = "", OPTION4 = "", CORRECTOPTION = "1", Result = "";

            System.out.println(ispostback);
            if (ispostback) {
                style = "style='display:;'";
                out.println("Here");
                try {

                    int option = Integer.parseInt(request.getParameter("option"));
                    int answer = Integer.parseInt(request.getParameter("answer"));
                    if (option == -1) {

                    } else {
                        if (option == answer) {
                            result = "Correct ";
                            count++;
                        } else {
                            result = "Wrong";
                            response.sendRedirect("gameover.html");
                            //count--;
                        }
                    }
                    session.setAttribute("count", count);
                    QNO = Integer.parseInt(request.getParameter("QNO"));
                    if (QNO >3) {
                        result = "Quiz OVER" + count;
                        response.sendRedirect("gameover.html");
                    }
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("SELECT * FROM quiz WHERE QNO = ?");
                    ps.setInt(1, QNO);
                    QNO++;
                    prizes = prize[QNO];
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        QUESTION = "" + rs.getObject("QUESTION");

                        Result = "";

                    } else {
                        Result = "";
                    }

                } catch (Exception ex) {
                    System.out.println(ex);
                    Result = ex.getMessage();
                }
            }
        %>
    </body>
    <div class="container">
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <div class="KaunBanegaCrorepati">
                    <h1>Kaun Banega Crorepati</h1>

                </div>
            </div>
            <div class="col-2"></div>
        </div>
        <form method="post">


            <input  name="QNO"  value="<%=QNO%>"  type="hidden" class="form-control" id="floatingInput" placeholder="QNO"</input>
            <br>
           
            <input type="hidden" name="answer" value="<%=CORRECTOPTION%>">
            <h1> <%=Result%></h1>
            <input type="hidden"  name="check" value="1"><br>
           
            <br>
            <div class="row">
                <input checked style="display:none" required class="form-check-input"    type="radio" name="option" value="-1">
                <div class="col-8"> 
                    </div>
                    <br>
                    <div>
                        <div class="button"><button  class="btn btn-primary form-control padding " type="Start" id
                                                     ="oooo">Click To Start </button><br><br>
                        </div>
                    </div>
                </div>
                <div class="col-4">                       
                </div>

            </div>
    </div>
</form>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>

</html>