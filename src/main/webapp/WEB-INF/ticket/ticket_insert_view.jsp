<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <!DOCTYPE html>
 <html>
 <head>
 <meta charset="UTF-8">
 <title> 정기권 입력 </title>
 <c:forEach var="arrayList" items="${arrayList}">
 <c:if test="${arrayList.ticket_code==param.ticket_code}"> 
<script type="text/javascript"> 
alert("입력하신 ${param.ticket_code}번의 부서 번호가 존재합니다. 다시 입력하세요");
 location.href="./TicketInsert.hk";
 </script>
 </c:if> 
</c:forEach>
 </head>
 <body>
 <script type="text/javascript">
alert("입력하신 ${ticketDTO.ticket_code}번의 부서 번호를 등록하였습니다.");
 location.href="./TicketSearch.hk"
 </script>
 </body>
 </html>