package ex17_15_Runnable_Interface_anonymous_ramda_method;

@FunctionalInterface // 2개 이상의 추상메소드가 선언되면 컴파일 오류가 발생
public interface Parse {
	int toInt(String x);

}
