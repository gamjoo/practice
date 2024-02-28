package ex07_08_private_field;

public class Numbers {

	private int[] num;

	// 여기서 생성자의 역할은 필드변수의 초기화
	Numbers(int[] num) {
		this.num = num;
	}

	int getTotal() {
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total += num[i];

			// for (int n : num) {
			// total += n;
		}

		return total;

	}

	int getAverage() {
		return getTotal() / num.length;
	}

}