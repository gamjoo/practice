<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container mt-3">
  <h2>인기상품 Table</h2>
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
        <td>나주 배</td>
        <td>31,900</td>
        <td>과일꾼</td>
      </tr>
      <tr>
        <td>샤인머스켓</td>
        <td>21,900</td>
        <td>다농이네</td>
      </tr>
      <tr>
        <td>그린키위</td>
        <td>13,900</td>
        <td>거북이농산</td>
      </tr>
      <tr>
        <td>아이스홍시</td>
        <td>23,900</td>
        <td>경북청도 이해두</td>
      </tr>
    </tbody>
  </table>
</div>
</body>

<script>
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      console.log($(this).text().toLoserCase().indexOf(value) > -1)
    	
//toggle(true)는 선택한 요소를 보이도록 설정하는 메소드
//toggle(false)는 선택한 요소에 style="display:none;" 속성이 추가되어 보이지 않도록 한다
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
</script>

</html>