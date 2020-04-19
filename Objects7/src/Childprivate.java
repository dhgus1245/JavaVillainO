//	오버라이딩
//	접근제어자는 조상클래스의 매서드보다 좁은범위로 변경할 수 없다
public class Childprivate extends Parent {

	private void method() {//오류발생
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(this.x);
	}
	
}
