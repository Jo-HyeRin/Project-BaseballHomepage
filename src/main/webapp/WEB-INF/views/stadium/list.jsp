<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />

	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>경기장이름</th>
				<th>개장일</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="stadium" items="${stadiumList}">
			<tr>
				<td>${stadium.no}</td>
				<td>${stadium.name}</td>
				<td>${stadium.createdAt}</td>
				<td><button onclick="deleteById(${stadium.id});" class="btn btn-danger">삭제</button></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

</div>

<script>

	function deleteById(id){		
		$.ajax("/stadium/"+id,{
			type: "delete",
			dataType: "json"
		}).done((res)=>{
			if(res.code == 1){
				alert("삭제되었습니다.");
				location.reload();
			}else{
				alert("삭제에 실패하였습니다.");
			}
		});		
	}
	
</script>

<%@ include file="../layout/footer.jsp"%>

