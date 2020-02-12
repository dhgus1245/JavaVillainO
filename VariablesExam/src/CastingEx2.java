
public class CastingEx2 {
	public static void main(String[] args) {
		
	//	자동형변환
//		묵시적, 명시적
		int num = 0;
		long bigNum =0;//0은 본래 int값이지만 자동 형변환 (long)이 자동으로 들어간다 ---->묵시적 자동형변환
		
		float tinyNum = (float)0.0;//직접 입력해야된다 ---->명시적 형변환
		
		//작은 것에서 큰것으로 들어가는 것은 안전하다, 자동적으로 형변환이 일어난다 --->묵시적 형변환
		//큰것이 작은 값으로 들어가는 것은 소실의 위험이 있다, 의도적으로 형변환을 해 줘야한다---->명시적 형변환
		
		//1.boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다
		//2. 기본형과 참조형은 서로 형변환 할 수 없다
		//3. 서로 다른 타입의 변수간의 연상은 형변환을 하는 것이 원칙이지만, 값의 범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다
		double d = 0.0;
		
		tinyNum = (float)0.1234567802342341;
		d = 0.153245235624573475;
		
		System.out.println(tinyNum);
		System.out.println(d);
		// 정수 실수
		//ctrl alt 키보드 다운 : 밑에 복사
		bigNum  =(long)d;
		d =bigNum; 
	}
}
