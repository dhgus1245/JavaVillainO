//	오버라이딩
//	접근제어자는 조상클래스의 매서드보다 좁은범위로 변경할 수 없다
public class Child extends Parent {

	public void method() {
		System.out.println("x = "+x);
		System.out.println("this.x="+ this.x);
		System.out.println("super.x="+ super.x);
	}
	
}
