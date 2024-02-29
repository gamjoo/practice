package ex17_15_Runnable_Interface_anonymous_ramda;

@FunctionalInterface // 두 개 이상의 추상메소드가 선언되면 컴파일 오류를 발생시킨다.
public interface Negative {
	int neg(int x);
	//int neg2(int x);

}
