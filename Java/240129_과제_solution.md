![[Pasted image 20240130090528.png]]sort 메소드를 정의하는 논리

```java
	// 학생별 총점을 기준으로 정렬하기
	static void sort(ArrayList<Student2> as) {
		for (int i=0; i<as.size()-1; i++) {
			for (int j=i+1; j<as.size(); j++) {
				Student2 a = as.get(i);
				Student2 b = as.get(j);
				if(a.getTotal() < b.getTotal()) {
						as.set(i, b);
						as.set(j, a);
				}
			}
		}
		// 채우기
	}
```
내 코드에서는 Student2 타입의 변수 a, b 를 만들어서 imsi 변수를 쓰지 않았다.
만약 변수 선언하지 않고, as로만 접근해서 풀려고 했으면 if절에 imsi를 만들어 바꾸는 논리로 해야 한다.