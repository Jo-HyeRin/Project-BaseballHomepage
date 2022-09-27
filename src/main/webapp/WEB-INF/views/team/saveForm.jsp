<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form>
		<div class="mb-3 mt-3">
			<select id="stadiumId" class="form-control">
				<c:forEach var="stadium" items="${stadiumList}">
					<option value="${stadium.id}">${stadium.name}</option>
				</c:forEach>
			</select>
		</div>

		<div class="mb-3 mt-3">
			<input id="name" type="text" class="form-control" placeholder="Enter teamName">
		</div>
		<button id="btnInsert" type="button" class="btn btn-primary">팀등록완료</button>
	</form>
</div>

<script>
	$("#btnInsert").click(()=>{
		insert();
	});
	
	function insert(){
		let data = {
				name: $("#name").val(),
				stadiumId: $("#stadiumId").val()
		}
		
		$.ajax("/team",{
			type: "POST",
			dataType: "json",
			data: JSON.stringify(data),
			headers: {
				"Content-Type": "application/json; charset=utf-8"
			}
		}).done((res)=>{
			if(res.code == 1){
				location.href="/team";
			}else{
				alert("팀 등록에 실패하였습니다.");
			}
		});
	}
</script>

<%@ include file="../layout/footer.jsp"%>

