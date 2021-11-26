<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Main Menu Exchange</title>
  </head>
  <body>
  <form action="/exchange" method="get" name="exchangeMoney">
    <div>
      <label>USD</label>
      <input type="number" name="usd" placeholder="Enter amount of USD" required>
      <button type="submit">Exchange</button>
    </div>
  </form>
  </body>
</html>
