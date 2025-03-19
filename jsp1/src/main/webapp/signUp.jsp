<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String myId = request.getParameter("id");
    	String myPw = request.getParameter("pw");
    	String myBirth = request.getParameter("birth");
    	String myEmail = request.getParameter("email");
    	
    	// 데이터베이스 저장하기 - 아이디 중복이면 저장x
    	
    	Connection conn =null;
    	Statement st = null;    	
    	
    	try{
	    	Class.forName("com.mysql.cj.jdbc.Driver");
   			
	    	String id = "Ruru";
	    	String pw = "1234";
	    	String url = "jdbc:mysql://localhost:3306/Ruru";
	    	
	    	conn = DriverManager.getConnection(url, id, pw);
	    	
	    	
    	} catch(Exception e){
    		System.out.println("드라이버 로드 및 접속 실패"); 
    		e.printStackTrace();
    	}
    	
    	// 회원가입 양식에 입력한 내용을 테이블에 저장하기
    	// 그전에 아이디 중복 확인
    	ResultSet rs = null;
    	
    	String sql = "select * from member1 where member_id = '" + myId + "'";
    	
    	try{
    		st = conn.createStatement();
    		rs = st.executeQuery(sql);    		
    		if( rs.next() ){ // 참이면 아이디 중복
    			// 아이디가 중복이면 회원가입 다시하게끔 회원가입페이지로 이동하게한다.
    			// 이동시키는 방법으론 자바스크립트 또는 내장객체를 사용하는 방법이 있다.

    			response.sendRedirect("main.jsp");
    			
    			
    			%>
    				<script>
    					// alert("아이디 중복이셈");
    					// history.back();
    					// location.href="main.jsp";
    					
    				</script>
    			<%
    			
    			
    		}
    		
    	} catch(Exception e){
    		System.out.println("아이디 중복 확인 조회 실패");
    		e.printStackTrace();
    	}
    	
    	// 아이디 중복 아니면 테이블에 회원정보를 데이터로 저장시키기
    	
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2> 회원가입 완료</h2>
	<h3> 회원 가입 내용</h3>
	<ul>
		<li>아이디 : <%=myId %></li>
		<li>비밀번호 : <%=myPw %></li>
		<li>생년월일 : <%=myBirth %></li>
		<li>이메일 : <%=myEmail %></li>		
	</ul>
		
	
	
</body>
</html>