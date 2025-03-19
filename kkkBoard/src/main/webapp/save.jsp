<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.concurrent.ExecutionException"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
	Connection conn = null;
	Statement st = null;
	Resultset rs = null;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/Ruru";
		String user = "Ruru";
		String pw = "1234";
		
		DriverManager.getConnection(url, user, pw) ;
				
	} catch(Exception e){
		System.out.println("드라이버 로드 실패");
		e.printStackTrace();
	}

	
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	String date = request.getParameter("date");
	
	String sql = "insert into kkk_board (title, writer, content, date) values('" + title + "', '" + writer + "'  )";
	



%>