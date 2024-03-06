<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
<div class="container mt-3">
  <h2>신상품 Table</h2>
  <p>상품을 입력하세요.</p>  
  <input class="form-control" id="myInput" type="search" placeholder="Search..">
  <br>
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>상품이름</th>
        <th>가격</th>
        <th>제조사</th>
      </tr>
    </thead>
    <tbody id="myTable">
      <tr>
        <td>백화점과일바구니(특)</td>
        <td>119,000</td>
        <td>과일나라</td>
      </tr>
      <tr>
        <td>못난이 사과</td>
        <td>18,900</td>
        <td>달콤한농부들</td>
      </tr>
      <tr>
        <td>프리미엄 골드망고</td>
        <td>16,800</td>
        <td>대디스팜</td>
      </tr>
      <tr>
        <td>황금향</td>
        <td>29,900</td>
        <td>참좋은제주몰</td>
      </tr>
    </tbody>
  </table>
</div>

<script>
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
    	
//toggle(true)는 선택한 요소를 보이도록 설정하는 메소드
//toggle(false)는 선택한 요소에 style="display:none;" 속성이 추가되어 보이지 않도록 한다
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
</script>

</body>
</html>