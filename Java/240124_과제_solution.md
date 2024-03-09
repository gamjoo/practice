![[Pasted image 20240125090442.png]]
###### ★|| 써서 or 조건으로 쓰면 코드를 더 간결하게 쓸 수 있었다.

![[Pasted image 20240125090541.png]]
###### ★case "1"인 경우와 case "3"인 경우에 동일한 값이 출력되므로, 명령문을 한번만 쓸 수 있었다.

![[Pasted image 20240125090703.png]]
###### ★java 17 버전부터는 case문을 따로 적지 않고, 콤마로 연결할 수 있다.
```java
package Homework_package;
public class Homework_240124_switchcase_caselabel {
public static void main(String[] args) {

String jumin = "123456-4123456";

for (int i=0; i<jumin.length(); i++) {
char ch = jumin.charAt(i);
System.out.println("index"+i+" 문자 = "+ch);
}

switch (jumin.substring(7,8)) {
case "1", "3" :
System.out.println("추출한 숫자는 "+jumin.substring(7,8)+"이고 남자입니다.");
break;

case "2", "4" :
System.out.println("추출한 숫자는 "+jumin.substring(7,8)+"이고 여자입니다.");
break;

default :
System.out.println("추출한 숫자는 "+jumin.substring(7,8)+"이고 외국인입니다.");
}
}
}
```

![[Pasted image 20240125091050.png]]
###### ★ -> 화살표 케이스 라벨을 사용하면 마지막에 break를 사용한 것과 동일하다. 실행문이 여러 개인 경우 중괄호로 묶어줘야 한다.
```java
package Homework_package;
public class Homework_240124_switchcase {
public static void main(String[] args) {

String jumin = "123456-4123456";

for (int i=0; i<jumin.length(); i++) {
char ch = jumin.charAt(i);
System.out.println("index"+i+" 문자 = "+ch);
}

switch (jumin.substring(7,8)) {
case "1", "3"
-> System.out.println("추출한 숫자는 "+jumin.substring(7,8)+"이고 남자입니다.");
case "2", "4"
-> System.out.println("추출한 숫자는 "+jumin.substring(7,8)+"이고 여자입니다.");
default
-> System.out.println("추출한 숫자는 "+jumin.substring(7,8)+"이고 외국인입니다.");
}
}
}
```

![[Pasted image 20240125091615.png]]
###### ★ switch / case 문 리턴값을 변수에 넣을 수도 있다.
```java
package Homework_package;
public class Homework_240124_switchcase {
public static void main(String[] args) {

String jumin = "123456-4123456";

for (int i = 0; i < jumin.length(); i++) {
char ch = jumin.charAt(i);
System.out.println("index" + i + " 문자 = " + ch);
}

String result = switch (jumin.substring(7, 8)) {
case "1", "3" -> "남자";
case "2", "4" -> "여자";
default -> "외국인";
}; // 반드시 세미콜론 작성해야 한다.

System.out.print(result);
}
}