<%-- 
    Document   : newjsp
    Created on : Sep 13, 2023, 12:34:53 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Text to Speech</title>
  <link rel="icon" type="image/x-icon" href="https://3.bp.blogspot.com/-py5FbTZgvjo/YDi1bsQq16I/AAAAAAAACB0/BxejbJBcHA4AVfkB33WYC3YlVmxElM7BwCK4BGAYYCw/s1600/Varanasi%2BSoftware%2BJunction%2BPhone%2BLogo.png">
</head>
<body>
  <h1>Text to Speech Example</h1>
  <p>Click the button below to hear a text-to-speech message:</p>
  <button id
          ="speakButton">Speak</button>
          
          <%
          String messege="hello anand pal";
          %>

  <script>
    document.addEventListener('DOMContentLoaded', function () {
      // Check if the browser supports the Web Speech API
      if ('speechSynthesis' in window) {
        // Create a new SpeechSynthesisUtterance
        var message = new SpeechSynthesisUtterance("<%=messege%>");

        // Set voice options (optional)
        message.voice = speechSynthesis.getVoices()[0]; // You can choose a specific voice
        message.rate = 1; // Speed of speech (0.1 to 10)
        message.pitch = 1; // Pitch of speech (0 to 2)

        var speakButton = document.getElementById('speakButton');

        speakButton.addEventListener('click', function () {
          // Speak the text when the button is clicked
          window.speechSynthesis.speak(message);
        });
      } else {
        console.error('Speech synthesis is not supported in this browser.');
      }
    });
  </script>
</body>
</html>