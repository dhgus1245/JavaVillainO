
public class OperatorEx {

	public static void main(String[] args) {
//������, Ŭ���ڵ�

//��Ģ������
//��� ���� �����ڴ� ������ �����ϱ� ���� 
//-ũ�Ⱑ 4byte������ �ڷ����� int ������ ��ȯ�Ѵ�
//-�ǿ����ڵ��� Ÿ���� ���� ��ġ��Ų��
//
//1. int������ ũ�Ⱑ ���� �ڷ����� int������ ����ȯ �Ŀ� ������ �����Ѵ�
//ex) byte+short->int +int -> int
//2. �� ���� �ǿ����� �� �ڷ����� ǥ�������� ū �ʿ� ���缭 ����ȯ �� �� ������ �����Ѵ�
//ex) int +float->float+float->float
//3. ������ ���� ���������� 0���� ���� ���� �����Ǿ� �ִ�
		
		
System.out.println(45/5);
//System.out.println(45/0);----->������

/*byte a =10;
byte b =20;

byte sum = (byte)(a+b);//byte a +byte b�� �ƴϴ�
System.out.println(sum);*/
	
	int a =1000000;
	int b =2000000;
	//int multiply = a*b;
	long multiply = (long)a*b;
	System.out.println(multiply);
	
	}

}
