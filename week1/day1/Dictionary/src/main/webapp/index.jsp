<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/translate" method="get">
    <label>Word</label>
    <input type="text" name="word" placeholder="Enter A English Word" required>
    <button type="submit">Translate</button>
  </form>
  </body>
</html>
