
public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point();
		
		Point3D p3 = new Point3D(1,2,3);
		String resultStr = "";
		
		resultStr = p.getLocation();
		System.out.println(resultStr);
		
		resultStr = p3.getLocation();
		System.out.println(resultStr);
	}
	//main은 static의 영역이기 때문에 extends나 super, this 등을 사용할 수 없다.

}
