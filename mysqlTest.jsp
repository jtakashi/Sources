<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	user_id　　pass
	<%
		Class.forName("com.mysql.jdbc.Driver"); //ドライバが登録される
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4?"+
		"user=root&characterEncoding=utf-8");
		Statement st =conn.createStatement();
		//ResultSet res =st.executeQuery("select * from account");
		ResultSet res =st.executeQuery("select user_id, convert(AES_DECRYPT(UNHEX(pass), 'PWD')USING utf8), mail, name, age from account where convert(AES_DECRYPT(UNHEX(pass), 'PWD')USING utf8)='1234';");
		while(res.next()){
			out.println("<br>");
			out.println("<p>"+ res.getString("user_id") +"　　");
			//out.println(res.getString("pass"));
			out.println(res.getString("convert(AES_DECRYPT(UNHEX(pass), 'PWD')USING utf8)") + "</tp>");
			out.print("</br>");
		}
		st.close();
		conn.close();
	%>
</body>
</html>