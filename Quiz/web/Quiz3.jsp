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
        .t1{
            background-color: red;
        }
        .prize{
                background-color: lightgreen;
            }
            .noprize{
                background-color: lightblue;
            }

    </style>
    <body>

        <%
            String prize[] = {"You Won =0","You Won =0","You Won =0", "You Won =1000","You Won =2000","You Won =3000","You Won =5000","You Won =10000","You Won =20000","You Won =40000","You Won =80000","You Won =1600000","You Won =3200000","You Won =6400000","You Won =1250000","You Won =2500000","You Won =5000000","You Won =10000000","You Won =70000000"};

            int QNO = 1;
            int count = 2;
            String prizes = "";
            String pri="";
            if (session.getAttribute("count") != null) {
                count = Integer.parseInt("" + session.getAttribute("count"));
            }
            String QUESTION = "", OPTION1 = "", OPTION2 = "", OPTION3 = "", OPTION4 = "", CORRECTOPTION = "", Result = "";

            String result = "";
                try{
                    
                if (request.getParameter("QNO") == null) {
                    QNO = 1;
                } else {
                    QNO = Integer.parseInt(request.getParameter("QNO"));
                }
                
                PreparedStatement ps = database.DbConnect.connect().prepareStatement("SELECT * FROM quiz WHERE QNO = ?");
                ps.setInt(1, QNO);
                QNO++;
                prizes = prize[QNO];
                pri=prize[count];
                
                 if (QNO > 5) {
                   session.setAttribute("prize",prizes);
                   response.sendRedirect("gameover.jsp");
                }
                
                
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {

                    QUESTION = "" + rs.getObject("QUESTION");
                    OPTION1 = "" + rs.getObject("OPTION1");
                    OPTION2 = "" + rs.getObject("OPTION2");
                    OPTION3 = "" + rs.getObject("OPTION3");
                    OPTION4 = "" + rs.getObject("OPTION4");
                    CORRECTOPTION = "" + rs.getObject("CORRECTOPTION");

//                        int n = ps.executeUpdate();
                    Result = "";

                } else {
                    Result = "";
                }
}
                catch(Exception ex){
                        System.out.println(ex);
                        }

            try {
               
                int option = Integer.parseInt(request.getParameter("option"));
                int answer = Integer.parseInt(request.getParameter("answer"));
                if (option == answer) {
                    result = "Correct ";
                    count++;
                } else {
                    result = "Wrong";
                     session.setAttribute("prize",pri);
                    response.sendRedirect("gameover.jsp");
                    //count--;
                }
                 session.setAttribute("count", count);
            } catch (Exception ex) {
                System.out.print(ex);

            }
        %>
        <script>

            var message = new SpeechSynthesisUtterance("Options");
            document.addEventListener('DOMContentLoaded', function () {
                // Check if the browser supports the Web Speech API
                if ('speechSynthesis' in window) {
                    // Create a new SpeechSynthesisUtterance
             var message = new SpeechSynthesisUtterance("<%=QUESTION%>,Options<%=OPTION1%>,<%=OPTION2%>,<%=OPTION3%>,<%=OPTION4%>");

                                // Set voice options (optional)
                                message.voice = speechSynthesis.getVoices()[0]; // You can choose a specific voice
                                message.rate = 1; // Speed of speech (0.1 to 10)
                                message.pitch = 1; // Pitch of speech (0 to 2)

                                var speakButton = document.getElementById('speakButton');

       //        speakButton.addEventListener('click', function () {
       //          // Speak the text when the button is clicked
       //          window.speechSynthesis.speak(message);
       //        });

                                speakButton.addEventListener('click', function () {
                                    // Speak the text when the button is clicked
                                    window.speechSynthesis.speak(message);
                                });
                            } else {
                                console.error('Speech synthesis is not supported in this browser.');
                            }
                        });
                        function amitabh() {
                     var message = new SpeechSynthesisUtterance("<%=QUESTION%>,Options<%=OPTION1%>,<%=OPTION2%>,<%=OPTION3%>,<%=OPTION4%>");
                                    message.voice = speechSynthesis.getVoices()[0]; // You can choose a specific voice
                                    message.rate = 1; // Speed of speech (0.1 to 10)
                                    message.pitch = 1; // Pitch of speech (0 to 2)
                                    window.speechSynthesis.speak(message);
                                    console.log("Done")
                                }
                                window.onload(amitabh());
                                      amitabh();

        </script>
    <body>
        <div class="timer">
            <div id="some_div" >
            </div>
        </div>
        <script>
            var timeLeft = 30;
            var elem = document.getElementById('some_div');

            var timerId = setInterval(countdown, 1000);

            function countdown() {
                if (timeLeft == -1) {
                    clearTimeout(timerId);
                } else {
                    elem.innerHTML = timeLeft + ' seconds remaining';
                    timeLeft--;

                }
            }
        </script>
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
            <br>
            <div class="row">
                <div class="col-4"></div>
                <div class="col-4"> <div class="rightwrong"> <h2><%=result%></h2><h2><%=prizes%></h2></div></div>
                <div class="col-4"></div>
            </div>
            <br>
            
            <input type="hidden" name="answer" value="<%=CORRECTOPTION%>">
            <h1> <%=Result%></h1>
            <div class="row">
                <div class="Question">
                    <div class="col-12">

                        <h1><%=QUESTION%></h1> 

                    </div>
                </div>

            </div>
                        <br>
            <div class="row">
                <div class="col-8"> <div class="option"><table width='100%' border='2'>
                            <tr><td><label class="form-control form-check-label"><div class="trs"><%=OPTION1%>
                                            <input required class="form-check-input" type="radio" name="option" value="1"></label></div></td>

                                <td><label class="form-control form-check-label"><div class="trs"><%=OPTION2%><input  class="form-check-input" required type="radio" name="option" value="2"></label></div></td></tr>
                            <tr><td><label class="form-control form-check-label"><div class="trs"><%=OPTION3%>
                                            <input  class="form-check-input" required type="radio" name="option" value="3"></label></div></td>
                                <td><label class="form-control for"><div class="trs"><%=OPTION4%>
                                            <input required type="radio"  class="form-check-input" name="option" value="4"></label></div></td>

                            </tr>

                        </table>
                    </div>
                    <br>
                    <div>
                        <div class="button"><button  class="btn btn-primary form-control padding " type="submit" id
                                                     ="oooo">Lock </button><br><br>
                            <button id
                                    ="speakButton"   class="padding btn btn-success form-control"  type="button" class="">Speak</button>


                        </div>
                    </div>
                </div>
                <div class="col-4">  
                     
        <% 
            int[] prz={1000,2000,3000,5000,10000,20000,40000,80000,1600000,3200000,6400000,1250000,2500000,5000000,10000000,70000000};
          
            for (int i = 15; i >= 0; i--) {

                if (i == QNO-2) {
        %>

        <h1  class="prize">Prize <%=prz[i]%>
            
        </h1>
                
        <%
        } else {
        %>
        <h1 class="noprize">Prize <%=prz[i]%></h1>

        <%
            
                }
            }
        %>
                </div>

            </div>
            <br>
            <div class="row">

                <div>
                   
                </div>
            </div>
            <div class="col-4">                      
            </div>

    </div>
</form>
                                            


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>

</html>