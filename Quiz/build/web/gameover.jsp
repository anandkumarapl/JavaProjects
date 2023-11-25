<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <style>
        body{
            background-color: lightyellow;
        }
        h1{
            background-color: red;
            border-radius: 20px;
            text-align: center;
        }
        h2{
            background-color: red;
            border-radius: 20px;
            text-align: center;
        }
       
        </style>
    <body>
        <br>
         <br>
        <div class="container">
        <div class="row">
             <div class="col-4"></div>
            <div class="col-4"><h1>GAME OVER</h1></div>
             <div class="col-4"></div>
        
        </div>
             <div class="row">
             <div class="col-4"></div>
            <div class="col-4"><h1><%=session.getAttribute("prize")%></h1></div>
             <div class="col-4"></div>
        
        </div>
        </div>
    </body>
</html>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

