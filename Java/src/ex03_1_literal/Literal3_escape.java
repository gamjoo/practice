/*
 * escape character
 * 문자열 안에서 특수 문자를 표현하거나 특수 기능을 수행하는 문자
 * (1) tab        - \t
 * (2) new line   - \n
 * (3) 역슬래쉬      - \\
 * (4) 큰따옴표      - \"
 */

package ex03_1_literal;
public class Literal3_escape {
	public static void main(String args[]) {
		System.out.println("호호하하"); 
		System.out.println("\"호호하하\"");  //특수문자 쓰고 싶으면 \백슬래쉬
		System.out.println("호호\n하하\n"); // %n \n을 붙이면 한 줄 띔
		System.out.println("호호하하%n");
		System.out.println("호호\t하하"); 
		System.out.println("호호\\하하"); //특수문자 쓰고 싶으면 \백슬래쉬
	}
}
