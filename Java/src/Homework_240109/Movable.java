package Homework_240109;

public interface Movable {
	abstract void moveTo(int x, int y);				// 절대 위치로 이동한다

	abstract void moveBy(int xOffset, int yOffset); // 상대 위치만큼 이동한다

}
