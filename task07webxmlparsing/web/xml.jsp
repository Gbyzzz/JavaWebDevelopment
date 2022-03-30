<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>XML parser</title>
  </head>
  <body>
  <h1>Input xml file name and select parser</h1>
  <form method="post" name="select" action="/result" enctype="multipart/form-data">
    <input type="file" id="myFile" name="filename" required >
    <p></p><select name="command">
      <option disabled>Select parser</option>
      <option value="DOM">DOM</option>
      <option value="SAX">SAX</option>
      <option value="StAX">StAX</option>
  </select></p>
    <p><input type="submit" value="Parse"></p>
  </form>
  </body>
</html>
