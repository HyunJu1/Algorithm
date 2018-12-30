<!-- Copyright �� 2013 Lee, Kim & Park, Life & Power Press -->

<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.text.*" %>
<% request.setCharacterEncoding("euc-kr"); %>

<html>
  <head><title> JSP�� �̿��� �������� </title></head>
  <body>
  <%
     int choice_id, i;
     int opinion[] = {0, 0, 0, 0};
     float total, rate[] = {0, 0, 0, 0};
     String choice = ""; 
     String fruit[] = {"���", "����", "����", "�޷�"};
     String opinion_id = request.getParameter("opinion_id");
     Connection conn = null;
     Statement stmt = null;
     String sql = ""; 
     ResultSet rs = null;

     try { 
            Class.forName("com.mysql.jdbc.Driver");
	    String url = "jdbc:mysql://localhost:3306/opinion_db";
	    conn = DriverManager.getConnection(url, "manager", "wppass");
            stmt = conn.createStatement();	 
            sql = "select * from opinion_tbl";
  	    rs = stmt.executeQuery(sql);
     } 
     catch(Exception e) {
            out.println("DB ���� �����Դϴ�. : " + e.getMessage());
     } 

     if(!rs.next()) {
	    for(i = 0; i < 4; i++) {
	       String sql1 = "insert into opinion_tbl values (" + i + ",'" + fruit[i] + "', 0)";
 	       try{ 
                 stmt.executeUpdate(sql1); 
               }
               catch(Exception e) {
                 out.println("DB ���� �����Դϴ�. : " + e.getMessage());
               }
            }
      }
     else {
       rs.previous();

       i = 0;

       while(rs.next()) {
             opinion[i] = Integer.parseInt(rs.getString("sum"));	
             i++;
       }
     } 

     if(opinion_id != null) {
  	    String sql2 = "update opinion_tbl set sum = sum + 1 where id = " + opinion_id;
	    try{ 
   	          stmt.executeUpdate(sql2);
            }
            catch(Exception e) {
                  out.println("DB ���� �����Դϴ�. : " + e.getMessage());
            }
     }
	
  choice_id = Integer.parseInt(opinion_id);  
  opinion[choice_id] += 1;

  total = opinion[0] + opinion[1] + opinion[2] + opinion[3];
  
  for(i = 0; i < 4; i++)
       rate[i] = (opinion[i] / total) * 100;
 %>
 <center> 
 <h2> �������� ��� </h2>
 <table border="0" width="500">
   <tr>
       <td bgcolor="yellow" width="30%"><b> ��� : <%=Math.round(rate[0])%>%</b></td>
       <td><img src="image/blue_pole.gif" width=<%=rate[0]%>% height="25"></td>
   </tr>
   <tr>
       <td bgcolor="orange"><b> ���� : <%=Math.round(rate[1])%>% </b></td>
       <td><img src="image/blue_pole.gif" width=<%=rate[1]%>% height="25"></td>
   </tr>
   <tr>
       <td bgcolor="salmon"><b> ���� : <%=Math.round(rate[2])%>% </b></td>
       <td><img src="image/white_pole.gif" width=<%=rate[2]%>% height="25"></td>
   </tr>
   <tr>
       <td bgcolor="red"><b> �޷� : <%=Math.round(rate[3])%>%</b></td>
       <td><img src="image/white_pole.gif" width=<%=rate[3]%>% height="25"></td>
   </tr>
  </table><br><br>   

  ����� <font color="blue"><b><%=fruit[choice_id]%></b></font>��(��) �����Ͽ����ϴ�.<br>
  �� <b><font color="red"><%=Math.round(total)%></font></b>���� �����Ͽ����ϴ�.<br><br> 
  <a href="opinion.html"> ó������ </a>
 </center>
 </body>
</html>
